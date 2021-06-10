package com.rennansouza.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rennansouza.dslearnbds.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
