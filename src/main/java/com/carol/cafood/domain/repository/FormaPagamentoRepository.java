package com.carol.cafood.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carol.cafood.domain.model.FormaPagamento;
import com.carol.cafood.domain.model.Restaurante;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long> {

	
}


