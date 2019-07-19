package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pago;
import com.example.demo.model.Suscripcion;
import com.example.demo.repository.ISuscripcionRepo;

@Service
public class SuscripcionService {
	
	@Autowired
	private ISuscripcionRepo suscripcionrepo;
	
	public List<Suscripcion> getSuscripciones(){
		return suscripcionrepo.findAll();
	}
	
	public boolean addSuscripcion(Suscripcion suscripcion) {
		Suscripcion s = suscripcionrepo.save(suscripcion);
		return s != null;
	}
	
}
