package com.api.tweteroo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.tweteroo.dto.TweetsDTO;
import com.api.tweteroo.models.Tweets;
import com.api.tweteroo.services.TweetsService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class TweetsController {
    @Autowired
    private TweetsService service;
    
    @PostMapping
    public void create(@RequestBody @Valid TweetsDTO req) {
        service.save(req);
    }

    @GetMapping
    public List<Tweets> listAll(){
        return service.findAll();
    }

    @GetMapping("/{username}")
    public List<Tweets> listByUsername(@PathVariable String username){
        return service.listByUsername(username);
    }
}
