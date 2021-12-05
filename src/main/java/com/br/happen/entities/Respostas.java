package com.br.happen.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_respostas")
public class Respostas implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "pontuacao")
	private double pontuacao;
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="aprendiz_id")
	private Aprendiz aprendiz;
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="perguntas_id")
	private Perguntas perguntas;
	
	public Respostas() {
		
	}

	public Respostas(Long id, double pontuacao) {
		this.id = id;
		this.pontuacao = pontuacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(double pontuacao) {
		this.pontuacao = pontuacao;
	}



	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Respostas other = (Respostas) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
