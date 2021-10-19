package com.cine.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cine.cinema.entities.Projection;

@RepositoryRestResource
@CrossOrigin("*")
public interface ProjectionRepository  extends JpaRepository<Projection,Long>{

}
