package com.carol.cafood.di.service;

import org.springframework.stereotype.Component;

import com.carol.cafood.di.modelo.Cliente;
import com.carol.cafood.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {

	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
