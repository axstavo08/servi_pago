package com.example.demo.service;

import com.example.demo.dto.ClienteDto;
import com.example.demo.dto.SuscripcionDto;
import com.example.demo.dto.TarjetaDto;
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
    
     */
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
        Cliente cliente = clienterepo.getOne(dni);
        if (cliente == null) {
            return null;
        }
        if (!cliente.getPassword().equals(password)) {
            return null;
        }
        List<SuscripcionDto> suscripcionDto = new ArrayList<>();
        if (cliente.getSuscripciones() != null) {
            for (Suscripcion suscripcion : cliente.getSuscripciones()) {
                suscripcionDto.add(new SuscripcionDto(suscripcion.getId_suscripcion(),
                        suscripcion.getDni(), suscripcion.getId_servicio(), suscripcion.getFecha(),
                        suscripcion.getMonto()));
            }
        }
        List<TarjetaDto> tarjetasDto = new ArrayList<>();
        if (cliente.getTarjetas() != null) {
            for (Tarjeta tarjeta : cliente.getTarjetas()) {
                tarjetasDto.add(new TarjetaDto(tarjeta.getNumero_tarjeta(),
                        tarjeta.getDni(), tarjeta.getTipo(), tarjeta.getFecha_vencimiento(),
                        tarjeta.getCvv(), tarjeta.getFecha_registro(), tarjeta.getMarca(),
                        tarjeta.getMonto(), tarjeta.getEstado(), null));
            }
        }
        return new ClienteDto(cliente.getDni(), cliente.getNombres(), cliente.getApellidos(),
                cliente.getTelefono(), cliente.getUbigeo(), cliente.getCorreo(), tarjetasDto, suscripcionDto);
    }
}
