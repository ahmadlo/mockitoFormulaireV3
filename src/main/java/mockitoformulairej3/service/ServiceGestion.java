/**
 * Classe utilisateur service du projet Formulaire Java JSP Servlet
 * 
 * @author Master 1 ED2O
 * @version 0.0.1
 */
package mockitoformulairej3.service;

import java.util.ArrayList;

import mockitoformulairej3.dao.UserDAO;
import mockitoformulairej3.metier.User;

public class ServiceGestion {
	
	private UserDAO userDAO;
	
	public ServiceGestion() {
		userDAO = new UserDAO();
	}
	
	public ServiceGestion(UserDAO dao) {
		// TODO Auto-generated constructor stub
		userDAO=dao;
	}

	public boolean authentificate(String mail, String password) {
		return userDAO.getUser(mail, password);
	}
	
	public User getUser(String mail) {
		return userDAO.getUser(mail);
	}
	
	public void create(String nom, String prenom, String mail, String mdp) {
		userDAO.createUser(nom, prenom, mail, mdp);
	}
	
	public ArrayList<User> getAll() {
		return userDAO.getAllUser();
	}
	
	public void update(String last_mail, String name, String first_name, String new_mail, String password) {
		userDAO.updateUser(last_mail, name, first_name, new_mail, password);
	}
}
