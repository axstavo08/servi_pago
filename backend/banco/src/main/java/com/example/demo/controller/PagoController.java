package com.example.demo.controller;

import com.example.demo.dto.PagoDto;
import com.example.demo.dto.ResponseBody;
import com.example.demo.dto.ResponseData;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.model.Pago;
import com.example.demo.model.Servicio;
import com.example.demo.service.EntidadService;
import com.example.demo.service.PagoService;

@RestController
@RequestMapping("/pago")
public class PagoController {

    @Autowired
    private PagoService pagoservice;

    @GetMapping()
    public Object Listar(Model model) {
        List<PagoDto> pagos = pagoservice.getPagos();
        return new ResponseBody(0, new ResponseData(pagos));
    }

    @PostMapping("/agregar")
    public String AgregarPago(Pago pago) {
        if (pagoservice.addPago(pago)) {
            return "ok";
        } else {
            return "error";
        }
    }
}
