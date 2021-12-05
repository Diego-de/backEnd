package com.br.happen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.happen.entities.Respostas;


@Repository
public interface RespostasRepository extends JpaRepository<Respostas, Long> {

}
