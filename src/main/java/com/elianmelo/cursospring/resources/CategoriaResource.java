/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 21/06/2019
Resumo: Classe Resource que fornece para o usuário categorias
Referência ao enunciado/origem do exercício: https://www.udemy.com/spring-boot-ionic/
*/

package com.elianmelo.cursospring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elianmelo.cursospring.domain.Categoria;
import com.elianmelo.cursospring.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj  = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}
