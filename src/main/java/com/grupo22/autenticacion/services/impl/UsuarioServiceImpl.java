package com.grupo22.autenticacion.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grupo22.autenticacion.models.entity.Usuario;
import com.grupo22.autenticacion.models.repository.IUsuarioRepository;
import com.grupo22.autenticacion.services.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private IUsuarioRepository usuarioRepo;

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioRepo.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepo.save(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuario> findByNombreAndContrasena(String nombre, String contrasena) {
		// TODO Auto-generated method stub
		return usuarioRepo.findByNombreAndContrasena(nombre, contrasena);
	}

	@Override
	public void delete(Integer idUsuario) {
		// TODO Auto-generated method stub
		usuarioRepo.deleteById(idUsuario);
	}

}
