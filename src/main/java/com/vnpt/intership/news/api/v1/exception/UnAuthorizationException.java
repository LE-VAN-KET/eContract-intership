package com.vnpt.intership.news.api.v1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnAuthorizationException extends RuntimeException{
    public UnAuthorizationException(String message) {
        super(message);
    }
}
