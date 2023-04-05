package com.api.tweteroo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.tweteroo.models.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
