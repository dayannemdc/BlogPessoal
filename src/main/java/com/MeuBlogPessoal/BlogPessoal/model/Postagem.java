package com.MeuBlogPessoal.BlogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Postagem {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idPostagem;
	private String titulo;
	private String texto;
	private Date date = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JoinColumn(name = "criador_id")
	private Usuario criador;
	
	@ManyToOne
	@JoinColumn(name = "tema_id")
	private Tema temaRelacionado;
	
	public Long getIdPostagem() {
		return idPostagem;
	}
	public void setIdPostagem(Long idPostagem) {
		this.idPostagem = idPostagem;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
