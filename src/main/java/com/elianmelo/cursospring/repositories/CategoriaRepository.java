/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 27/06/2019
Resumo: Classe Repository que realiza consultas no banco de dados referentes a categoria
Referência ao enunciado/origem do exercício: https://www.udemy.com/spring-boot-ionic/
*/

package com.elianmelo.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elianmelo.cursospring.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
