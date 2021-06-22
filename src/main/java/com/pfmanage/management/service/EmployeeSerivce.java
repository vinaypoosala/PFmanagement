package com.pfmanage.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfmanage.management.model.Employee;
import com.pfmanage.management.model.ProvidentFund;
import com.pfmanage.management.model.Salary;
import com.pfmanage.management.repos.EmployeeRepo;
import com.pfmanage.management.repos.PFRepo;
import com.pfmanage.management.repos.SalaryRepo;

@Service
public class EmployeeSerivce {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private SalaryRepo salaryRepo;
	
	
	@Autowired
	private PFRepo repo;
	
	
	
	
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll() ;
	}
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}
	
	public Employee getEmployeeById(int id) {
		
		return employeeRepo.findById(id).get();
	}
	public Salary saveSalary(int id, Salary salary) {
		Employee emp = getEmployeeById(id);
		salary.setEmployee(emp);
		
		ProvidentFund pf = new ProvidentFund();
		pf.setEmployee(emp);
		pf.setAmount(salary.getAmount()*.15);
		pf.setDate(salary.getDate());
		repo.save(pf);
		
		
		return salaryRepo.save(salary) ;
	}
	public List<Salary> getSalaryByEmployeeId(int id) {
		
		return salaryRepo.findAllByEmployeeId( id);
	}
	public List<ProvidentFund> getPFByEmployeeId(int id) {
		// TODO Auto-generated method stub
		return repo.findAllByEmployeeId( id);
	}
	

	
	
}
