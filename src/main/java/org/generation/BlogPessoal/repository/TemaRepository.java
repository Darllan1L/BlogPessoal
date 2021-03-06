package org.generation.BlogPessoal.repository;

import java.util.List;

import org.generation.BlogPessoal.models.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository< Tema ,Long> {
	
	public List<Tema> findAllByAssuntoContainingIgnoreCase(String assunto);

}