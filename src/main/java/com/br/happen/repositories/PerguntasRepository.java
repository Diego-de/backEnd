package com.br.happen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.happen.entities.Perguntas;

@Repository
public interface PerguntasRepository  extends JpaRepository<Perguntas, Long>{

}
