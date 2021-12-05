package com.br.happen.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_aprendizes")
public class Aprendiz implements Serializable{
	
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50, nullable = false )
	private String nomeCompleto;
	@Column(length = 40, nullable = false)
	private String emailOuWhatSapp;
	@Column(length = 30)
	private String areaAtuacao;
	@Column(length = 15, nullable = false)
	private String formaAprendizado;
	@Column(length = 15, nullable = false)
	private int tempoDiario;

	
	@OneToMany(mappedBy="aprendiz")
	private List<Respostas> respostas;
	

	@ManyToMany
	@JoinTable(name="aprendiz_trilha",
	joinColumns = @JoinColumn(name="aprendiz_id"),
	inverseJoinColumns = @JoinColumn(name="trilhas_id") )
	private List<Trilhas> trilhas;
	
	
	public Aprendiz() {
		
	}
	
	
	public Aprendiz(String nome, Long id, String sobrenome, String emailOuWhatSapp, String areaAtuacao,
	 String formaAprendizado,int tempoDiario) {
		super();
		this.nomeCompleto = nome;
		this.id = id;
		this.emailOuWhatSapp = emailOuWhatSapp;
		this.areaAtuacao = areaAtuacao;
		this.formaAprendizado = formaAprendizado;
		this.tempoDiario = tempoDiario;
	}

	public String getNome() {
		return nomeCompleto;
	}

	public void setNome(String nome) {
		this.nomeCompleto = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailOuWhatSapp() {
		return emailOuWhatSapp;
	}

	public void setEmailOuWhatSapp(String emailOuWhatSapp) {
		this.emailOuWhatSapp = emailOuWhatSapp;
	}

	public String getAreaAtuação() {
		return areaAtuacao;
	}

	public void setAreaAtuação(String areaAtuação) {
		this.areaAtuacao = areaAtuação;
	}


	public int gettempoDiario() {
		return tempoDiario;
	}

	public void settempoDiario(int tempoDiario) {
		this.tempoDiario = tempoDiario;
	}

	
	
	public String getFormaAprendizado() {
		return formaAprendizado;
	}

	public void setFormaAprendizado(String formaAprendizado) {
		this.formaAprendizado = formaAprendizado;
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
		Aprendiz other = (Aprendiz) obj;
		return Objects.equals(id, other.id);
	}
	
}
