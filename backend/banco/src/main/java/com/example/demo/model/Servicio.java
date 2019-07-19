package com.example.demo.model;

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

@Entity
@Table(name="servicio")
public class Servicio {
	
	@Id
	@GeneratedValue
	private int id_servicio;
	
	@Column(name="nombre_servicio",length=50)
	@NotNull
	private String nombre_servicio;
	
	@Column(name="ruc",length=10)
	@NotNull
	private String ruc;
	
	@Column(name="monto")
	@NotNull
	private float monto;
	
	@ManyToOne
	private Entidad entidad;
	
	@OneToOne
	private Suscripcion suscripcion;
	
	@OneToMany
	@JoinColumn(name="id_servicio")
	private List<Pago> pagos = new ArrayList<Pago>();	
	
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
	public Entidad getEntidad() {
		return entidad;
	}
	public List<Pago> getPagos() {
		return pagos;
	}
	
	public Suscripcion getSuscripcion() {
		return suscripcion;
	}
}
