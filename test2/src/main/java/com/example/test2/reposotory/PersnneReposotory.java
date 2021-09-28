package com.example.test2.reposotory;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.test2.entities.Personne;

public interface PersnneReposotory extends JpaRepository<Personne, Integer>{
	
	public List<Personne> findByNom(Personne p);
	public List<Personne> findByDateCreationBetween(Date d1,Date d2);
	@Transactional
	@Modifying
	@Query("select p1 from Personne  p1  where p1.email=:mail")
	public Personne getbyemail(String mail);
	public boolean existsByEmail(String email);
	
}
