package com.example.demo.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ClienteDto {

    private String dni;
    private String nombres;
    private String apellidos;
    private Date fecha_nacimiento;
    private String telefono;
    private String ubigeo;
    private String correo;
    private String password;
    private List<TarjetaDto> tarjetas = new ArrayList<>();
    private List<SuscripcionDto> suscripciones = new ArrayList<>();

    public ClienteDto(String dni, String nombres, String apellidos, Date fecha_nacimiento, String telefono, String correo) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public ClienteDto(String dni, String nombres, String apellidos, Date fecha_nacimiento, String telefono,
            String ubigeo, String correo, String password) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.ubigeo = ubigeo;
        this.correo = correo;
        this.password = password;
    }

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

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TarjetaDto> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<TarjetaDto> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public List<SuscripcionDto> getSuscripciones() {
        return suscripciones;
    }

    public void setSuscripciones(List<SuscripcionDto> suscripciones) {
        this.suscripciones = suscripciones;
    }
}
