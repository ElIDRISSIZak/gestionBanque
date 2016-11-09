package com.sippe.banque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sippe.banque.entities.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {

}
