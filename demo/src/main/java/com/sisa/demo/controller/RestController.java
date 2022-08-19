package com.sisa.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping
	public String saludo(String nombre) {
		return "Hola " + nombre;
	}

}
