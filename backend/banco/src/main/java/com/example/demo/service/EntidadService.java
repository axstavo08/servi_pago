package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.*;
import com.example.demo.dto.*;

import com.example.demo.repository.IEntidadRepo;

@Service
public class EntidadService {

	@Autowired
	private IEntidadRepo entidadrepo;
	
	public List<Entidad> getEntidades(){
		return entidadrepo.findAll();
	}
	
	public boolean addEntidad(Entidad entidad) {
		Entidad e = entidadrepo.save(entidad);
		return e != null;
	}
}
