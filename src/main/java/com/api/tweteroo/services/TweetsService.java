package com.api.tweteroo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.tweteroo.dto.TweetsDTO;
import com.api.tweteroo.models.Tweets;
import com.api.tweteroo.repositories.TweetsRepository;

@Service
public class TweetsService {
    @Autowired
    private TweetsRepository repository;

    public Tweets save(TweetsDTO dto) {
        return repository.save(new Tweets(dto));
    }

    public List<Tweets> listPage(Pageable pageable) {
        return repository.findAll(pageable).getContent();
    }

    public List<Tweets> listByUsername(String username) {
        return repository.findByUsername(username);
    }
}
