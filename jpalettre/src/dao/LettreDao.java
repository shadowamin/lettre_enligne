package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import models.Lettre;
import DaoImp.LettredaoImpl;

@Repository
@Component
public class LettreDao implements LettredaoImpl{
	 @PersistenceContext
	EntityManager em ;
	
	
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
