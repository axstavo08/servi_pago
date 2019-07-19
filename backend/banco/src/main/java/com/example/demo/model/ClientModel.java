/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Gustavo Ramos M.
 */
@Entity
@Table(name = "cliente")
public class ClientModel implements Serializable {

    @Id
    private String dni;

    @NotNull
    @Column(name = "nombres", length = 80)
    private String names;

    @NotNull
    @Column(name = "apellidos", length = 80)
    private String surnames;

    @NotNull
    @Column(name = "telefono", length = 10)
    private String phone;

    @NotNull
    @Column(name = "fecha_nacimiento", length = 250)
    @Temporal(TemporalType.DATE)
    private Date bornDate;

    @NotNull
    @Column(name = "ubigeo", length = 6)
    private String ubigeo;

    @NotNull
    @Column(name = "correo", length = 80)
    private String email;

    @NotNull
    @Column(name = "password", length = 45)
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
