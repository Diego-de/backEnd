package com.br.happen.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_perguntas")
public class Perguntas 	implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String perguntas;
	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="perguntas_id")
	private List<Respostas> respostas;
	
	
	public Perguntas() {
		
	}
	
	public Perguntas(Long id, String perguntas) {
		this.id = id;
		this.perguntas = perguntas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(String perguntas) {
		this.perguntas = perguntas;
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
		Perguntas other = (Perguntas) obj;
		return Objects.equals(id, other.id);
	}

	
	

}
