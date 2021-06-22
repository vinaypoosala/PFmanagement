package com.pfmanage.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfmanage.management.model.Employee;
import com.pfmanage.management.model.ProvidentFund;
import com.pfmanage.management.model.Salary;
import com.pfmanage.management.service.EmployeeSerivce;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeSerivce employeeSerivce;
	
	
	@GetMapping("/all")
	public List<Employee> getAll(){
		return employeeSerivce.getAll();
	}
	
	
	@PostMapping("/createEmployee")
	public Employee createEmployee(@RequestBody Employee employee) {
		
		return employeeSerivce.saveEmployee(employee);
	}
	
	@PostMapping("/saveSalary/{id}")
	public Salary saveSalary(@PathVariable("id") int id , @RequestBody Salary salary) {
		
		return employeeSerivce.saveSalary(id,salary);
	}
	
	@GetMapping("/find/{id}")
	public Employee getByID(@PathVariable("id") int id) {
		return employeeSerivce.getEmployeeById(id);
	}
	@GetMapping("/getSalaryByEmployeeId/{id}")
	public List<Salary> getSalaries(@PathVariable("id") int id){
		return employeeSerivce.getSalaryByEmployeeId(id);

	}
	
	@GetMapping("/getPFByEmployeeId/{id}")
	public List<ProvidentFund> getPF(@PathVariable("id") int id){
		return employeeSerivce.getPFByEmployeeId(id);

	}
}
