package com.cine.cinema.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Categorie {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 
	private String name;
	@OneToMany(mappedBy="categorie")
	private Collection<Film> film;
}
