package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

public class ServicioDto {
			
	private int id_servicio;
	
	private String nombre_servicio;
	
	private String ruc;
	
	private float monto;
	
	private EntidadDto entidad;
	
	private SuscripcionDto suscripcion;
	
	private List<PagoDto> pagos = new ArrayList<PagoDto>();
	
	public ServicioDto() {}
	
	public ServicioDto(int id,String nombre, String ruc,float monto,EntidadDto entidad, SuscripcionDto suscripcion,List<PagoDto> pagos) {
		this.id_servicio = id;
		this.nombre_servicio = nombre;
		this.ruc = ruc;
		this.monto = monto;
		this.entidad = entidad;
		this.suscripcion = suscripcion;
		this.pagos = pagos;
	}
	
	public int getId_servicio() {
		return id_servicio;
	}
	public void setId_servicio(int id_servicio) {
		this.id_servicio = id_servicio;
	}
	public String getNombre_servicio() {
		return nombre_servicio;
	}
	public void setNombre_servicio(String nombre_servicio) {
		this.nombre_servicio = nombre_servicio;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	public EntidadDto getEntidad() {
		return entidad;
	}
	public List<PagoDto> getPagos() {
		return pagos;
	}
	
	public SuscripcionDto getSuscripcion() {
		return suscripcion;
	}

	public void setEntidad(EntidadDto entidad) {
		this.entidad = entidad;
	}

	public void setSuscripcion(SuscripcionDto suscripcion) {
		this.suscripcion = suscripcion;
	}

	public void setPagos(List<PagoDto> pagos) {
		this.pagos = pagos;
	}
	
}
