package com.rennansouza.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rennansouza.dslearnbds.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
