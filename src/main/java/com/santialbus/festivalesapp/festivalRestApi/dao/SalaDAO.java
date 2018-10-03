package com.santialbus.festivalesapp.festivalRestApi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Repository;

import com.santialbus.festivalesapp.festivalRestApi.model.Sala;

@Repository("salaDao")
public class SalaDAO {
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Sala> getAllSalas(HttpServletResponse response) {
		Query query = entityManager.createQuery("from Sala");
		response.addHeader("Access-Control-Allow-Origin", "*");
    	response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, DELETE, PUT");
    	response.addHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization, X-Request-With, X-CLIENT-ID, X-CLIENT-SECRET");
    	response.addHeader("Access-Control-Allow-Credentials", "true");
        return (List<Sala>) query.getResultList();
	}
	
}