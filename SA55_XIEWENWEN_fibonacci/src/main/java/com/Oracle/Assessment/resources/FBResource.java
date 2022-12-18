package com.Oracle.Assessment.resources;

import com.Oracle.Assessment.api.FBRequest;
import com.Oracle.Assessment.api.FBSequence;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Path("/fibonacci")
@Produces(MediaType.APPLICATION_JSON)
public class FBResource {
    private final Integer defaultElementNum;
    private final AtomicLong counter;

    public FBResource(Integer defaultElementNum) {
        this.defaultElementNum = defaultElementNum;
        this.counter = new AtomicLong();
    }

    private ArrayList<Integer> CalculateFibonacci(Integer eleNum)
    {
        ArrayList<Integer> retval=new ArrayList<Integer> ();
        if(eleNum == 0) return retval;
        retval.add(0, 0);
        if(eleNum == 1) return retval;
        retval.add(1, 1);
        if(eleNum == 2) return retval;
        for(Integer i=2;i<eleNum;i++)
        {
            int temp=0;
            temp=retval.get(i-1)+retval.get(i-2);
            retval.add(i,temp);
        }
        return retval;
    }

    private ArrayList<Integer> CalculatePartialSortedFibonacci(ArrayList<Integer> fibonacciSeq)
    {
        ArrayList<Integer>evenNum=new ArrayList<Integer>();
        ArrayList<Integer>oddNum=new ArrayList<Integer>();

        for(Integer i = fibonacciSeq.size() - 1; i >=0; i--)
        {
            Integer elm = fibonacciSeq.get(i);
            if(elm%2==0)
            {
                evenNum.add(elm);
            }
            else
            {
                oddNum.add(elm);
            }
        }
        evenNum.addAll(oddNum); //even number first
        return evenNum;
    }

    @POST
    @Timed
    public FBSequence getFBSequenceWithJSON(FBRequest fbRequest)
    {
        final Integer value = fbRequest.getElements();
        //calculate codes
        ArrayList<Integer> fbSeq = CalculateFibonacci(value);
        ArrayList<Integer> partialSortedFbSeq = CalculatePartialSortedFibonacci(fbSeq);
        return new FBSequence(fbSeq, partialSortedFbSeq);
    }

}