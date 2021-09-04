package com.java.examples.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@GetMapping
	public String home() {
		return "Yup, this app is running";
	}

}
