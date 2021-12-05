package com.br.happen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.happen.entities.Trilhas;
import com.br.happen.repositories.TrilhasRepository;

@Service
public class TrilhasService {

	@Autowired
	TrilhasRepository trilhasRepository; 
	
	
	public Trilhas salvar(Trilhas trilhas) {
		return trilhasRepository.save(trilhas);
	}
	
	public List<Trilhas> listar() {
		return trilhasRepository.findAll();
	}
	
	public Trilhas findById(long id) {
		Optional<Trilhas> trilhas = trilhasRepository.findById(id);
		return trilhas.orElse(null);
	}


	
	
}
