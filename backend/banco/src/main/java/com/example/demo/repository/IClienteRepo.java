package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IClienteRepo extends JpaRepository<Cliente,String> {
    
     //@Query("SELECT c FROM cliente c WHERE c.dni = (:dni)")
     //Cliente findByDni(@Param("dni") String dni);
}
