package com.carol.cafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carol.cafood.di.modelo.Cliente;
import com.carol.cafood.di.service.AtivacaoClienteService;

@Controller 
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente carol = new Cliente("Carol", "abc@abc.com", "11212121");
		
		ativacaoClienteService.ativar(carol);
		
		return "Carol";
	}
	

}
