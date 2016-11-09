package com.sippe.banque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sippe.banque.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
