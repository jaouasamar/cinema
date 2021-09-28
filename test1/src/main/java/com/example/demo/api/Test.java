package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class Test {
	@GetMapping("/{var}")
	public String AfficheNom(@PathVariable("var")String nom) {
		return("Hello "+ nom);
	}

}
