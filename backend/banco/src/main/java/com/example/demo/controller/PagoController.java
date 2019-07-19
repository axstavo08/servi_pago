package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.model.Pago;
import com.example.demo.service.EntidadService;
import com.example.demo.service.PagoService;

@RestController
@RequestMapping("/pago")
public class PagoController {

	@Autowired
	private PagoService pagoservice;
	
	@GetMapping()
	public List<Pago> Listar(Model model) {
		List<Pago> pagos = pagoservice.getPagos();
		return pagos;
	}
}
