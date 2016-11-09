package com.sippe.banque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.sippe.banque.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

	@Transactional	
	 @Query("SELECT c FROM Client c WHERE c.nom = :name ")
	List<Client> findByName(@Param("name") String name);

}
