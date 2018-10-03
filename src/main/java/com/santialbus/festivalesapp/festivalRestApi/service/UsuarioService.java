package com.santialbus.festivalesapp.festivalRestApi.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.santialbus.festivalesapp.festivalRestApi.dao.UsuarioDAO;
import com.santialbus.festivalesapp.festivalRestApi.model.Usuario;

@Service("usuarioService")
public class UsuarioService {

	@Autowired
	@Qualifier("usuarioDao")
	private UsuarioDAO usuarioDao;
	
	@Transactional
	public List<Usuario> getAllUsuarios(HttpServletResponse response) {
		// TODO Auto-generated method stub
		return usuarioDao.getAllUsuarios(response);
	}
	
	@Transactional
	public List<Usuario> getUsuario(String user_name, String contrasena, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return usuarioDao.getUsuarioByUsuarioAndContrasena(user_name, contrasena, response);
	}
	
}
