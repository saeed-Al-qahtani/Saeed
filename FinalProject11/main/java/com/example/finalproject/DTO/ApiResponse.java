package com.example.finalproject.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;


    @AllArgsConstructor
    @Data
    public class ApiResponse {

        private String message;
        private Integer status;
    }

