package com.santialbus.festivalesapp.festivalRestApi.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.santialbus.festivalesapp.festivalRestApi.dao.FestivalDAO;
import com.santialbus.festivalesapp.festivalRestApi.model.Festival;

@Service("festivalService")
public class FestivalService {
	
	@Autowired
	@Qualifier("festivalDao")
	private FestivalDAO festivalDao;
	
	@Transactional
	public Festival getFestivalbyId(long id, HttpServletResponse response) {
		return festivalDao.selectFestivalById(id, response);
	}
	
	@Transactional
	public List<Festival> getFestivalbyName(String name, HttpServletResponse response) {
		return festivalDao.selectFestivalByName(name, response);
	}
	
	@Transactional
	public void addFestival(Festival fest, HttpServletResponse response) {
		festivalDao.insertFest(fest, response);
	}
	
	@Transactional
	public void modifyFestival(Festival fest, HttpServletResponse response) {
		festivalDao.updateFest(fest, response);
	}
	
	@Transactional
	public List<Festival> getAllFestival(HttpServletResponse response) {
		return festivalDao.getAllFestivales(response);
	}
	
	@Transactional
	public void deleteFestival(long id, HttpServletResponse response) {
		festivalDao.deleteFest(id, response);
	}
	
	@Transactional
	public List<Festival> getUsuarioAndRecommendedFestival(String user_name, HttpServletResponse response) {
		return festivalDao.getUsuarioGenreEqualFestivalGenres(user_name, response);
	}
	
}
