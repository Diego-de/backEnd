package com.br.happen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.happen.entities.Aprendiz;
import com.br.happen.repositories.AprendizRepository;

@Service
public class AprendizService {
	
	@Autowired
	AprendizRepository aprendizRepository;
	
	public Aprendiz salvar(Aprendiz aprendiz) {
		return aprendizRepository.save(aprendiz);
	}
	
	public List<Aprendiz> listar() {
		return aprendizRepository.findAll();
	}

	public Aprendiz findById(long id) {
		Optional<Aprendiz> aprendiz = aprendizRepository.findById(id);
		return aprendiz.orElse(null);
	}


	

}
