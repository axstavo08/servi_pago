package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Suscripcion;
import com.example.demo.model.Tarjeta;
import com.example.demo.service.ServicioService;
import com.example.demo.service.SuscripcionService;

@RestController
@RequestMapping("/suscripcion")
public class SuscripcionController {

	@Autowired
	private SuscripcionService suscripcionservice;
	
	
	@PostMapping("/agregar")
	public String AgregarSuscripcion(Suscripcion suscripcion) {
		if(suscripcionservice.addSuscripcion(suscripcion)) {
    		return "ok";
    	}else {
    		return "error";
    	}
	}
	
}
