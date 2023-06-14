package com.gabrielcarvalho.demo.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielcarvalho.demo.entities.Departments;
import com.gabrielcarvalho.demo.entities.Products;

// Cria esta annotation e aperta CTRL + SHIFT + O para importar a classe.
// Esta annotation serve para configurar uma classe.
@RestController

// Annotation que cria a endpoint products
@RequestMapping(value = "/products")
public class ProductController {
	
	@GetMapping
	public List<Products> getObjects() {
		Departments d1 = new Departments(1, "Notebook");
		Departments d2 = new Departments(2, "Celular");
		Departments d3 = new Departments(3, "Console");		
		
		Products p1 = new Products(1, "Macbook Pro", 4.0555, d1);
		Products p2 = new Products(2, "Iphone 7", 3.022, d2);
		Products p3 = new Products(3, "Playstation 5", 4.000, d3);
		Products p4 = new Products(4, "Samsung Galaxy A21", 3.000, d2);

		List<Products> list = Arrays.asList(p1, p2, p3, p4);
		
		System.out.println("Funcionando!");		
		return list;
	}
	
	@GetMapping("/param")
	@ResponseBody
	public BigDecimal getDecimal(@RequestParam double param) {
		BigDecimal value = new BigDecimal(param).setScale(3, RoundingMode.HALF_UP);
		
		System.out.println(value);
		return value;
	}
}
