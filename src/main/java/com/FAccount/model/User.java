package com.FAccount.model;

import java.util.Objects;

public class User {

	private String name;
	private Kinship kinship;
	private Integer age;
	private String cpf;
	private Integer cell;
	private String email;
	private String address;
	private String maritalStatus;
	
	public User() {
	}

	public User(String name, Kinship kinship, Integer age, String Cpf, Integer cell, String email, String address,
			String maritalStatus) {
		super();
		this.name = name;
		this.kinship = kinship;
		this.age = age;
		cpf = Cpf;
		this.cell = cell;
		this.email = email;
		this.address = address;
		this.maritalStatus = maritalStatus;
	}

	public Kinship getHierarchy() {
		return kinship;
	}

	public void setHierarchy(Kinship hierarchy) {
		this.kinship = hierarchy;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getCell() {
		return cell;
	}

	public void setCell(Integer cell) {
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
		return "User [name=" + name + ", kinship=" + kinship + ", age=" + age + ", cpf=" + cpf + ", cell=" + cell
				+ ", email=" + email + ", address=" + address + ", maritalStatus=" + maritalStatus + "]";
	}
	
	
	
}
