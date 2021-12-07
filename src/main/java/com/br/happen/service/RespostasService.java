package com.br.happen.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.happen.entities.Respostas;
import com.br.happen.repositories.RespostasRepository;

@Service
public class RespostasService {

	@Autowired
	RespostasRepository respostasRepository; 
	
	
	public Respostas salvar(Respostas respostas) {
		return respostasRepository.save(respostas);
	}
	
	public List<Respostas> listar() {
		return respostasRepository.findAll();
	}
	
	public Respostas findById(long id) {
		Optional<Respostas> Respostas = respostasRepository.findById(id);
		return Respostas.orElse(null);
	}
	
	
	
}
