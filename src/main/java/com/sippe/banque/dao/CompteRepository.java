package com.sippe.banque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sippe.banque.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}
