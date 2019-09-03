package com.eba.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eba.employees.model.Employee;

// @Repository This annotation is not necessary
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
