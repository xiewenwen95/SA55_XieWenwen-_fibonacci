package com.Oracle.Assessment.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FBRequest {
    private Integer elements=0;

    public FBRequest() {
    }

    public FBRequest(Integer elements){
        this.elements = elements;
    }
    @JsonProperty
    public Integer getElements() {
        return elements;
    }
}
