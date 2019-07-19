/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dto.ClientDto;
import com.example.demo.model.ClientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ClientRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Ramos M.
 */
@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List getClients() {
        List<ClientDto> clients = new ArrayList<>();
        List<ClientModel> clientsData = clientRepository.findAll();
        for (ClientModel clientModel : clientsData) {
            clients.add(new ClientDto(clientModel.getDni(), clientModel.getNames(), clientModel.getSurnames(),
                    clientModel.getPhone(), clientModel.getBornDate(), clientModel.getUbigeo(), clientModel.getEmail()));
        }
        return clients;
    }
    
    public ClientDto getClient(String dni) {
        ClientModel clientModel = clientRepository.findByDni(dni);
    }
}
