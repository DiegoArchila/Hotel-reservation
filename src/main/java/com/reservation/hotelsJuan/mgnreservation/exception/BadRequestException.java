package com.reservation.hotelsJuan.mgnreservation.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;

@ResponseStatus(value= HttpStatus.BAD_REQUEST)
public class BadRequestException  extends RuntimeException {

    public BadRequestException() {
        super();
    }
    private String value;
    private String message;

    public BadRequestException(String value, String message) {
        this.value = value;
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return this.message;
    }

}
