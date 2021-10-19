package com.cine.cinema.web;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cine.cinema.entities.Film;
import com.cine.cinema.entities.Ticket;

import lombok.Data;

import org.springframework.web.bind.annotation.PathVariable;
import com.cine.cinema.dao.FilmRepository;
import com.cine.cinema.dao.TicketRepository;

@RestController
@CrossOrigin("*")

public class CinemaRestController {

	@Autowired
	private FilmRepository filmRepository;
	@Autowired 
	private TicketRepository ticketrepository;
	
	@GetMapping(path="/imageFilm/{id}",produces=MediaType.IMAGE_JPEG_VALUE)
	public byte[] image(@PathVariable (name="id")Long id)throws Exception{
		
		Film f=filmRepository.findById(id).get();
		String photoName= f.getPhoto();
		File file = new File(System.getProperty("user.home")+"/cinema/images/"+photoName);
		Path path= Paths.get(file.toURI());
		return Files.readAllBytes(path);
	
	}

	@PostMapping("/payerTicket")
	@Transactional
	public List<Ticket> payerTickets(@RequestBody TicketFrom ticketFrom){
		List<Ticket> listTickets= new ArrayList<>();
		ticketFrom.getTickets().forEach(idTicket->{
			
			//System.out.println(idTicket);
			Ticket ticket = ticketrepository.findById(idTicket).get();
			ticket.setNomClient(ticketFrom.getNomClient());
			ticket.setCodePayement(ticketFrom.getCodePayement());
			ticket.setReserve(true);
			ticketrepository.save(ticket);
			listTickets.add(ticket);
		});
		return listTickets;
		
	}
}
	
	@Data
	class TicketFrom {
		private String nomClient;
		private int codePayement;
		private List<Long> tickets= new ArrayList<>();
	}

