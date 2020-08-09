package com.carol.cafood.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carol.cafood.domain.model.Cidade;
import com.carol.cafood.domain.model.Cozinha;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
