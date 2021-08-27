package com.MeuBlogPessoal.BlogPessoal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MeuBlogPessoal.BlogPessoal.model.Usuario;
import com.MeuBlogPessoal.BlogPessoal.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private @Autowired UsuarioRepository repositorio;
	
	/**
	 * Método para criar novo usuário no sistema
	 * @param novoUsuario
	 * @return
	 */
	public Optional<Object> cadastrarUsuario(Usuario novoUsuario) {
		return repositorio.findByEmail(novoUsuario.getEmail()).map(usuarioExistente ->{
			return Optional.empty();
		}).orElseGet(()->{
			return Optional.ofNullable(repositorio.save(novoUsuario));
		});
	}
}
