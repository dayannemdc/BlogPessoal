package com.MeuBlogPessoal.BlogPessoal.model.Utility;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * Classe responsável por validar acesso de usuarios no sistema, onde o usuário informa email e senha para autenticação.
 * @author dayan
 *
 */
public class UsuarioDTO {

	private @NotBlank @Email String email;
	private @NotBlank String senha;
	
	private Long id;
	private String nome;
	private String token;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
