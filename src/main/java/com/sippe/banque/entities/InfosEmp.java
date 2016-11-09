package com.sippe.banque.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class InfosEmp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String niveauEtud;
	private String descDiplome;
	private String nbrAnnee;
	private double salaire;
	private String ancienete;
	public InfosEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InfosEmp(String niveauEtud, String descDiplome, String nbrAnnee, double salaire, String ancienete) {
		super();
		this.niveauEtud = niveauEtud;
		this.descDiplome = descDiplome;
		this.nbrAnnee = nbrAnnee;
		this.salaire = salaire;
		this.ancienete = ancienete;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNiveauEtud() {
		return niveauEtud;
	}
	public void setNiveauEtud(String niveauEtud) {
		this.niveauEtud = niveauEtud;
	}
	public String getDescDiplome() {
		return descDiplome;
	}
	public void setDescDiplome(String descDiplome) {
		this.descDiplome = descDiplome;
	}
	public String getNbrAnnee() {
		return nbrAnnee;
	}
	public void setNbrAnnee(String nbrAnnee) {
		this.nbrAnnee = nbrAnnee;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public String getAncienete() {
		return ancienete;
	}
	public void setAncienete(String ancienete) {
		this.ancienete = ancienete;
	}
	
	
}
