package com.example.demo.controller;

import com.example.demo.dto.ClienteDto;
import com.example.demo.dto.ResponseBody;
import com.example.demo.dto.ResponseData;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pago;
import com.example.demo.model.Suscripcion;
import com.example.demo.model.Tarjeta;
import com.example.demo.service.ClienteService;
import com.example.demo.service.ConsultaService;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteservice;

    @PostMapping("login")
    public Object obtenerCliente(String dni, String password) {
        ClienteDto cliente = clienteservice.login(dni, password);
        if (cliente == null) {
            return new ResponseBody(1, new ResponseData("Usuario incorrecto o invalido"));
        }
        return new ResponseBody(1, new ResponseData("Usuario incorrecto o invalido"));
    }

    @GetMapping("/suscripciones")
    public List<Suscripcion> ListarSuscripciones(String dni) {
        List<Suscripcion> suscripciones = clienteservice.getSuscripciones(dni);
        return suscripciones;
    }

    @GetMapping("/pagos")
    public List<Pago> ListarPagos(String dni) {
        List<Pago> pagos = clienteservice.getPagos(dni);
        return pagos;
    }

    @GetMapping("/tarjetas")
    public List<Tarjeta> ListarTarjetas(String dni) {
        List<Tarjeta> tarjetas = clienteservice.getTarjetas(dni);
        return tarjetas;
    }
}
