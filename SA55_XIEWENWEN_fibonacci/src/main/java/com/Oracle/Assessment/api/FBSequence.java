package com.Oracle.Assessment.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class FBSequence {
    private ArrayList<Integer> fibonacci;
    private ArrayList<Integer> sorted;

    public FBSequence() {
    }

    public FBSequence(ArrayList<Integer> fibonacci, ArrayList<Integer> sorted) {
        this.fibonacci = fibonacci;
        this.sorted = sorted;
    }

    @JsonProperty
    public ArrayList<Integer> getFibonacci() {
        return fibonacci;
    }

    @JsonProperty
    public ArrayList<Integer> getSorted() {
        return sorted;
    }

}
