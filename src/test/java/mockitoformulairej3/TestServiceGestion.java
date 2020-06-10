package mockitoformulairej3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import mockitoformulairej3.dao.UserDAO;
import mockitoformulairej3.metier.User;
import mockitoformulairej3.service.ServiceGestion;



public class TestServiceGestion {

	/**
	 * Test unitaire de la classe ServiceGestion
	 */
	@Test
	public void testGetUser() {

		/*
		 * Sc�nario du test : La demande de lecture d'informations d'un utilisateur
		 * a partir de son email retourne l'ensemble  de ses caract�ristiques.
		 */

		// TODO 2. Mocker l'interface du DAO

		UserDAO dao = Mockito.mock(UserDAO.class);

		// 1. Cr�er le service

		ServiceGestion service = new ServiceGestion(dao);

		// 3a. Imposer un comportement au mock (stubbing)

		Mockito.when(dao.getUser("ahmadou19@gmail.com")).thenReturn(new User("ahmadou19@gmail.com", "password", "lo", "Ahmadou"));

		// 3.b Appeler une m�thode du service (r�sultat r�el)

		User userRetour = service.getUser("ahmadou19@gmail.com");

		// 4. Comparer le r�sultat r�el avec le r�sultat attendu

		Assert.assertEquals(userRetour.getLogin(), "ahmadou19@gmail.com");
		Mockito.verify(dao).getUser("ahmadou19@gmail.com");
	}
}
