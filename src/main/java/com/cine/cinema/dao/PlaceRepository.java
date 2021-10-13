package com.cine.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cine.cinema.entities.Place;

@RepositoryRestResource
public interface PlaceRepository  extends JpaRepository<Place,Long>{

}
