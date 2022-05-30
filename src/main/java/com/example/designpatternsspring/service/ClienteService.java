package com.example.designpatternsspring.service;

import com.example.designpatternsspring.model.Cliente;

public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);
	
	Cliente buscarPorNome(String nome);
	
	Iterable<Cliente> buscarPorUF(String uf);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
