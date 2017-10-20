package br.com.cookiesoft.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cookiesoft.brewer.model.Cliente;

@Controller
public class ClienteController {

	@RequestMapping(value = "/cliente/novo")
	public String novo(Cliente cliente){
		return "cliente/CadastroCliente";
	}
}
