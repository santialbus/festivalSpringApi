package com.santialbus.festivalesapp.festivalRestApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name="evento")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="genero")
	private String genero;
	
	@Column(name="precio")
	private double precio;
	
	@Column(name="fecha")
	private String fecha;
	
	@Column(name="hora")
	private String hora;
	
	public Evento() {}

	public Evento(long id, String name, String descripcion, String genero, double precio, String fecha, String hora) {
		this.id = id;
		this.name = name;
		this.descripcion = descripcion;
		this.genero = genero;
		this.precio = precio;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setfecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " + this.name + " " + this.descripcion + " " + this.genero + " " + this.precio + " " + this.fecha + " " + this.hora;
	}
	
}
