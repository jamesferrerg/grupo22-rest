package com.grupo22.autenticacion.models.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.grupo22.autenticacion.models.entity.Usuario;

public interface IUsuarioRepository extends CrudRepository<Usuario, Integer>{

	Optional<Usuario> findByNombreAndContrasena(String nombre, String contrasena);
}
