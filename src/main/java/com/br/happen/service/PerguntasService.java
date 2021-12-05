package com.br.happen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.happen.entities.Perguntas;
import com.br.happen.repositories.PerguntasRepository;

@Service
public class PerguntasService {

	@Autowired
	PerguntasRepository perguntasRepository; 
	
	
	public Perguntas salvar(Perguntas perguntas) {
		return perguntasRepository.save(perguntas);
	}
	
	public List<Perguntas> listar() {
		return perguntasRepository.findAll();
	}
	
	public Perguntas findById(long id) {
		Optional<Perguntas> perguntas = perguntasRepository.findById(id);
		return perguntas.orElse(null);
	}
	
	
}
