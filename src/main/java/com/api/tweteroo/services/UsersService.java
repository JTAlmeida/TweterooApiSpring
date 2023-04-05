package com.api.tweteroo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.tweteroo.dto.UsersDTO;
import com.api.tweteroo.models.Users;
import com.api.tweteroo.repositories.UsersRepository;

@Service
public class UsersService {

    @Autowired
    private UsersRepository repository;

    public Users save(UsersDTO dto) {
        return repository.save(new Users(dto));
    }
}
