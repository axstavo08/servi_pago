package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.model.Tarjeta;
import com.example.demo.service.ConsultaService;

@RestController
@RequestMapping("/cuenta")
public class TarjetaController {
	
	@Autowired
	private ConsultaService consulta;
	
	@GetMapping
	public List<Tarjeta> Listar(Model model) {
		List<Tarjeta> cuentas = consulta.getCuentas();
		return cuentas;
	}
}
