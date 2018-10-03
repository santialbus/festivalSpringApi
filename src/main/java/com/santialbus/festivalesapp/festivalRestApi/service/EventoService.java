package com.santialbus.festivalesapp.festivalRestApi.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.santialbus.festivalesapp.festivalRestApi.dao.EventoDAO;
import com.santialbus.festivalesapp.festivalRestApi.model.Evento;

@Service("eventoService")
public class EventoService {

	@Autowired
	@Qualifier("eventoDao")
	private EventoDAO eventoDao;
	
	@Transactional
	public List<Evento> getAllFestival(String salaname, HttpServletResponse response) {
		return eventoDao.getEventosDeSala(salaname, response);
	}
	
}
