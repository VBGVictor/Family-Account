package com.FAccount.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false, length=5000)
	private Long id;
	
	@Column(name="Name", nullable=false, length=60)
	private String name;
	
	@Column(name="Kinship", nullable=false, length=60)
	private Kinship kinship;
	
	@Column(name="Age", nullable=false, length=3)
	private Integer age;
	
	@Column(name="CPF", nullable=false, length=15)
	private String cpf;
	
	@Column(name="Cell", nullable=false, length=40)
	private Integer cell;
	
	@Column(name="e-mail", nullable=false, length=75)
	private String email;
	
	@Column(name="Address", nullable=false, length=100)
	private String address;
	
	@Column(name="Marital Status", nullable=false, length=30)
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

	public Kinship getKinship() {
		return kinship;
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
