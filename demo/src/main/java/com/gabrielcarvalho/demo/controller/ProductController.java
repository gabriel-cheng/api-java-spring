package com.gabrielcarvalho.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielcarvalho.demo.entities.Departments;

// Cria esta annotation e aperta CTRL + SHIFT + O para importar a classe.
// Esta annotation serve para configurar uma classe.
@RestController

// Annotation que cria a endpoint products
@RequestMapping(value = "/products")
public class ProductController {
	
	@GetMapping
	public Departments getObjects() {
		Departments d1 = new Departments();
		d1.setId(1L);
		d1.setName("Braia guei");
		
		return d1;
	}
}
