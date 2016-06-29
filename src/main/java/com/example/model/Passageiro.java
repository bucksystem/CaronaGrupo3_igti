package com.example.model;

public class Passageiro extends Pessoa{
	private boolean jaPegouCarona;
	private Endereco enderecoLocalizacao;

	public boolean isJaPegouCarona() {
		return jaPegouCarona;
	}
	public void setJaPegouCarona(boolean jaPegouCarona) {
		this.jaPegouCarona = jaPegouCarona;
	}
	public Endereco getEnderecoLocalizacao() {
		return enderecoLocalizacao;
	}
	public void setEnderecoLocalizacao(Endereco enderecoLocalizacao) {
		this.enderecoLocalizacao = enderecoLocalizacao;
	}
}
