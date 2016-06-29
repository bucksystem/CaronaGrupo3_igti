package com.example.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Carona {
	@Id
	private Long id;
	private Date inicioCarona;
	private Date finalCarona; 
	@DBRef
	private Endereco enderecoFinal;
	@DBRef
	private Passageiro passageiro;
	@DBRef
	private Motorista motorista;
		
	public Date getInicioCarona() {
		return inicioCarona;
	}
	public void setInicioCarona(Date inicioCarona) {
		this.inicioCarona = inicioCarona;
	}
	public Date getFinalCarona() {
		return finalCarona;
	}
	public void setFinalCarona(Date finalCarona) {
		this.finalCarona = finalCarona;
	}
	public Endereco getEnderecoFinal() {
		return enderecoFinal;
	}
	public void setEnderecoFinal(Endereco enderecoFinal) {
		this.enderecoFinal = enderecoFinal;
	}
	public Passageiro getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}	
}