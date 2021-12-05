package com.br.happen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.happen.entities.Aprendiz;
import com.br.happen.repositories.AprendizRepository;

@SpringBootApplication
public class HappenApplication{
	
	public static void main(String[] args)  {
		SpringApplication.run(HappenApplication.class, args);
	}

}
