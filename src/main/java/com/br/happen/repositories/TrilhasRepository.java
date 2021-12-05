package com.br.happen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.happen.entities.Trilhas;


@Repository
public interface TrilhasRepository extends JpaRepository<Trilhas, Long>{

}
