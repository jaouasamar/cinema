package com.example.test2.services;

import java.util.List;

import com.example.test2.entities.Personne;

public interface PersonnesServices  {
	
	public Boolean save(Personne p);
	public Boolean delete(Integer id);
	public Boolean update(Personne p);
	public Personne getById(Integer id);
	public Personne getByMail(String mail);
	public List<Personne> getAll();
	
	
}