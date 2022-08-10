package com.FAccount.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Banks")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false, length=30)
	private Long id;
	
	private String Santander;
	private String Itau;
	private String BancoBrasil;
	private String Bradesco;
	private String Caixa;
	private String Nubank;
	
	public Bank() {
	}

	public Bank(String santander, String itau, String bancoBrasil, String bradesco, String caixa, String nubank) {
		super();
		Santander = santander;
		Itau = itau;
		BancoBrasil = bancoBrasil;
		Bradesco = bradesco;
		Caixa = caixa;
		Nubank = nubank;
	}

	public String getSantander() {
		return Santander;
	}

	public String getItau() {
		return Itau;
	}

	public String getBancoBrasil() {
		return BancoBrasil;
	}

	public String getBradesco() {
		return Bradesco;
	}

	public String getCaixa() {
		return Caixa;
	}

	public String getNubank() {
		return Nubank;
	}

	@Override
	public int hashCode() {
		return Objects.hash(BancoBrasil, Bradesco, Caixa, Itau, Nubank, Santander);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		return Objects.equals(BancoBrasil, other.BancoBrasil) && Objects.equals(Bradesco, other.Bradesco)
				&& Objects.equals(Caixa, other.Caixa) && Objects.equals(Itau, other.Itau)
				&& Objects.equals(Nubank, other.Nubank) && Objects.equals(Santander, other.Santander);
	}
	
	
	
}
