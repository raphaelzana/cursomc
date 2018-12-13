package com.raphaelzana.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphaelzana.cursomc.domain.Categoria;
import com.raphaelzana.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		return repo.findById(id).orElseThrow(null);
	}
	
}
