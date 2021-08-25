package com.MeuBlogPessoal.BlogPessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MeuBlogPessoal.BlogPessoal.model.Tema;
import com.MeuBlogPessoal.BlogPessoal.repository.TemaRepository;

@RestController
@RequestMapping("/api/v1/tema")
public class TemaController {
	
	private @Autowired TemaRepository repositorio;
	
	@GetMapping
	public List<Tema> pegarTodes(){
		return repositorio.findAll();
	}
}
