package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.tuple.GeneratedValueGeneration;

import lombok.Data;


@Entity
public class Categories {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCat;
	private String nomCat;
	private String descriptionCat;
	private boolean disponible;
	public Integer getIdCat() {
		return idCat;
	}
	public void setIdCat(Integer idCat) {
		this.idCat = idCat;
	}
	public String getNomCat() {
		return nomCat;
	}
	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
	public String getDescriptionCat() {
		return descriptionCat;
	}
	public void setDescriptionCat(String descriptionCat) {
		this.descriptionCat = descriptionCat;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	

}
