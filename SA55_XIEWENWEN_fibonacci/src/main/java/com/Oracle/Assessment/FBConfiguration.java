package com.Oracle.Assessment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.constraints.NotEmpty;

public class FBConfiguration extends Configuration {

    private Integer defaultElementNum= 0;

    @JsonProperty
    public Integer getDefaultElementNum() {
        return defaultElementNum;
    }
    @JsonProperty
    public void setDefaultElementNum(Integer defaultElementNum) {
        this.defaultElementNum = defaultElementNum;
    }
}
