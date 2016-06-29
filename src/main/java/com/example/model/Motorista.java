package com.example.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Motorista extends Pessoa{
	private boolean estouDisponivel;
@DBRef
	private List<Carro> carros;
	@DBRef
	private List<Passageiro> passageiros;
	
	public boolean isEstouDisponivel() {
		return estouDisponivel;
	}
	public void setEstouDisponivel(boolean estouDisponivel) {
		this.estouDisponivel = estouDisponivel;
	}
	public List<Carro> getCarros() {
		return carros;
	}
	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
	public List<Passageiro> getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(List<Passageiro> passageiros) {
		this.passageiros = passageiros;
	}	
}

