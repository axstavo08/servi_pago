package com.example.demo.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="cliente")
public class ClienteDto {
	
	@Id
	private String dni;
	
	@NotNull
	@Column(name="nombres",length=50)
	private String nombres;
	
	@NotNull
	@Column(name="apellidos",length=50)
	private String apellidos;
	
	@NotNull
	@Column(name="fecha_nacimiento")
	private Date fecha_nacimiento;
	
	@NotNull
	@Column(name="ubigeo")
	private String ubigeo;
	
	@NotNull
	@Column(name="correo")
	private String correo;
	
	@NotNull
	@Column(name="password",length=4)
	private String password;
	
	@OneToMany
	@JoinColumn(name="dni")
	private List<TarjetaDto> tarjetas = new ArrayList<TarjetaDto>();
	
	@OneToMany
	@JoinColumn(name="dni")
	private List<SuscripcionDto> suscripciones = new ArrayList<SuscripcionDto>();
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getPassword() {
		return password;
	}
	public void setPin(String password) {
		this.password = password;
	}
	public List<TarjetaDto> getTarjetas() {
		return tarjetas;
	} 
	
	public List<SuscripcionDto> getSuscripciones() {
		return suscripciones;
	} 
}
