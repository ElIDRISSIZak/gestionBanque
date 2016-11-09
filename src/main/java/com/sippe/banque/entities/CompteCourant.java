package com.sippe.banque.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant  extends Compte{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String solde1;

	public String getSolde1() {
		return solde1;
	}

	public void setSolde1(String solde1) {
		this.solde1 = solde1;
	}
		
	
}
