package com.carol.cafood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.carol.cafood.domain.exception.EntidadeEmUsoException;
import com.carol.cafood.domain.exception.EntidadeNaoEncontradaException;
import com.carol.cafood.domain.model.Cozinha;
import com.carol.cafood.domain.model.Restaurante;
import com.carol.cafood.domain.repository.CozinhaRepository;
import com.carol.cafood.domain.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {
	
	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		Cozinha cozinha = cozinhaRepository.findById(cozinhaId)
				.orElseThrow(()-> new EntidadeNaoEncontradaException(
						String.format("Não existe cadastro de cozinha com código %d", cozinhaId)));
				
		restaurante.setCozinha(cozinha);
		
		return restauranteRepository.save(restaurante);
	}
	
	public void excluir(Long restauranteId) {
		try {
			restauranteRepository.deleteById(restauranteId);
		}catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
					String.format("Nao existe um cadastro de restaurante com o codigo %d", restauranteId));
		}
		catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format("Restaurante de codigo %d nao pode ser removida, pois esta em uso", restauranteId));
		}

	}
	

}
