package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import models.Lettre;
import DaoImp.LettredaoImpl;
public class LettreDao implements LettredaoImpl{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
	EntityManager em = emf.createEntityManager();
	
	
	public void ajouter_lettre(Lettre lettre)
	{
		em.getTransaction().begin();
		em.persist(lettre);
		em.getTransaction().commit();
		
	}
	
	public void changer_etat(int etat , Lettre lettre)
	{
		lettre.setEtat(etat);
		em.getTransaction().begin();
		em.merge(lettre);
		em.getTransaction().commit();
		
	}
	
}
