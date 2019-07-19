package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

public class EntidadDto {
	
	private String ruc;
	
	private String nombre_entidad;
	
	private String telefono;
		
	private List<ServicioDto> servicios = new ArrayList<ServicioDto>();
	
	public EntidadDto() {}
	
	public EntidadDto(String ruc,String nombre,String telefono) {
		this.ruc = ruc;
		this.nombre_entidad = nombre;
		this.telefono = telefono;
	}
	
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getNombre() {
		return nombre_entidad;
	}
	public void setNombre(String nombre) {
		this.nombre_entidad = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
