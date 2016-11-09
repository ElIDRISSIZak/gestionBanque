package com.sippe.banque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sippe.banque.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
