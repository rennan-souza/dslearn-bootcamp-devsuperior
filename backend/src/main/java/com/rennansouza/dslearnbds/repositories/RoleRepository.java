package com.rennansouza.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rennansouza.dslearnbds.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
