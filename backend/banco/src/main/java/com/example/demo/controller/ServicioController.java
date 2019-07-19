package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.model.Servicio;
import com.example.demo.service.ConsultaService;

@RestController
@RequestMapping("/servicio")
public class ServicioController {
	@Autowired
	private ConsultaService consulta;
	
	@GetMapping()
	public String Listar(Model model) {
		List<Servicio> servicios = consulta.getServicios();
		model.addAttribute("servicios",servicios);
		return "servicio/index";
	}
}
