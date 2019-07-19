package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Entidad;

public interface IEntidadRepo extends JpaRepository<Entidad,String>  {

}
