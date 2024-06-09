package com.tobeto.java4a.hotelnow.services.dtos.responses.responsemodels;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ResponseModel<T> {
    private int statusCode;
    private String statusMessage;
    private T result;
}
