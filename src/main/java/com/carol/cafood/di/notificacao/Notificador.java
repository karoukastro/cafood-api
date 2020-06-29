package com.carol.cafood.di.notificacao;

import com.carol.cafood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}