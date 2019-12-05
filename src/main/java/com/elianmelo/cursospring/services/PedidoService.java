/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 27/06/2019
Resumo: Classe de Serviço que fornece para o resource os dados de pedido já filtrados
Referência ao enunciado/origem do exercício: https://www.udemy.com/spring-boot-ionic/
*/

package com.elianmelo.cursospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elianmelo.cursospring.domain.Pedido;
import com.elianmelo.cursospring.repositories.PedidoRepository;
import com.elianmelo.cursospring.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}

}
