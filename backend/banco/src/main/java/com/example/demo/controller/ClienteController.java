package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.*;
import com.example.demo.model.*;
import com.example.demo.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteservice;

    @PostMapping("/login")
    public Object obtenerCliente(String dni, String password) {
        Cliente cliente = clienteservice.login(dni, password);
        if (cliente == null) {
            return new ResponseBody(1, new ResponseData("Usuario incorrecto o invalido"));
        }
        return new ResponseBody(0, new ResponseData(cliente));
    }

    @GetMapping("/suscripciones")
    public Object ListarSuscripciones(String dni) {
        List<Suscripcion> suscripciones = clienteservice.getSuscripciones(dni);
        if (suscripciones == null) {
            return new ResponseBody(1, new ResponseData("Usuario incorrecto o invalido"));
        }
        return new ResponseBody(0, new ResponseData(suscripciones));
    }

    @GetMapping("/pagos")
    public Object ListarPagos(String dni) {
        List<Pago> pagos = clienteservice.getPagos(dni);
        if (pagos == null) {
            return new ResponseBody(1, new ResponseData("Usuario incorrecto o invalido"));
        }
        return new ResponseBody(0, new ResponseData(pagos));
    }

    @GetMapping("/tarjetas")
    public Object ListarTarjetas(String dni) {
        List<Tarjeta> tarjetas = clienteservice.getTarjetas(dni);
        if (tarjetas == null) {
            return new ResponseBody(1, new ResponseData("Usuario incorrecto o invalido"));
        }
        return new ResponseBody(0, new ResponseData(tarjetas));
    }
}
