package com.example.demo.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.RestController;

@Entity
@Table(name="suscripcion")
public class SuscripcionDto {

	@Id
	@GeneratedValue
	private int id_suscripcion;
	
	@NotNull
	@Column(name="dni")
	private String dni;
	
	@NotNull
	@Column(name="id_servicio")
	private int id_servicio;
	
	@NotNull
	@Column(name="fecha")
	private Date fecha;
	
	@NotNull
	@Column(name="monto")
	private float monto;
	
	@ManyToOne
	private ClienteDto cliente;	
	
	@OneToOne ServicioDto servicio;	

	public int getId_suscripcion() {
		return id_suscripcion;
	}

	public void setId_suscripcion(int id_suscripcion) {
		this.id_suscripcion = id_suscripcion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getId_servicio() {
		return id_servicio;
	}

	public void setId_servicio(int id_servicio) {
		this.id_servicio = id_servicio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public ClienteDto getCliente() {
		return cliente;
	}	
	
	public ServicioDto getServicio() {
		return servicio;
	}
}
