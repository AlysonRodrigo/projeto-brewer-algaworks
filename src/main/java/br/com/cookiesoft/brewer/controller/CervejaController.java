package br.com.cookiesoft.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.cookiesoft.brewer.model.Cerveja;

@Controller
public class CervejaController {

	@RequestMapping("/cerveja/novo")
	public String novo(Cerveja cerveja){
		return "cerveja/CadastroCerveja";
	}
	
	@RequestMapping(value = "/cerveja/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes){
	
		if(result.hasErrors()){
			return novo(cerveja);
		}
		
		attributes.addFlashAttribute("mensagem","Cerveja salva com sucesso");
		System.out.println(">>> sku " + cerveja.getSku());
		return "redirect:/cerveja/novo";
	}
	
	@RequestMapping("/cerveja/cadastro")
	public String cadastro(){
		return "cerveja/cadastro-produto";
	}
}
