package com.santialbus.festivalesapp.festivalRestApi.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.santialbus.festivalesapp.festivalRestApi.model.Festival;
import com.santialbus.festivalesapp.festivalRestApi.service.FestivalService;

@RestController
public class FestivalController {
	
	@Autowired
	@Qualifier("festivalService")
	private FestivalService festivalService;
	
	@PostMapping("/api/createfestival")
	public void createNewFest(@Valid @RequestBody Festival fest, HttpServletResponse response) {
		festivalService.addFestival(fest, response);
	}
	
	@PutMapping("/api/changefestival") 
	public void changeExistingFestival(@Valid @RequestBody Festival fest, HttpServletResponse response) {
		festivalService.modifyFestival(fest, response);
	}
	
	@DeleteMapping("/api/removefestival/{id}")
	public void removeFestival(@PathVariable(value = "id") long id, HttpServletResponse response) {
			festivalService.deleteFestival(id, response);
	}
	
	@GetMapping("/api/viewsinglefestival/{id}")
	public Festival viewFestivalById(@PathVariable(value = "id") long id, HttpServletResponse response) {
		return festivalService.getFestivalbyId(id, response);
	}
	
	@GetMapping("/api/viewsinglenamefestival/{name}")
	public List<Festival> viewFestivalByName(@PathVariable(value = "name") String name, HttpServletResponse response) {
		return festivalService.getFestivalbyName(name, response);
	}
	
	@GetMapping("/api/viewAllFestivales")
	public List<Festival> viewAllFestivales(HttpServletResponse response) {
		return festivalService.getAllFestival(response);
	}
	
}
