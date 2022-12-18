package com.Oracle.Assessment.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class FBSequence {
    private ArrayList<Integer> fibonacci;
    private ArrayList<Integer> sort;

    public FBSequence() {
    }

    public FBSequence(ArrayList<Integer> fibonacci, ArrayList<Integer> sort) {
        this.fibonacci = fibonacci;
        this.sort = sort;
    }

    @JsonProperty
    public ArrayList<Integer> getFibonacci() {
        return fibonacci;
    }

    @JsonProperty
    public ArrayList<Integer> getSort() {
        return sort;
    }

}
