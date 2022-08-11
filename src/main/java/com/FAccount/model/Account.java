package com.FAccount.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="account_id")
	private Long id;
	
	@Column(name="account_bank")
	private String bank;
	
	@Column(name="account_numberAccount")
	private Integer numberAccount;
	
	@Column(name="account_digit")
	private Integer digitAccount;
	
	@Column(name="account_agency")
	private Integer agency;
	
	@Column(name="account_numberBank")
	private Integer numberBank;
	
	public Account() {
	}

	public Account(String bank, Integer numberAccount, Integer digitAccount, Integer agency, Integer numberBank) {
		super();
		this.bank = bank;
		this.numberAccount = numberAccount;
		this.digitAccount = digitAccount;
		this.agency = agency;
		this.numberBank = numberBank;
	}

	public String getBank() {
		return bank;
	}

	public Integer getNumberAccount() {
		return numberAccount;
	}

	public Integer getDigitAccount() {
		return digitAccount;
	}

	public Integer getAgency() {
		return agency;
	}

	public Integer getNumberBank() {
		return numberBank;
	}

	@Override
	public int hashCode() {
		return Objects.hash(digitAccount, numberAccount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(digitAccount, other.digitAccount) && Objects.equals(numberAccount, other.numberAccount);
	}

	@Override
	public String toString() {
		return "Account [bank=" + bank + ", numberAccount=" + numberAccount + "-" + digitAccount
				+ ", agency=" + agency + ", numberBank=" + numberBank + "]";
	}
	
	
	
}
