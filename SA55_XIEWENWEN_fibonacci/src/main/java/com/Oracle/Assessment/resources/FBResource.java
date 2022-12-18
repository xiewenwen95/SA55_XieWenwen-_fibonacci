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

    @POST
    @Timed
    public FBSequence getFBSequenceWithJSON(FBRequest fbRequest)
    {
        final Integer value = fbRequest.getElement();
        //calculate codes
        ArrayList<Integer> test1=new ArrayList<Integer> (Arrays.asList(new Integer[value]));
        ArrayList<Integer> sort1=new ArrayList<Integer>(Arrays.asList(new Integer[value]));
        return new FBSequence(test1,sort1);
    }

}