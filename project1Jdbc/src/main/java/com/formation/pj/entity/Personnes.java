package com.formation.pj.entity;

import java.io.Serializable;

public class Personnes implements Serializable{
	private Integer id;
	private String nom;
	private String prenom;
	private String mail;
	
	public String getId() {
		return id.toString();
	}
	public void setId(int id) {
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	

}
