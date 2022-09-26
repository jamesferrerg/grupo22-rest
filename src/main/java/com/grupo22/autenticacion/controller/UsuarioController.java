package com.grupo22.autenticacion.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grupo22.autenticacion.models.entity.Usuario;
import com.grupo22.autenticacion.services.IUsuarioService;

@RestController
@RequestMapping("/grupo22")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	Optional<Usuario> buscar;
	
	@GetMapping("/login")
	public ResponseEntity<?> login(@RequestParam String nombre, @RequestParam String contrasena){
		buscar = usuarioService.findByNombreAndContrasena(nombre, contrasena);
		if (buscar.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(buscar.get());
	}
	
	@GetMapping("/listar-usuarios")
	public ResponseEntity<?> listarUsuarios(){
		
		if (buscar == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(usuarioService.findAll());
	}
	

}
