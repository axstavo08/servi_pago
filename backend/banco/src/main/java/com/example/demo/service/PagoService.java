package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.*;
import com.example.demo.dto.*;
import com.example.demo.repository.IPagoRepo;

@Service
public class PagoService {
	
	@Autowired
	private IPagoRepo pagorepo;
	
	public List<Pago> getPagos(){
		return pagorepo.findAll();
	}
	
	public boolean addPago(Pago pago) {
		Pago p = pagorepo.save(pago);
		return p != null;
	}
}
