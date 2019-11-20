package com.elianmelo.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elianmelo.cursospring.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
