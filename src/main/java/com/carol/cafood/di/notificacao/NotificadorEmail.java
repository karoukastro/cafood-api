package com.carol.cafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.carol.cafood.di.modelo.Cliente;

@Component
public class NotificadorEmail {

	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
