package com.formation.pj.dao;
import java.sql.SQLException;
import java.util.List;
import java.util.List;

import com.formation.pj.entity.Personnes;



public interface PersonnesDao {

	public List<Personnes>findAll() throws ClassNotFoundException, SQLException;
	public Personnes findById(int id) throws ClassNotFoundException, SQLException ;
	public List<Personnes> findByNom(String nom) throws SQLException, ClassNotFoundException;
	public List<Personnes> findByPrenom(String prenom) throws ClassNotFoundException, SQLException;
	public Personnes findByMail(String mail) throws ClassNotFoundException, SQLException;
	public void insertPersonne(Personnes personne) throws SQLException, ClassNotFoundException;
	public void updatePersonne(Personnes personne) throws ClassNotFoundException, SQLException;
	public void deletePersonneById(int i) throws ClassNotFoundException, SQLException ;
	public void deletePersonneByNom(String nom1) throws ClassNotFoundException, SQLException;
	public void deletePersonneByByPrenom(String prenom1) throws ClassNotFoundException, SQLException ;
	public void deletePersonneByMail(String  mail) throws ClassNotFoundException, SQLException ;
	

}
