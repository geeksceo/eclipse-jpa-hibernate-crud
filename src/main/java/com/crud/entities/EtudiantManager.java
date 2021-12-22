package com.crud.entities;

import javax.persistence.*;
import com.crud.models.Etudiant;

public class EtudiantManager {
	static EntityManagerFactory factory;
	static EntityManager entityManager;

	public static void main(String[] args) {
		
		factory = Persistence.createEntityManagerFactory("EtudiantUnit");
		entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		create();
		
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}
	
	private static void create() {
		Etudiant etudiant = new Etudiant();
		etudiant.setFirstname("Nataniel");
		etudiant.setLastname("OWAGOKE");
		etudiant.setNce("CI0118050544");
		etudiant.setTel("+2250707941631");
		
		entityManager.persist(etudiant);
	}

}
