package com.cine.cinema.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cine.cinema.entities.Film;
import com.cine.cinema.dao.FilmRepository;

@RestController
public class CinemaRestController {

	@Autowired
	private FilmRepository filmRepository;
	
	@GetMapping("/listFilms")
	public List<Film> films(){
		return filmRepository.findAll();
	}
	
}
