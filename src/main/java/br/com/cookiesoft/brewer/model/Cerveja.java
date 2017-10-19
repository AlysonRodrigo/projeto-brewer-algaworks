package br.com.cookiesoft.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {

	private String sku;
	private String nome;
	private String descricao;

	@NotBlank(message = "SKU é obrigatório")
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	@NotBlank(message = "NOME é obrigatório")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@NotBlank(message = "A DESCRIÇÃO é obrigatório") @Size(max = 50, message = "A DESCRIÇÃO deve ter no máximo 50")
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
