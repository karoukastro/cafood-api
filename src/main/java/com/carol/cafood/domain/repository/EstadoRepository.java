package com.carol.cafood.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carol.cafood.domain.model.Cozinha;
import com.carol.cafood.domain.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{

	
}
