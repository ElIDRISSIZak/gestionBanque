package com.sippe.banque.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sippe.banque.dao.ClientRepository;
import com.sippe.banque.entities.Client;
@Service
public class ClientMetierImpl implements ClientMetier{

	@Autowired
	private ClientRepository reposClient;
	@Override
	public Client getClient(Long id) {
		// TODO Auto-generated method stub
		return reposClient.findOne(id);
	}

	@Override
	public Client updateClient(Client cl) {
		// TODO Auto-generated method stub
		return reposClient.saveAndFlush(cl);
	}

	@Override
	public void deleteClient(Long id) {
		if(reposClient.getOne(id) != null)
			reposClient.delete(reposClient.findOne(id));
		
	}

	@Override
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return reposClient.findAll();
	}

	@Override
	public Client findByName(String name) {
		// TODO Auto-generated method stub
		return (Client) reposClient.findByName(name);
	}

}
