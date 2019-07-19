package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Categoria;
import com.example.demo.model.Cliente;
import com.example.demo.repository.ICategoriaRepo;

@Service
public class CategoriaService {
	
	@Autowired
	private ICategoriaRepo categoriarepo;
	
	public List<Categoria> getCategorias(){
		return categoriarepo.findAll();
	}
	
	public boolean addCategoria(Categoria categoria) {
		Categoria c = categoriarepo.save(categoria);
		return c != null;
	}
}
