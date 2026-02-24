package com.d4i.clean.core.category.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import com.d4i.clean.infraestructure.shared.exceptions.NetflixException;

import java.io.Serial;


@Getter
@Setter
public class CategoryAlreadyExistException extends NetflixException {

    @Serial
    private static final long serialVersionUID = -5330068136795055851L;

    public CategoryAlreadyExistException(String message) {
        super(HttpStatus.BAD_REQUEST.value(), message);
    }


}
