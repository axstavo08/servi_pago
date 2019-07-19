package com.example.demo.model;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    private String dni;

    @NotNull
    @Column(name = "nombres", length = 50)
    private String nombres;

    @NotNull
    @Column(name = "apellidos", length = 50)
    private String apellidos;

    @NotNull
    @Column(name = "ubigeo")
    private String ubigeo;

    @NotNull
    @Column(name = "telefono")
    private String telefono;

    @NotNull
    @Column(name = "correo")
    private String correo;

    @NotNull
    @Column(name = "password", length = 4)
    private String password;

    @OneToMany
    @JoinColumn(name = "dni")
    private List<Tarjeta> tarjetas = new ArrayList<Tarjeta>();

    @OneToMany
    @JoinColumn(name = "dni")
    private List<Suscripcion> suscripciones = new ArrayList<Suscripcion>();

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPassword() {
        return password;
    }

    public void setPin(String password) {
        this.password = password;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public List<Suscripcion> getSuscripciones() {
        return suscripciones;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
