package com.pfmanage.management.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProvidentFund {
	@Id
	@Column(name = "pf_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private double amount;
	
	private Date date;
	
	@ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public ProvidentFund(int id, double amount, Date date, Employee employee) {
		super();
		this.id = id;
		this.amount = amount;
		this.date = date;
		this.employee = employee;
	}
	
	
	public ProvidentFund() {
		// TODO Auto-generated constructor stub
	}
}
