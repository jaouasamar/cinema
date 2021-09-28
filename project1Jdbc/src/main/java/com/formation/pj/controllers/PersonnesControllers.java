package com.formation.pj.controllers;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.formation.pj.entity.Personnes;
import com.formation.pj.services.PersonnesServices;
import com.formation.pj.services.impl.PersonnesServicesImpl;
import com.formation.pj.utils.MessageRes;

@Path("/personnes")
public class PersonnesControllers {
	
PersonnesServices pers = new PersonnesServicesImpl();
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Personnes> getAll() throws ClassNotFoundException, SQLException{
	
	System.out.println("Hello");
	return pers.findAll();
}

	
}
