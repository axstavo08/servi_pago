package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Tarjeta;

public interface ITarjetaRepo extends JpaRepository<Tarjeta,String> {

}
