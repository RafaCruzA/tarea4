package com.uca.capas.tarea4.domain;

import java.util.Date;

public class Producto {
	Number codProducto;
	String nombreProducto;
	String marca;
	String descripcion;
	Number existencias;
	Date fechaIngreso;
	
	public Number getCodProducto() {
		return codProducto;
	}
	
	public void setcodProducto(Number codProducto) {
		this.codProducto = codProducto;
	}
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Number getExistencias() {
		return existencias;
	}
	
	public void setExistencias(Number existencias) {
		this.existencias = existencias;
	}
	
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
