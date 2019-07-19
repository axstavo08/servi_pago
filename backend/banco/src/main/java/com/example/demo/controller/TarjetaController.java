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
import com.example.demo.service.TarjetaService;

@RestController
@RequestMapping("/tarjeta")
public class TarjetaController {
	
	@Autowired
	private TarjetaService tarjetaservice;
	
	@GetMapping
	public List<Tarjeta> Listar(Model model) {
		List<Tarjeta> cuentas = tarjetaservice.getTarjetas();
		return cuentas;
	}
}
