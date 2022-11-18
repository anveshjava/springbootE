package com.sigma.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="bloodgroup")
	private String bloodgroup;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public EmployeeEntity(int id, String name, String email, String bloodgroup) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.bloodgroup = bloodgroup;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", email=" + email + ", bloodgroup=" + bloodgroup + "]";
	}

	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(String name, String email, String bloodgroup) {
		super();
		this.name = name;
		this.email = email;
		this.bloodgroup = bloodgroup;
	}

}
