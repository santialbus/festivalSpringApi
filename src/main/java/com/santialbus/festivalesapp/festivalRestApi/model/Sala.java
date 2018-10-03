package com.santialbus.festivalesapp.festivalRestApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sala")
public class Sala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="hora_apertura")
	private String hora_apertura;
		
	public Sala() {}
	
	public Sala(long id, String name, String descripcion, String hora_apertura) {
		this.id = id;
		this.name = name;
		this.descripcion = descripcion;
		this.hora_apertura = hora_apertura;
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
	
	public String getHoraApertura() {
		return hora_apertura;
	}
	
	public void setHoraApertura(String hora_apertura) {
		this.hora_apertura = hora_apertura;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id: " + this.id + ", name: " + this.name + ", descripcion: " + this.descripcion + ", Hora apertura: " + this.hora_apertura;
	}
}
