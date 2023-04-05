package com.api.tweteroo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.tweteroo.models.Tweets;

public interface TweetsRepository extends JpaRepository<Tweets, Long> {

}
