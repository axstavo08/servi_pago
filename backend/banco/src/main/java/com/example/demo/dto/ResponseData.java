/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 *
 * @author Gustavo Ramos M.
 */
public class ResponseData {
    
    String message;
    @JsonProperty("_data")
    Object data;

    public ResponseData(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public ResponseData(Object data) {
        this.data = data;
    }
}
