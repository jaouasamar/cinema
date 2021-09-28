package com.example.demo.cont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCont {
	@GetMapping
	public String getAll(){
		return "helloooo from..." ;
		
	}
}
