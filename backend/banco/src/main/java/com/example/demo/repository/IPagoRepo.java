package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pago;

public interface IPagoRepo extends JpaRepository<Pago,Integer> {

}
