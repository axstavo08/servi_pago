package com.example.demo.service;

import com.example.demo.dto.ClienteDto;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;
import com.example.demo.model.Pago;
import com.example.demo.model.Suscripcion;
import com.example.demo.model.Tarjeta;
import com.example.demo.repository.IClienteRepo;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepo clienterepo;

    public List<Cliente> getClientes() {
        return clienterepo.findAll();
    }

    public List<Suscripcion> getSuscripciones(String dni) {
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

    public ClienteDto login(String dni, String password) {
        Cliente cliente = clienterepo.findByDni(dni);
        if (cliente == null) {
            return null;
        }
        if (!cliente.getPassword().equals(password)) {
            return null;
        }
        return new ClienteDto(cliente.getDni(), cliente.getNombres(), cliente.getApellidos(),
                cliente.getFecha_nacimiento(), cliente.getTelefono(), cliente.getCorreo());
    }

}
