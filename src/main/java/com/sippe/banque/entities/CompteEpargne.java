package com.sippe.banque.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CP")
public class CompteEpargne extends Compte{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String solde3;

	public String getSolde3() {
		return solde3;
	}

	public void setSolde3(String solde3) {
		this.solde3 = solde3;
	}
}
