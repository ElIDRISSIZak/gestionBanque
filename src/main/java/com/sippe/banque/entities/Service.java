package com.sippe.banque.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Service implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nomService;
	private String descService;
	private String telService;
	private String emailService;
	
	@OneToMany(mappedBy="service")
	private List<Employee> emps;
	@ManyToOne
    @JoinColumn(name = "agence")
	private Agence agence;
	@OneToOne
	private Employee empSup;
	
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service( String nomService, String descService, String telService, String emailService) {
		super();
		this.nomService = nomService;
		this.descService = descService;
		this.telService = telService;
		this.emailService = emailService;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomService() {
		return nomService;
	}
	public void setNomService(String nomService) {
		this.nomService = nomService;
	}
	public String getDescService() {
		return descService;
	}
	public void setDescService(String descService) {
		this.descService = descService;
	}
	public String getTelService() {
		return telService;
	}
	public void setTelService(String telService) {
		this.telService = telService;
	}
	public String getEmailService() {
		return emailService;
	}
	public void setEmailService(String emailService) {
		this.emailService = emailService;
	}
	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	public Employee getEmpSup() {
		return empSup;
	}
	public void setEmpSup(Employee empSup) {
		this.empSup = empSup;
	}
	
	
}
