package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.example.demo.model.Tarjeta;

public class PagoDto {

	private int id_pago;
	
	private int id_servicio;
	
	private String numero_tarjeta;
	
	private TarjetaDto tarjeta;
	
	private ServicioDto servicio;
	
	public PagoDto() {}
	
	public PagoDto(int id_pago,int id_servicio,String numero,Tarjeta tarjeta,ServicioDto servicio) {
		this.id_pago = id_pago;
		this.id_servicio = id_servicio;
		this.numero_tarjeta = numero;
		this.servicio = servicio;
	}
	
	public int getId_pago() {
		return id_pago;
	}
	public void setId_pago(int id_pago) {
		this.id_pago = id_pago;
	}
	public int getId_servicio() {
		return id_servicio;
	}
	public void setId_servicio(int id_servicio) {
		this.id_servicio = id_servicio;
	}
	public String getNumero_tarjeta() {
		return numero_tarjeta;
	}
	public void setNumero_tarjeta(String numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}
	public TarjetaDto getTarjeta() {
		return tarjeta;
	}
	public ServicioDto getServicio() {
		return servicio;
	}

	public void setTarjeta(TarjetaDto tarjeta) {
		this.tarjeta = tarjeta;
	}

	public void setServicio(ServicioDto servicio) {
		this.servicio = servicio;
	}
	
	
}
