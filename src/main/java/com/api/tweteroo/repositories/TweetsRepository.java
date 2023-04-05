package com.api.tweteroo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.tweteroo.models.Tweets;

public interface TweetsRepository extends JpaRepository<Tweets, Long> {
    List<Tweets> findByUsername(String username);
}
