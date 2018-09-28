package com.santialbus.festivalesapp.festivalRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FestivalRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FestivalRestApiApplication.class, args);
	}
	
	/*
	 * Implementando Autenticacion para mejorar la seguridad de la aplicacion con 0auth, también
	 * creando un usuario para poder pasarle la autenticacion, esta creado en la 
	 * base de datos de festivales_app.sql
	 */
}
