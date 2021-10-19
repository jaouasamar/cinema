package com.cine.cinema.entities;

import java.util.Collection;
import java.util.Date;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.web.bind.annotation.CrossOrigin;

@Projection(name="p1",types= {com.cine.cinema.entities.Projection.class})

public interface ProjectionProj {
 public long getId();
 public double getPrix();
 public Date getDateProjection();
 public Salle getSalle();
 public Film getfilm();
 public Seance getSeance();
 public Collection<Ticket> getTickets();
 
 
}
