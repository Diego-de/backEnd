package com.br.happen.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.happen.entities.Respostas;
import com.br.happen.service.RespostasService;

@CrossOrigin(origins = "https://weak-birthday.surge.sh/")
@RestController
@RequestMapping("/respostas")
public class RespostasController {

	@Autowired
	RespostasService respostasService ;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Respostas> findById(@PathVariable long id){
		Respostas repostas = respostasService.findById(id);
		return ResponseEntity.ok().body(repostas);
	}
	
	@PostMapping
	public ResponseEntity<Void> SalvarRepostas(@RequestBody Respostas respostas){ 
		respostas = respostasService.salvar(respostas);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(respostas.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	
	@GetMapping	
	public  ResponseEntity<List<Respostas>> buscarTodos(){
		List<Respostas> list = respostasService.listar();
		return ResponseEntity.ok().body(list);
	}
}
