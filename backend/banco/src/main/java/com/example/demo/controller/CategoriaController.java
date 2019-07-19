package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Categoria;
import com.example.demo.model.Entidad;
import com.example.demo.service.ConsultaService;
import com.example.demo.service.PersistenciaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private ConsultaService consulta;
	
	@Autowired
	private PersistenciaService persistencia;
	/*
	@GetMapping
	public String Listar(Model model) {
		List<Categoria> categorias = consulta.getCategorias();
		model.addAttribute("categorias",categorias);
		return "categoria/index";
	}*/
	@GetMapping
	public String Listar(Model model) {
		return "sapo";

	}
	
	/*@GetMapping("/index")
	public String Index(Model model) {
		return Listar(model);
	}
	
	
	@GetMapping("/agregar")
	public String VistaAgregar(Model model) {
		model.addAttribute("categoria",new Categoria());
		return "categoria/agregar";
	}
	
	@PostMapping("/agregar")
	public String Agregar(Categoria categoria,Model model) {
		persistencia.RegistrarCategoria(categoria);
		return Listar(model);
	}*/
	
}
