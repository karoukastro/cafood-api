package com.carol.cafood.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carol.cafood.domain.model.Cozinha;

@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha, Long>{

	List<Cozinha> findCozinhasBynomeContaining(String nome);
	
	Optional<Cozinha> findCozinhaBynome(String nome);

	boolean existsByNome(String nome);

}