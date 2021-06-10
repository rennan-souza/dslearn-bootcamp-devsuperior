package com.rennansouza.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rennansouza.dslearnbds.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
