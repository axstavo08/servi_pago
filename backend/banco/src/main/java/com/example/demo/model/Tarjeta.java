package com.example.demo.model;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tarjeta")
public class Tarjeta {

    @Id
    @Column(length = 16)
    private String numero_tarjeta;

    @Column(name = "dni", length = 8)
    @NotNull
    private String dni;

    @Column(name = "tipo", length = 45)
    @NotNull
    private String tipo;

    @Column(name = "fecha_vencimiento")
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fecha_vencimiento;

    @Column(name = "cvv", length = 3)
    @NotNull
    private String cvv;

    @Column(name = "fecha_registro")
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fecha_registro;

    @Column(name = "marca", length = 45)
    @NotNull
    private String marca;

    @NotNull
    @Column(name = "monto")
    private float monto;

    @Column(name = "estado", length = 10)
    @NotNull
    private String estado;

    @ManyToOne
    private Cliente cliente;

    @OneToMany
    @JoinColumn(name = "cuentaid")
    private List<Pago> pagos = new ArrayList<Pago>();

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

}
