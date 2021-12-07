package com.br.happen.controller;

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
import com.br.happen.entities.Aprendiz;
import com.br.happen.service.AprendizService;
import java.net.URI;

@CrossOrigin(origins = "https://weak-birthday.surge.sh/")
@RestController
@RequestMapping("/aprendiz")
public class AprendizController {

	
	@Autowired
	AprendizService  aprendizService ;
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Aprendiz> findById(@PathVariable long id){
		Aprendiz aprendiz = aprendizService.findById(id);
		return ResponseEntity.ok().body(aprendiz);
	}
	
	@PostMapping
	public ResponseEntity<Void> SalvarAprendiz(@RequestBody Aprendiz aprendiz){ 
		aprendiz = aprendizService.salvar(aprendiz);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(aprendiz.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	
	@GetMapping	
	public  ResponseEntity<List<Aprendiz>> buscarTodos(){
		List<Aprendiz> list = aprendizService.listar();
		return ResponseEntity.ok().body(list);
	}

	
	

	
	
	
}
