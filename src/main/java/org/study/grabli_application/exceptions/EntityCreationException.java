package org.study.grabli_application.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EntityCreationException extends RuntimeException {
    public EntityCreationException(String message) {
        super(message);
    }
}
