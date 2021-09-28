package com.example.test2.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.test2.entities.Personne;
import com.example.test2.reposotory.PersnneReposotory;
import com.example.test2.services.PersonnesServices;

@Service
public class PersonnesServicesImpl implements PersonnesServices {
	
	@Autowired
	private PersnneReposotory re;

	@Override
	public Boolean save(Personne s) {
		
		if( re.existsByEmail(s.getEmail())) 
		{
			return false;
		}
		re.save(s);
		return true;
		
	}

	@Override
	public Boolean delete(Integer id) {
		// TODO Auto-generated method stub
		if(re.existsById(id))
		{
		re.deleteById(id);
		return true;
		}
		return false;
		
	}

	@Override
	public Boolean update(Personne p) {
		// TODO Auto-generated method stub
	if(re.existsByEmail(p.getEmail()))
	{
		return false;
	}
	re.save(p);
	return true;
	}

	@Override
	public Personne getById(Integer id) {
		return re.findById(id).orElse(null);
	}

	@Override
	public Personne getByMail(String mail) {
		 return re.getbyemail(mail);
	}

	@Override
	public List<Personne> getAll() {
		 return re.findAll();
	}
	
	

}
