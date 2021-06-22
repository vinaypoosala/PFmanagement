package com.pfmanage.management.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfmanage.management.model.Salary;

@Repository
public interface SalaryRepo extends JpaRepository<Salary, Integer>{

	List<Salary> findAllByEmployeeId(int id);

}
