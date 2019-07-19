/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dto.ClienteDto;
import com.example.demo.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.IClienteRepo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Ramos M.
 */
@Service
public class ClientService {

    @Autowired
    IClienteRepo clientRepository;

    public List getClients() {
        List<ClienteDto> clients = new ArrayList<>();
        List<Cliente> clientsData = clientRepository.findAll();
        for (Cliente clientModel : clientsData) {
            clients.add(new ClienteDto(clientModel.getDni(), clientModel.getNombres(), clientModel.getApellidos(),
                    clientModel.getFecha_nacimiento(), clientModel.getTelefono(), clientModel.getCorreo()));
        }
        return clients;
    }
    
    public ClienteDto getClient(String dni) {
        Cliente clientModel = clientRepository.findByDni(dni);
    }
}
