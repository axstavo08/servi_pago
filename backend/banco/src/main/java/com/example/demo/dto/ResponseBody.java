/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Gustavo Ramos M.
 */
public class ResponseBody {

    private Integer codeError;
    @JsonProperty("responseData")
    private ResponseData ResponseData;

    public ResponseBody(Integer codeError, ResponseData ResponseData) {
        this.codeError = codeError;
        this.ResponseData = ResponseData;
    }

    public ResponseBody(ResponseData ResponseData) {
        this.ResponseData = ResponseData;
    }

    public Integer getError() {
        return codeError;
    }

    public void setError(Integer codeError) {
        this.codeError = codeError;
    }

    public ResponseData getResponseData() {
        return ResponseData;
    }

    public void setResponseData(ResponseData ResponseData) {
        this.ResponseData = ResponseData;
    }
}
