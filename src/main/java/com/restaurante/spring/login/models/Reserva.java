package com.restaurante.spring.login.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/*
 * Entidade RESERVA, onde irá virar uma tabela no banco de dados, com relacionamento com a classe User
*/


@Entity
@Table(name = "reservas")
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String data;
	private String nome;
	private String horario;
	private String email;
	private int numeroConvidados;
	private String telefone;
	private String solicitacoes;
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Reserva() {
		super();
	}

	public Reserva(String data, String nome, String horario, String email, int numeroConvidados, String telefone,
			String solicitacoes, User user) {
		super();
		this.data = data;
		this.nome = nome;
		this.horario = horario;
		this.email = email;
		this.numeroConvidados = numeroConvidados;
		this.telefone = telefone;
		this.solicitacoes = solicitacoes;
		this.user = user;
		
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumeroConvidados() {
		return numeroConvidados;
	}

	public void setNumeroConvidados(int numeroConvidados) {
		this.numeroConvidados = numeroConvidados;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSolicitacoes() {
		return solicitacoes;
	}

	public void setSolicitacoes(String solicitacoes) {
		this.solicitacoes = solicitacoes;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
		
}
