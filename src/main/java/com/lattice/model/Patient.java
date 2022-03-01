package com.lattice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@NotBlank(message = "Name is required")
	@Size(min=3, max=20)
	private String name;
	
	@NotBlank(message = "Address is required")
	@Size(min=10)
	private String address;
	
	@NotBlank(message = "Email is required")
	@Email
	private String email;
	
	@NotBlank(message = "Phone Number is required")
	@Size(min=10,max=10)
	private String phoneno;
	
	@NotBlank(message = "Password is required")
	@Size(min = 8, max=15 ,message = "Password should have minimum 8 characters & maximum 15 characters")
	private String password;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int id, @NotBlank(message = "Name is required") @Size(min = 3) String name,
			@NotBlank(message = "Address is required") @Size(min = 10) String address,
			@NotBlank(message = "Email is required") @Email String email,
			@NotBlank(message = "Phone Number is required") @Size(min = 10, max = 10) String phoneno,
			@NotBlank(message = "Password is required") @Size(min = 8, max = 15, message = "Password should have minimum 8 characters & maximum 15 characters") String password
			) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneno = phoneno;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phoneno="
				+ phoneno + ", password=" + password + "]";
	}

	
}
