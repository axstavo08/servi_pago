package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="pago")
public class PagoDto {

	@Id
	@GeneratedValue
	private int id_pago;
	
	@Column(name="id_servicio")
	@NotNull
	private int id_servicio;
	
	@Column(name="numero_tarjeta",length=16)
	@NotNull
	private String numero_tarjeta;
	
	@ManyToOne
	private TarjetaDto cuenta;
	
	@ManyToOne
	private ServicioDto servicio;
	
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
	public TarjetaDto getCuenta() {
		return cuenta;
	}
	public ServicioDto getServicio() {
		return servicio;
	}
	
}
