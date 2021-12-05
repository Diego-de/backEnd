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

import com.br.happen.entities.Trilhas;
import com.br.happen.service.TrilhasService;

@RestController
@RequestMapping("/trilhas")
public class TrilhasController {

	@Autowired
	TrilhasService TrilhasService ;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Trilhas> findById(@PathVariable long id){
		Trilhas Trilhas = TrilhasService.findById(id);
		return ResponseEntity.ok().body(Trilhas);
	}
	
	@PostMapping
	public ResponseEntity<Void> SalvarTrilhas(@RequestBody Trilhas Trilhas){ 
		Trilhas = TrilhasService.salvar(Trilhas);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(Trilhas.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	
	@GetMapping	
	public  ResponseEntity<List<Trilhas>> buscarTodos(){
		List<Trilhas> list = TrilhasService.listar();
		return ResponseEntity.ok().body(list);
	}
}
