package com.sippe.banque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sippe.banque.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {

}
