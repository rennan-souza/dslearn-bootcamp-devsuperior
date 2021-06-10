package com.rennansouza.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rennansouza.dslearnbds.entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
