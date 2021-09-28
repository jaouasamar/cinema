package com.example.test2.entities;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Personne {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String nom;
private String prenom;
@Temporal(TemporalType.DATE)
private Date dateCreation;
private String email;

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}



}