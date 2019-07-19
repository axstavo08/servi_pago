package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.*;
import com.example.demo.dto.*;
import com.example.demo.repository.IServicioRepo;

@Service
public class ServicioService {
	
	@Autowired
	private IServicioRepo serviciorepo;
	
	public List<Servicio> getServicios(){
		return serviciorepo.findAll();
	}
	
	public boolean addServicio(Servicio servicio) {
		Servicio s = serviciorepo.save(servicio);
		return s != null;
	}
	
}
