package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.*;
import com.example.demo.model.*;


@Service
public class ConsultaService {

	@Autowired
	private ICategoriaRepo categoriarepo;
	
	@Autowired
	private IClienteRepo clienterepo;
	
	@Autowired
	private ITarjetaRepo cuentarepo;
	
	@Autowired
	private IEntidadRepo entidadrepo;
	
	@Autowired
	private IPagoRepo pagorepo;
	
	@Autowired
	private IServicioRepo serviciorepo;
	
	public List<Cliente> getClientes(){
		return clienterepo.findAll();		
	}
	
	public List<Categoria> getCategorias(){
		return categoriarepo.findAll();		
	}
	
	public List<Tarjeta> getCuentas(){
		return cuentarepo.findAll();		
	}
	
	public List<Entidad> getEntidades(){
		return entidadrepo.findAll();		
	}
	
	public List<Pago> getPagos(){
		return pagorepo.findAll();		
	}
	
	public List<Servicio> getServicios(){
		return serviciorepo.findAll();		
	}
	
	public List<Entidad> getSuscripcionesDeCliente(Cliente cliente){
		
		return null;
	}
}
