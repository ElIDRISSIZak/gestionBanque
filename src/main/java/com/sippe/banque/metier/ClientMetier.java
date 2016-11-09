package com.sippe.banque.metier;

import java.util.List;

import com.sippe.banque.entities.Client;

public interface ClientMetier {

	public Client getClient(Long id);
	public Client updateClient(Client cl);
	public void deleteClient(Long id);
	public List<Client> getClients();
	public Client findByName(String name);
}
