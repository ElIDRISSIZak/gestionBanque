package com.sippe.banque;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sippe.banque.dao.ClientRepository;
import com.sippe.banque.dao.CompteRepository;
import com.sippe.banque.entities.Client;
import com.sippe.banque.entities.Compte;
import com.sippe.banque.entities.CompteCourant;

/**
 * Handles requests for the application home page.
 */
@RestController
public class HomeController {
	
	@Autowired
	private ClientRepository repos;
	@Autowired
	private CompteRepository reposCompte;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value = "/client", method = RequestMethod.GET)
	public Client getCustomers() {
		//Client cl = new Client("idrissi", "Zakaria", "03215648", "zak@gmail.com");
		Client cl = (Client) repos.findOne(1L);
		return cl;
	}
	@RequestMapping(value = "/compte", method = RequestMethod.GET)
	public Compte saveCompte() {
		//Client cl = new Client("idrissi", "Zakaria", "03215648", "zak@gmail.com");
		CompteCourant cc =new CompteCourant();
		cc.setSolde1("azerty");
		cc.setCodeCompte("cp1");
		cc.setSolde(1000);
		reposCompte.save(cc);
		return cc;
	}
	
}
