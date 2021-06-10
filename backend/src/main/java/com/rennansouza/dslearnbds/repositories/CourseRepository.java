package com.rennansouza.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rennansouza.dslearnbds.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
