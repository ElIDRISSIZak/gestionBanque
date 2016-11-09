package com.sippe.banque.entities;

import java.io.Serializable;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Versement extends Operation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
}
