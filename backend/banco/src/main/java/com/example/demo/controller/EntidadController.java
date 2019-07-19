package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.model.Entidad;
import com.example.demo.service.ConsultaService;

@RestController
@RequestMapping("/entidad")
public class EntidadController {
	
	@Autowired
	private ConsultaService consulta;
	
	@GetMapping
	public String Listar(Model model) {
		List<Entidad> entidades = consulta.getEntidades();
		model.addAttribute("entidades",entidades);
		return "entidad/index";
	}
}
