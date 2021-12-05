package com.br.happen.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.happen.entities.Aprendiz;
import com.br.happen.entities.Perguntas;
import com.br.happen.service.PerguntasService;



@RestController
@RequestMapping("/perguntas")
public class PerguntasController {

	@Autowired
	PerguntasService perguntasService ;
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Perguntas> findById(@PathVariable long id){
		Perguntas perguntas = perguntasService.findById(id);
		return ResponseEntity.ok().body(perguntas);
	}
	
	@PostMapping
	public ResponseEntity<Void> SalvarAprendiz(@RequestBody Perguntas perguntas){ 
		perguntas = perguntasService.salvar(perguntas);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(perguntas.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	
	@GetMapping	
	public  ResponseEntity<List<Perguntas>> buscarTodos(){
		List<Perguntas> list = perguntasService.listar();
		return ResponseEntity.ok().body(list);
	}
	
}
