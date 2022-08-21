package com.sisa.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.Api;

@Api(tags = "SISA API")
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/sisa")
public class RestController {

	@GetMapping
	public String saludo() {
		return "Hola Mundo SISA";
	}

}
