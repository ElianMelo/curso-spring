/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 02/07/2019
Resumo: Classe Repository que realiza consultas no banco de dados referentes a produto
Referência ao enunciado/origem do exercício: https://www.udemy.com/spring-boot-ionic/
*/

package com.elianmelo.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elianmelo.cursospring.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
