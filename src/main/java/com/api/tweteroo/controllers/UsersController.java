package com.api.tweteroo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.tweteroo.dto.UsersDTO;
import com.api.tweteroo.services.UsersService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sign-up")
public class UsersController {
    @Autowired
    private UsersService service;

    @PostMapping
    public void create(@RequestBody @Valid UsersDTO req) {
        service.save(req);
    }

}
