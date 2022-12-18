package com.Oracle.Assessment.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FBRequest {
    private Integer element=0;

    public FBRequest() {
    }

    public FBRequest(Integer element){
        this.element = element;
    }
    @JsonProperty
    public Integer getElement() {
        return element;
    }
}
