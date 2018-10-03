package com.santialbus.festivalesapp.festivalRestApi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Repository;

import com.santialbus.festivalesapp.festivalRestApi.model.Usuario;

@Repository("usuarioDao")
public class UsuarioDAO {
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getAllUsuarios(HttpServletResponse response) {
		Query query = entityManager.createQuery("from Usuario");
		response.addHeader("Access-Control-Allow-Origin", "*");
    	response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, DELETE, PUT");
    	response.addHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization, X-Request-With, X-CLIENT-ID, X-CLIENT-SECRET");
    	response.addHeader("Access-Control-Allow-Credentials", "true");
        return (List<Usuario>) query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarioByUsuarioAndContrasena(String user_name, String contrasena, HttpServletResponse response) {
		Query query = entityManager.createQuery("from Usuario u where u.user_name = '"+user_name+"' AND u.contrasena = '"+contrasena+"'");
		response.addHeader("Access-Control-Allow-Origin", "*");
    	response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, DELETE, PUT");
    	response.addHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization, X-Request-With, X-CLIENT-ID, X-CLIENT-SECRET");
    	response.addHeader("Access-Control-Allow-Credentials", "true");
    	return (List<Usuario>) query.getResultList();
	}
	
	
	
}
