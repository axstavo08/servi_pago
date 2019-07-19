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

@Entity
@Table(name="entidad")
public class EntidadDto {
	
	@Id
	@Column(length=10)
	private String ruc;
	
	@Column(name="nombre_entidad",length=50)
	@NotNull
	private String nombre_entidad;
	
	@Column(name="telefono",length=9)
	@NotNull
	private String telefono;
	
	@Column(name="id_categoria")
	@NotNull
	private int id_categoria;
	
	@ManyToOne
	private CategoriaDto categoria;
	
	@OneToMany
	@JoinColumn(name="ruc")
	private List<ServicioDto> servicios = new ArrayList<ServicioDto>();
	
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
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public CategoriaDto getCategoria() {
		return categoria;
	}
	
}
