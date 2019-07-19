package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Categoria;
import com.example.demo.model.Cliente;
import com.example.demo.model.Tarjeta;
import com.example.demo.model.Entidad;
import com.example.demo.model.Pago;
import com.example.demo.model.Servicio;
import com.example.demo.repository.ICategoriaRepo;
import com.example.demo.repository.IClienteRepo;
import com.example.demo.repository.ITarjetaRepo;
import com.example.demo.repository.IEntidadRepo;
import com.example.demo.repository.IPagoRepo;
import com.example.demo.repository.IServicioRepo;

@Service
public class PersistenciaService {

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
	
	public void RegistrarCategoria(Categoria categoria) {
		categoriarepo.save(categoria);
	}
	
	public void RegistrarCliente(Cliente cliente) {
		clienterepo.save(cliente);
	}
	
	public void RegistrarCuenta(Tarjeta cuenta) {
		cuentarepo.save(cuenta);
	}
	
	public void RegistrarEntidad(Entidad entidad) {
		entidadrepo.save(entidad);
	}
	
	public void RegistrarPago(Pago pago) {
		pagorepo.save(pago);
	}
	
	public void RegistrarServicio(Servicio servicio) {
		serviciorepo.save(servicio);
	}
}
