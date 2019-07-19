package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.*;
import com.example.demo.dto.*;

import com.example.demo.repository.ITarjetaRepo;

@Service
public class TarjetaService {
	
	@Autowired
	private ITarjetaRepo tarjetarepo;
	
	public List<Tarjeta> getTarjetas(){
		return tarjetarepo.findAll();
	}
}
