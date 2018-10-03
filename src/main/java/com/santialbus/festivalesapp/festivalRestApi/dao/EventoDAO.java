package com.santialbus.festivalesapp.festivalRestApi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Repository;

import com.santialbus.festivalesapp.festivalRestApi.model.Evento;

@Repository("eventoDao")
public class EventoDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Evento> getEventosDeSala(String salaname, HttpServletResponse response) {
		Query query = entityManager.createQuery("select e from evento e, Sala s where s.name = '"+salaname+"'");
		response.addHeader("Access-Control-Allow-Origin", "*");
    	response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, DELETE, PUT");
    	response.addHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization, X-Request-With, X-CLIENT-ID, X-CLIENT-SECRET");
    	response.addHeader("Access-Control-Allow-Credentials", "true");
    	return (List<Evento>) query.getResultList();
	}
	
}
