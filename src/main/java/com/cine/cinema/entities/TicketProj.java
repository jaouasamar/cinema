package com.cine.cinema.entities;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="ticketProj" ,types=Ticket.class)
public interface TicketProj {

	public Long getId();
	public String getNomClient();
	public double getPrix();
	public Integer getCodePayement();
	public boolean getReserve();
	public Place getPlace();
	
	
}
