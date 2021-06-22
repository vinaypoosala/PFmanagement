package com.pfmanage.management.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Salary> salaries;
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<ProvidentFund> providentFundDetails;

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

	public Set getSalaries() {
		return salaries;
	}

	public void setSalaries(Set salaries) {
		this.salaries = salaries;
	}

	public Set getProvidentFundDetails() {
		return providentFundDetails;
	}

	public void setProvidentFundDetails(Set providentFundDetails) {
		this.providentFundDetails = providentFundDetails;
	}

	public Employee(int id, String name, Set salaries, Set providentFundDetails) {
		super();
		this.id = id;
		this.name = name;
		this.salaries = salaries;
		this.providentFundDetails = providentFundDetails;
	}
	
	
	public Employee() {
		
	}
	
	
}
