package com.santialbus.festivalesapp.festivalRestApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	//`usuario`(`id`, `name`, `userName`, `contrasena`, `dateNacimiento`, `generoFavorito`) 
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="user_name")
	private String user_name;
	@Column(name="contrasena")
	private String contrasena;
	@Column(name="date_nacimiento")
	private String date_nacimiento;
	@Column(name="genero_favorito")
	private String genero_favorito;
	
	public Usuario() {}
	
	public Usuario(long id, String name, String user_name, String contrasena, String date_nacimiento, String genero_favorito) {
		this.id = id;
		this.name = name;
		this.user_name = user_name;
		this.contrasena = contrasena;
		this.date_nacimiento = date_nacimiento;
		this.genero_favorito = genero_favorito;
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

	public String getUserName() {
		return user_name;
	}

	public void setUserName(String user_name) {
		this.user_name = user_name;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getDateNacimiento() {
		return date_nacimiento;
	}

	public void setDateNacimiento(String date_nacimiento) {
		this.date_nacimiento = date_nacimiento;
	}

	public String getGeneroFavorito() {
		return genero_favorito;
	}

	public void setGeneroFavorito(String genero_favorito) {
		this.genero_favorito = genero_favorito;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

