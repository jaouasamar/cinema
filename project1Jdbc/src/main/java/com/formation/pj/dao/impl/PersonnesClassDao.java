package com.formation.pj.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.formation.pj.dao.PersonnesDao;
import com.formation.pj.entity.Personnes;
import com.formation.pj.utils.ConnectionUtile;
import com.mysql.cj.protocol.Resultset;


public class PersonnesClassDao implements PersonnesDao{

	public List<Personnes> findAll() throws ClassNotFoundException, SQLException 
		{
		String sql="select * from personnes";
		PreparedStatement statement=ConnectionUtile.getInstance().getConnection().prepareStatement(sql);
		ResultSet res =statement.executeQuery();
		List <Personnes> list =new ArrayList<>();
		while(res.next()) {
			Personnes pers = new  Personnes();
			pers.setNom(res.getString(res.getString("nom")));
			pers.setPrenom(res.getString(res.getString("prenom")));
			pers.setMail(res.getString(res.getString("email")));
			list.add(pers);
			
		}
		return list;
		
		}
	

	public Personnes findById(int i) throws ClassNotFoundException, SQLException {
		String sql="select * from personnes where id = ?";
		PreparedStatement statement=ConnectionUtile.getInstance().getConnection().prepareStatement(sql);
		statement.setInt(1, i);
		ResultSet res =statement.executeQuery();
		Personnes pers = new  Personnes();
        pers.setNom(res.getString("nom"));
		pers.setPrenom(res.getString(res.getString("prenom")));
		pers.setMail(res.getString(res.getString("email")));
		return pers;
	
		
	}

	@Override
	public List<Personnes> findByNom(String nom) throws SQLException, ClassNotFoundException {
		
		String sql="select * from personnes where nom = ?";
		PreparedStatement statement=ConnectionUtile.getInstance().getConnection().prepareStatement(sql);
		statement.setString(1, nom);
		ResultSet res =statement.executeQuery();
		List <Personnes> list =new ArrayList<>();
		while(res.next()) {
			Personnes pers = new  Personnes();
			pers.setNom(res.getString("nom"));
			pers.setPrenom(res.getString("prenom"));
			pers.setMail(res.getString("email"));
			list.add(pers);
			
		}
		return list;
	
		
	}

	@Override
	public List<Personnes> findByPrenom(String prenom) throws ClassNotFoundException, SQLException {
		String sql="select * from personnes where prenom = ?";
		PreparedStatement statement=ConnectionUtile.getInstance().getConnection().prepareStatement(sql);
		statement.setString(1, prenom);
		ResultSet res =statement.executeQuery();
		List <Personnes> list =new ArrayList<>();
		while(res.next()) {
			Personnes pers = new  Personnes();
			pers.setNom(res.getString(res.getString("nom")));
			pers.setPrenom(res.getString(res.getString("prenom")));
			pers.setMail(res.getString(res.getString("email")));
			list.add(pers);
			
		}
		return list;
	
	}

	@Override
	public Personnes findByMail(String mail) throws ClassNotFoundException, SQLException {
		String sql="select * from personnes where email = ?";
		PreparedStatement statement=ConnectionUtile.getInstance().getConnection().prepareStatement(sql);
		statement.setString(1, mail);
		ResultSet res =statement.executeQuery();
		Personnes pers = new  Personnes();
		pers.setNom(res.getString("nom"));
		pers.setPrenom(res.getString("prenom"));
	
		return pers;
	}

	@Override
	public void insertPersonne(Personnes personne) throws SQLException, ClassNotFoundException {
		String sql="insert into personnes(nom,prenom,mail) values(?,?,? ))";
		PreparedStatement statement=ConnectionUtile.getInstance().getConnection().prepareStatement(sql);
		statement.setString(1,	personne.getNom() );
		statement.setString(2, personne.getPrenom());
		statement.setString(3,personne.getMail() );
		statement.executeUpdate();
	}

	@Override
	public void  updatePersonne(Personnes personne) throws ClassNotFoundException, SQLException {
		String sql="update personnes set nom=? prenom= ? email= , where id = ?";
		PreparedStatement statement=ConnectionUtile.getInstance().getConnection().prepareStatement(sql);
		statement.setString(1,	personne.getNom() );
		statement.setString(2, personne.getPrenom());
		statement.setString(3,personne.getMail() );
		statement.setString(4,personne.getId() );
		statement.executeUpdate();
		
		
	}

	public void deletePersonne(int i) throws ClassNotFoundException, SQLException {
		String sql="delete from personnes  where id =?";
		PreparedStatement statement=ConnectionUtile.getInstance().getConnection().prepareStatement(sql);
		statement.setInt(1,i);
		statement.executeUpdate();
		
		
	}
	public void deletePersonneByNom(String nom1) throws ClassNotFoundException, SQLException {
		String sql="delete from personnes  where nom =?";
		PreparedStatement statement=ConnectionUtile.getInstance().getConnection().prepareStatement(sql);
		statement.setString(1,nom1);
		statement.executeUpdate();
		
		
	}
	public void  deletePersonneByByPrenom(String prenom1) throws ClassNotFoundException, SQLException {
		String sql="delete from personnes  where prenom =?";
		PreparedStatement statement=ConnectionUtile.getInstance().getConnection().prepareStatement(sql);
		statement.setString(1,prenom1);
		statement.executeUpdate();
		
		
	}
	public void deletePersonneByMail(String  mail) throws ClassNotFoundException, SQLException {
		String sql="delete from personnes  where email =?";
		PreparedStatement statement=ConnectionUtile.getInstance().getConnection().prepareStatement(sql);
		statement.setString(1,mail);
		statement.executeUpdate();
		
		
	}


	public void deletePersonneById( int i) throws ClassNotFoundException, SQLException {
		String sql="delete from personnes  where id = i";
		PreparedStatement statement=ConnectionUtile.getInstance().getConnection().prepareStatement(sql);
		statement.setInt(1,i);
		statement.executeUpdate();
		
	
	}


	


	


	
}
