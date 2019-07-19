package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.model.Servicio;
import com.example.demo.model.Suscripcion;
import com.example.demo.service.PagoService;
import com.example.demo.service.ServicioService;

@RestController
@RequestMapping("/servicio")
public class ServicioController {

	@Autowired
	private ServicioService servicioservice;
	
	@GetMapping()
	public List<Servicio> Listar(Model model) {
		List<Servicio> servicios = servicioservice.getServicios();
		return servicios;
	}
	
	@PostMapping("/agregar")
	public String AgregarServicio(Servicio servicio) {
		if(servicioservice.addServicio(servicio)) {
    		return "ok";
    	}else {
    		return "error";
    	}
	}
	
	
}
