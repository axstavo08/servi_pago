/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dto;

import java.util.Date;

/**
 *
 * @author Gustavo Ramos M.
 */
public class ClientDto {
    
    private String dni;
    private String names;
    private String surnames;
    private String phone;
    private Date bornDate;
    private String ubigeo;
    private String email;

    public ClientDto(String dni, String names, String surnames, String phone, Date bornDate, String ubigeo, String email) {
        this.dni = dni;
        this.names = names;
        this.surnames = surnames;
        this.phone = phone;
        this.bornDate = bornDate;
        this.ubigeo = ubigeo;
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
