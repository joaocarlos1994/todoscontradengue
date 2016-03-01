package br.com.fatec.core.helper.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataBaseConnectionFactory {

	private static DataBaseConnectionFactory dataBaseConnectionFactory = null;
	
	public static DataBaseConnectionFactory getDataBaseConnectionFactory(){
		if(dataBaseConnectionFactory == null){
			dataBaseConnectionFactory = new DataBaseConnectionFactory();
		}
		
		return dataBaseConnectionFactory;
	}
	
	public EntityManager createConnectionDB(){
		
		EntityManager entityManager = null;
		
		if(entityManager == null){
			entityManager = Persistence.createEntityManagerFactory("default").createEntityManager();
		}
		
		return entityManager;
		
	}

}
