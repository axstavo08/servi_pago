package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.*;
import com.example.demo.service.EntidadService;

@RestController
@RequestMapping("/entidad")
public class EntidadController {
	
	@Autowired
	private EntidadService entidadservice;
	
	@GetMapping
	public List<Entidad> Listar() {
		List<Entidad> entidades = entidadservice.getEntidades();
		return entidades;
	}
}
