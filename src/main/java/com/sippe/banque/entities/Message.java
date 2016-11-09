package com.sippe.banque.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Message implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String objet;
	private String contenu;
	private String dateEnvoi;
	@ManyToOne
	@JoinColumn(name="client")
	private Client client;
	@ManyToOne
	@JoinColumn(name="employee")
	private Employee emp;

	private String codeSender;
	
	
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String objet, String contenu, String dateEnvoi) {
		super();
		this.objet = objet;
		this.contenu = contenu;
		this.dateEnvoi = dateEnvoi;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public String getDateEnvoi() {
		return dateEnvoi;
	}
	public void setDateEnvoi(String dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	public String getCodeSender() {
		return codeSender;
	}
	public void setCodeSender(String codeSender) {
		this.codeSender = codeSender;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}

}
