package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Servicio;

public interface IServicioRepo extends JpaRepository<Servicio,Integer> {

}
