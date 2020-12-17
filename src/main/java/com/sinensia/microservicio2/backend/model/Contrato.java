package com.sinensia.microservicio2.backend.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Contrato {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String nombre;
	private String precio;
	
	@Enumerated(EnumType.STRING)
	private TipoContrato tipo;
	
	private String ean;
	private String upc;
	
	private Long codigoTienda;
	
	@Temporal(TemporalType.DATE)
	private Date fechaInicio = new Date();
	
	public Contrato(Long id, String nombre, String precio, TipoContrato tipo, String ean, String upc, Long codigoTienda,
			Date fechaInicio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.tipo = tipo;
		this.ean = ean;
		this.upc = upc;
		this.codigoTienda = codigoTienda;
		this.fechaInicio = fechaInicio;
	}
	
	
	public Contrato() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public TipoContrato getTipo() {
		return tipo;
	}

	public void setTipo(TipoContrato tipo) {
		this.tipo = tipo;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public Long getCodigoTienda() {
		return codigoTienda;
	}

	public void setCodigoTienda(Long codigoTienda) {
		this.codigoTienda = codigoTienda;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrato other = (Contrato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contrato [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + ", ean=" + ean
				+ ", upc=" + upc + ", codigoTienda=" + codigoTienda + ", fechaInicio=" + fechaInicio + "]";
	}
	
}
