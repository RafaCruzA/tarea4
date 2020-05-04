package com.uca.capas.tarea4.domain;



import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	@Pattern(regexp="[0-9]{12}", message="El codigo debe contener 12 digitos")
	String codProducto;
	
	
	@Size(min=1, max=100, message="El nombre del producto debe contener entre 1 y 100 caracteres")
	String nombreProducto;
	
	@Size(min=1, max=100, message="El nombre de la marca debe contener entre 1 y 100 caracteres")
	String marca;
	
	@Size(min=1, max=500, message="La descripcion debe contener entre 1 y 500 caracteres")
	String descripcion;
	
	@Pattern(regexp="^\\d+$", message="No puede ser un numero decimal")
	String existencias;
	
	@Pattern(regexp="^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", message="La fecha debe ser en formato dd/MM/aaaa")
	String fechaIngreso;
	
	public String getCodProducto() {
		return codProducto;
	}
	
	public void setcodProducto(String codProducto) {
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
	
	public String getExistencias() {
		return existencias;
	}
	
	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}
	
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
