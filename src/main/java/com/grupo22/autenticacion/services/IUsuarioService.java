package com.grupo22.autenticacion.services;

import java.util.List;
import java.util.Optional;

import com.grupo22.autenticacion.models.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();
	
	public Usuario save(Usuario usuario);
	
	public Optional<Usuario> findByNombreAndContrasena(String nombre, String contrasena);
	
	public void delete(Integer idUsuario);
}
