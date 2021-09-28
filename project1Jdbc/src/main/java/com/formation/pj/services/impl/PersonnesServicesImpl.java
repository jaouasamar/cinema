package com.formation.pj.services.impl;

import java.sql.SQLException;
import java.util.List;

import com.formation.pj.dao.PersonnesDao;
import com.formation.pj.dao.impl.PersonnesClassDao;
import com.formation.pj.entity.Personnes;
import com.formation.pj.services.PersonnesServices;
import com.formation.pj.utils.MessageRes;

public class PersonnesServicesImpl implements PersonnesServices{

	private PersonnesDao daObject = new PersonnesClassDao();
	@Override
	public MessageRes save(Personnes pers) throws ClassNotFoundException, SQLException {
		if(daObject.findByMail(pers.getMail()) != null)
		{
			return new MessageRes(false,"Email existant");
		}
		daObject.insertPersonne(pers);
		
		return new MessageRes(true,"Utilisateur crée avec success");
	}

	@Override
	public List<Personnes> findAll() throws ClassNotFoundException, SQLException {
		return daObject.findAll();
	}

	@Override
	public Personnes findById(int id) throws ClassNotFoundException, SQLException {
		return daObject.findById(id);
	}

	@Override
	public List<Personnes> findByNom(String nom) throws SQLException, ClassNotFoundException {
		return daObject.findByNom(nom);
	}

	@Override
	public List<Personnes> findByPrenom(String prenom) throws ClassNotFoundException, SQLException {
		return daObject.findByPrenom(prenom);
	}

	@Override
	public Personnes findByMail(String mail) throws ClassNotFoundException, SQLException {
		return daObject.findByMail(mail);
	}

	@Override
	public MessageRes deletePersonneById(int i) throws ClassNotFoundException, SQLException {
		if(daObject.findById(i)!= null )
			
		 {
			daObject.deletePersonneById(i);
			 return new MessageRes(true,"Utilisateur supprimé");
		 }
		
		 return new MessageRes(false,"Utilisateur non trouvé");
	}

	@Override
	public  MessageRes deletePersonneByNom(String nom1) throws ClassNotFoundException, SQLException {
		if(daObject.findByNom(nom1)!= null )
			
		 {
			daObject.deletePersonneByNom(nom1);
			 return new MessageRes(true,"Utilisateur supprimé");
		 }
		
		 return new MessageRes(false,"Utilisateur non trouvé");
		
	}

	@Override
	public MessageRes deletePersonneByByPrenom(String prenom1) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		if(daObject.findByPrenom(prenom1)!= null )
			
		 {
			daObject.deletePersonneByByPrenom(prenom1);
			 return new MessageRes(true,"Utilisateur supprimé");
		 }
		
		 return new MessageRes(false,"Utilisateur non trouvé");
	}

	@Override
	public MessageRes deletePersonneByMail(String mail) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		if(daObject.findByMail(mail)!= null )
			
		 {
			daObject.deletePersonneByMail(mail);
			 return new MessageRes(true,"Utilisateur supprimé");
		 }
		
		 return new MessageRes(false,"Utilisateur non trouvé");
	}

	@Override
	public MessageRes updatePersonne(Personnes personne) throws ClassNotFoundException, SQLException {
		
		if(daObject.findByMail(personne.getMail()) != null)
		{
			return new MessageRes(false,"Email existant");
		}
		daObject.updatePersonne(personne);
		
		return new MessageRes(true,"Utilisateur mis à jour avec success");
	}

}
