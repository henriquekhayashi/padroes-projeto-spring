package com.example.designpatternsspring.model;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	
	Optional<Cliente> findByNome(String nome);
	Iterable<Cliente> findByEnderecoUf(String uf);
}
