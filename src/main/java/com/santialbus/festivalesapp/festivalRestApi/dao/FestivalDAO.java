package com.santialbus.festivalesapp.festivalRestApi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Repository;

import com.santialbus.festivalesapp.festivalRestApi.model.Festival;

@Repository("festivalDao")
public class FestivalDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Festival selectFestivalById(long id, HttpServletResponse response) {
		response.addHeader("Access-Control-Allow-Origin", "*");
    	response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, DELETE, PUT");
    	response.addHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization, X-Request-With, X-CLIENT-ID, X-CLIENT-SECRET");
    	response.addHeader("Access-Control-Allow-Credentials", "true");
		return entityManager.find(Festival.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Festival> selectFestivalByName(String name, HttpServletResponse response) {
		Query query = entityManager.createQuery("from Festival where name = '"+name+"'");
		response.addHeader("Access-Control-Allow-Origin", "*");
    	response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, DELETE, PUT");
    	response.addHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization, X-Request-With, X-CLIENT-ID, X-CLIENT-SECRET");
    	response.addHeader("Access-Control-Allow-Credentials", "true");
    	return (List<Festival>) query.getResultList();
	}
	
	public void insertFest(Festival fest, HttpServletResponse response) {
        try {
        	entityManager.persist(fest);
    		entityManager.find(Festival.class, fest.getId());
    		Festival f = entityManager.find(Festival.class, fest.getId());
        	System.out.println("Festival añadido" + f.toString());
        	response.addHeader("Access-Control-Allow-Origin", "*");
        	response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, DELETE, PUT");
        	response.addHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization, X-Request-With, X-CLIENT-ID, X-CLIENT-SECRET");
        	response.addHeader("Access-Control-Allow-Credentials", "true");
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
	
	public void updateFest(Festival fest, HttpServletResponse response) {
		Festival festToUpdate = selectFestivalById(fest.getId(), response);
			
		festToUpdate.setName(fest.getName());
		festToUpdate.setDescripcion(fest.getDescripcion());
		festToUpdate.setGenero(fest.getGenero());
		festToUpdate.setPrecio(fest.getPrecio());
		festToUpdate.setDias(fest.getDias());
		festToUpdate.setFecha_ini(fest.getFecha_ini());
		festToUpdate.setFecha_fin(fest.getFecha_fin());

		response.addHeader("Access-Control-Allow-Origin", "*");
    	response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, DELETE, PUT");
    	response.addHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization, X-Request-With, X-CLIENT-ID, X-CLIENT-SECRET");
    	response.addHeader("Access-Control-Allow-Credentials", "true");
		
	}
	
	public void deleteFest(long id, HttpServletResponse response) {
		response.addHeader("Access-Control-Allow-Origin", "*");
    	response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, DELETE, PUT");
    	response.addHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization, X-Request-With, X-CLIENT-ID, X-CLIENT-SECRET");
    	response.addHeader("Access-Control-Allow-Credentials", "true");
		entityManager.remove(selectFestivalById(id, response));
	}
	
	@SuppressWarnings("unchecked")
	public List<Festival> getAllFestivales(HttpServletResponse response) {
		Query query = entityManager.createQuery("from Festival");
		response.addHeader("Access-Control-Allow-Origin", "*");
    	response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, DELETE, PUT");
    	response.addHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization, X-Request-With, X-CLIENT-ID, X-CLIENT-SECRET");
    	response.addHeader("Access-Control-Allow-Credentials", "true");
        return (List<Festival>) query.getResultList();
	}
}
