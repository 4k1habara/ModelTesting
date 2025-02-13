package com.skypro.unit_testing_hw.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotEnoughArgumentsException extends IllegalArgumentException {
    public NotEnoughArgumentsException() {
    }

    public NotEnoughArgumentsException(String s) {
        super(s);
    }

    public NotEnoughArgumentsException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughArgumentsException(Throwable cause) {
        super(cause);
    }
}
