package com.nanny.backend.controllers;

import com.nanny.backend.RestPreconditions;
import com.nanny.backend.domain.User;
import com.nanny.backend.service.UserService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;


@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Iterable<User> findAll() {
        return userService.findAll();
    }

    @GetMapping(value = "/{email}")
    public User findByEmail(@PathVariable("email") String email) throws NotFoundException {
        return RestPreconditions.checkFound(userService.getUserByEmail(email));
    }

/*    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody User newUser) {
        RestPreconditions.checkNotNull(newUser);
        return userService.createUser(newUser);
    }*/
}