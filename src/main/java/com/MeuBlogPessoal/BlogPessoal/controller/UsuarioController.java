package com.MeuBlogPessoal.BlogPessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MeuBlogPessoal.BlogPessoal.model.Usuario;
import com.MeuBlogPessoal.BlogPessoal.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
	
	private @Autowired UsuarioRepository repositorio;
	
	@GetMapping("/todes")
	public ResponseEntity<List<Usuario>> pegarTodes(){
		return (ResponseEntity<List<Usuario>>) repositorio.findAll();
	}
}
