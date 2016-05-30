package br.com.fiap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoUtil {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FiapServlets");
	
	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
