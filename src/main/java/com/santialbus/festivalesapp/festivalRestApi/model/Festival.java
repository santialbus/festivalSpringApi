package com.santialbus.festivalesapp.festivalRestApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "festival")
public class Festival {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "id")
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "genero")
	private String genero;
	@Column(name = "precio")
	private double precio;
	@Column(name = "dias")
	private int dias;
	@Column(name = "fecha_ini")
	private String fecha_ini;
	@Column(name = "fecha_fin")
	private String fecha_fin;
	
	public Festival() {}
	
	public Festival(long id, String name, String descripcion, String genero, double precio, int dias, String fecha_ini, String fecha_fin) {
		this.id = id;
		this.name = name;
		this.descripcion = descripcion;
		this.genero = genero;
		this.precio = precio;
		this.dias = dias;
		this.fecha_ini = fecha_ini;
		this.fecha_fin = fecha_fin;
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

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String getFecha_ini() {
		return fecha_ini;
	}

	public void setFecha_ini(String fecha_ini) {
		this.fecha_ini = fecha_ini;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	
	@Override
	public String toString() {
		return "Festival: " + this.getId() + ", " + this.getName() + ", " + this.getDescripcion() +
				", " + this.getGenero() + ", " + this.getPrecio() + ", " + this.getDias() + 
				", " + this.getFecha_ini() + ", " + this.getFecha_fin();
	}
	
}
