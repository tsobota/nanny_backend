package com.nanny.backend;

import javassist.NotFoundException;
import org.springframework.web.client.HttpClientErrorException;

public class RestPreconditions {
    public static <T> T checkFound(T resource) throws NotFoundException {
        if (resource == null) {
            throw new NotFoundException("user not found");
        }
        return resource;
    }
}
