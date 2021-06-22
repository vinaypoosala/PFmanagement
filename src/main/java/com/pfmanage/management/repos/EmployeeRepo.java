package com.pfmanage.management.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfmanage.management.model.Employee;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{

}
