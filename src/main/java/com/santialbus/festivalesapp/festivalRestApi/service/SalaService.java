package com.santialbus.festivalesapp.festivalRestApi.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.santialbus.festivalesapp.festivalRestApi.dao.SalaDAO;
import com.santialbus.festivalesapp.festivalRestApi.model.Sala;

@Service("salaService")
public class SalaService {

	@Autowired
	@Qualifier("salaDao")
	private SalaDAO salaDao;
	
	@Transactional
	public List<Sala> getAllSalas(HttpServletResponse response) {
		// TODO Auto-generated method stub
		return salaDao.getAllSalas(response);
	}
}