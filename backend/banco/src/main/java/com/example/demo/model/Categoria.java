package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="categoria")
public class Categoria {

	@Id
	@GeneratedValue
	private int id_categoria;
	
	@NotNull
	@Column(name="nombre_categoria", length = 50)
	private String nombre_categoria;
	
	@OneToMany
	@JoinColumn(name="id_categoria")
	private List<Entidad> entidades = new ArrayList<Entidad>();
	
	
	public int getId_categoria() {
		return id_categoria;
	}


	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}


	public String getNombre_categoria() {
		return nombre_categoria;
	}


	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}

	public List<Entidad> getEntidades() {
		return entidades;
	}	
}
