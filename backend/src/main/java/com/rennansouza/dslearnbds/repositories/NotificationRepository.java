package com.rennansouza.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rennansouza.dslearnbds.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
