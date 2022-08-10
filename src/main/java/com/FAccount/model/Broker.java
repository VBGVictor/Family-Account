package com.FAccount.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Broker")
public class Broker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false, length=30)
	private Long id;
	
	private String BTGPactual;
	private String XPInvestimentos;
	private String Rico;
	private String Modal;
	
	public Broker() {
	}

	public Broker(String bTGPactual, String xPInvestimentos, String rico, String modal) {
		super();
		BTGPactual = bTGPactual;
		XPInvestimentos = xPInvestimentos;
		Rico = rico;
		Modal = modal;
	}

	public String getBTGPactual() {
		return BTGPactual;
	}

	public String getXPInvestimentos() {
		return XPInvestimentos;
	}

	public String getRico() {
		return Rico;
	}

	public String getModal() {
		return Modal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(BTGPactual, Modal, Rico, XPInvestimentos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Broker other = (Broker) obj;
		return Objects.equals(BTGPactual, other.BTGPactual) && Objects.equals(Modal, other.Modal)
				&& Objects.equals(Rico, other.Rico) && Objects.equals(XPInvestimentos, other.XPInvestimentos);
	}
	
	
	
}
