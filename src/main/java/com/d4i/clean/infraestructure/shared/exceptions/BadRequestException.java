package com.d4i.clean.infraestructure.shared.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.io.Serial;


@Getter
@Setter
public class BadRequestException extends NetflixException {

    @Serial
    private static final long serialVersionUID = -5330068136795055851L;

    public BadRequestException(String message) {
        super(HttpStatus.BAD_REQUEST.value(), message);
    }

}
