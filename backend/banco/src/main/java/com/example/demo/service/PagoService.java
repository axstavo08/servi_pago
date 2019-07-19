package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.*;
import com.example.demo.dto.*;
import com.example.demo.repository.IPagoRepo;
import java.util.ArrayList;

@Service
public class PagoService {

    @Autowired
    private IPagoRepo pagorepo;

    public List<PagoDto> getPagos() {
        //Dto(int id_pago, int id_servicio, String numero, Tarjeta tarjeta, ServicioDto servicio) {
        List<PagoDto> pagosDto = new ArrayList<>();
        List<Pago> pagos = pagorepo.findAll();
        for (Pago pago : pagos) {
            if(pago.getCuenta() != null){
                
            }
            pagosDto.add(new PagoDto(pago.getId_pago(), pago.getId_servicio(), pago.getNumero_tarjeta(),
                    null, null));
        }
        return pagosDto;
    }

    public boolean addPago(Pago pago) {
        Pago p = pagorepo.save(pago);
        return p != null;
    }
}
