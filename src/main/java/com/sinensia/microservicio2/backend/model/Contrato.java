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
	private Long codigo;

	private String nombreProducto;
	private String precioSeguro;
	
	@Enumerated(EnumType.STRING)
	private TipoContrato tipoContrato;
	
	private String ean;
	private Long codigoTienda;
	
	@Temporal(TemporalType.DATE)
	private Date fechaInicio = new Date();
	
	public Contrato() {
		
	}

	public Contrato(Long codigo, String nombreProducto, String precioSeguro, TipoContrato tipoContrato, String ean, Long codigoTienda, Date fechaInicio) {
		super();
		this.codigo = codigo;
		this.nombreProducto = nombreProducto;
		this.precioSeguro = precioSeguro;
		this.tipoContrato = tipoContrato;
		this.ean = ean;
		this.codigoTienda = codigoTienda;
		this.fechaInicio = fechaInicio;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(String precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public String getEan() {
		return ean;
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

	public void setEan(String caracteristicas) {
		this.ean = caracteristicas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
	
}
