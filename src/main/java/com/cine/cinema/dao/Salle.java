package com.cine.cinema.dao;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Salle implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int nombrePlaces;
	@ManyToOne
	private Cinema cinema;
	@OneToMany(mappedBy="salle")
	private Collection<Place>place;
	@OneToMany(mappedBy="salle")
	private Collection<Projection> projections;
	
	

}
