package com.cine.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cine.cinema.entities.Cinema;

@RepositoryRestResource
public interface CinemaRepository extends JpaRepository<Cinema,Long>{

}
