package com.FAccount.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name = "tb_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long id;
	
	@Column(name="user_name")
	private String name;
	
	@Column(name="user_age")
	private Integer age;
	
	@Column(name="CPF")
	private String cpf;
	
	@Column(name="user_cell")
	private Double cell;
	
	@Column(name="user_email")
	private String email;
	
	@Column(name="user_address")
	private String address;
	
	@Column(name="user_MaritalStatus")
	private String maritalStatus;
	
	public User() {
	}

	public User(String name, Integer age, String Cpf, Double cell, String email, String address,
			String maritalStatus) {
		super();
		this.name = name;
		this.age = age;
		cpf = Cpf;
		this.cell = cell;
		this.email = email;
		this.address = address;
		this.maritalStatus = maritalStatus;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getCell() {
		return cell;
	}

	public void setCell(Double cell) {
		this.cell = cell;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, cpf, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", cpf=" + cpf + ", cell=" + cell
				+ ", email=" + email + ", address=" + address + ", maritalStatus=" + maritalStatus + "]";
	}
	
	
	
}
