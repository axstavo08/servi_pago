package com.example.demo.dto;

import java.sql.Date;
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

public class TarjetaDto {

	private String numero_tarjeta;
	
	private String dni;
	
	private String tipo;
	
	private Date fecha_vencimiento;
	
	private String cvv;
	
	private Date fecha_registro;
	
	private String marca;
	
	private float monto;
	
	private String estado;
	
	private ClienteDto cliente;
	
	private List<PagoDto> pagos = new ArrayList<PagoDto>();	
	
	public TarjetaDto() {}
	
	public TarjetaDto(String numero,String dni,String tipo,Date fecha_ven,String cvv,Date fecha_reg,String marca,float monto,String estado,ClienteDto cliente,List<PagoDto> pagos) {
		this.numero_tarjeta = numero;
		this.dni = dni;
		this.tipo = tipo;
		this.fecha_vencimiento = fecha_ven;
		this.cvv = cvv;
		this.fecha_registro = fecha_reg;
		this.marca = marca;
		this.monto = monto;
		this.cliente = cliente;
		this.pagos = pagos;
	}
	
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

	public ClienteDto getCliente() {
		return cliente;
	}

	public List<PagoDto> getPagos() {
		return pagos;
	}

	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}

	public void setPagos(List<PagoDto> pagos) {
		this.pagos = pagos;
	}	
	
	
}
