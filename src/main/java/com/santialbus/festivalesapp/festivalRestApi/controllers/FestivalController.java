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

import com.santialbus.festivalesapp.festivalRestApi.model.Evento;
import com.santialbus.festivalesapp.festivalRestApi.model.Festival;
import com.santialbus.festivalesapp.festivalRestApi.model.Sala;
import com.santialbus.festivalesapp.festivalRestApi.model.Usuario;
import com.santialbus.festivalesapp.festivalRestApi.service.EventoService;
import com.santialbus.festivalesapp.festivalRestApi.service.FestivalService;
import com.santialbus.festivalesapp.festivalRestApi.service.SalaService;
import com.santialbus.festivalesapp.festivalRestApi.service.UsuarioService;

@RestController
public class FestivalController {
	
	@Autowired
	@Qualifier("festivalService")
	private FestivalService festivalService;
	
	@Autowired
	@Qualifier("usuarioService")
	private UsuarioService usuarioService;
	
	@Autowired
	@Qualifier("salaService")
	private SalaService salaService;
	
	@Autowired
	@Qualifier("eventoService")
	private EventoService eventoService;
	
	//FESTIVAL
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
	
	@GetMapping("/api/viewRecommendedFests/{user_name}")
	public List<Festival> viewUsuarioRecommendedFests(@PathVariable(value = "user_name") String user_name, HttpServletResponse response) {
		return festivalService.getUsuarioAndRecommendedFestival(user_name, response);
	}
	
	//USUARIOS
	@GetMapping("/api/viewAllUsuarios")
	public List<Usuario> viewAllUsuarios(HttpServletResponse response) {
		return usuarioService.getAllUsuarios(response);
	}
	
	@GetMapping("/api/viewUsuario/{user_name}&{contrasena}")
	public List<Usuario> viewUsuarioByNameAndContrasena(@PathVariable(value = "user_name") String user_name, @PathVariable(value = "contrasena") String contrasena, HttpServletResponse response) {
		return usuarioService.getUsuario(user_name, contrasena, response);
	}
	
	//SALAS
	@GetMapping("/api/viewAllSalas")
	public List<Sala> viewAllUSalas(HttpServletResponse response) {
		return salaService.getAllSalas(response);
	}
	
	//EVENTOS
	@GetMapping("/api/viewEventosFromSalas/{salaname}")
	public List<Evento> viewEventosFromSala(@PathVariable(value = "salaname") String salaname, HttpServletResponse response) {
		return eventoService.getAllFestival(salaname, response);
	}
	
}
