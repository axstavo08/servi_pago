/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.dto.ClientDto;
import com.example.demo.model.ClientModel;
import com.example.demo.service.ClientService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gustavo Ramos M.
 */
@RestController
@RequestMapping("/users")
public class ClientController {

    @Autowired
    private ClientService clientService;

    /*@GetMapping
    public Map<String, String> Listar() {
        Map<String, String> testMap = new HashMap<>();
        testMap.put("hackhthon", "bbva2019");
        return testMap;
    }*/
    
    @GetMapping("")
    public List getClients() {
        List<ClientDto> clients = clientService.getClients();
        return clients;
    }
    
    @GetMapping("/{dni}")
    public ResponseEntity<ClientDto> getClient() {
        List<ClientDto> clients = clientService.getClients();
        return clients;
    }
}
