package com.example.demo.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.*;
import com.example.demo.dto.*;
import com.example.demo.repository.IClienteRepo;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepo clienterepo;

    /*public List<ClienteDto> getClientes() {
    	List<ClienteDto> clientes = new ArrayList<ClienteDto>();
    	List<Cliente> clientesbd = clienterepo.findAll();
    	for(Cliente c :clientesbd) {
    	}
    	}
    }*/

    /*String dni, String nombres, String apellidos, Date fecha_nacimiento, String telefono,
            String ubigeo, String correo, String password,List<TarjetaDto> tarjetas,List<SuscripcionDto> suscripciones/
    
    */public List<Suscripcion> getSuscripciones(String dni) {
        Cliente cliente = clienterepo.getOne(dni);
        return cliente.getSuscripciones();
    }

    public List<Pago> getPagos(String dni) {
        Cliente cliente = clienterepo.getOne(dni);
        List<Pago> pagos = new ArrayList<Pago>();
        List<Tarjeta> tarjetas = cliente.getTarjetas();
        for (Tarjeta t : tarjetas) {
            pagos.addAll(t.getPagos());
        }
        return pagos;
    }

    public List<Tarjeta> getTarjetas(String dni) {
        Cliente cliente = clienterepo.getOne(dni);
        
        return cliente.getTarjetas();
    }

    public boolean addCliente(Cliente cliente) {
        Cliente c = clienterepo.save(cliente);
        return c != null;
    }

    public Cliente login(String dni, String password) {
        Cliente cliente = clienterepo.getOne(dni);
        if (cliente == null) {
            return null;
        }
        if (!cliente.getPassword().equals(password)) {
            return null;
        }
        return cliente;
    }

}
