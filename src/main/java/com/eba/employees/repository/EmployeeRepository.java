package com.eba.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eba.employees.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
