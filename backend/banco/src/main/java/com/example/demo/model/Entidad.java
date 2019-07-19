package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "entidad")
public class Entidad {

    @Id
    @Column(length = 10)
    private String ruc;

    @Column(name = "nombre_entidad", length = 50)
    @NotNull
    private String nombre_entidad;

    @Column(name = "telefono", length = 9)
    @NotNull
    private String telefono;

    @OneToMany
    @JoinColumn(name = "ruc")
    private List<Servicio> servicios = new ArrayList<Servicio>();

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre_entidad;
    }

    public void setNombre(String nombre) {
        this.nombre_entidad = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
