package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import models.Client;
import models.Lettre;

public class ClientDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
	EntityManager em = emf.createEntityManager();
	
	public Client getClient(String mail , String mp)
	{
		Query query = em.createQuery("select c from client where c.mail = ?1 and c.mot_de_pass= ?2");
		query.setParameter(1, mail);
		query.setParameter(2, mp);
		Client cli = (Client) query.getSingleResult();
		
		return cli;
		
	}
	
	
	public void saveClient(Client client)
	{
		em.getTransaction().begin();
		em.persist(client);
		em.getTransaction().commit();
	}
	
	
	public void add_lettre(Client client ,Lettre lettre)
	{
		em.getTransaction().begin();
		client.getLeslettres().add(lettre);
		em.merge(client);
		em.getTransaction().commit();
	}
	
	public List<Lettre> Get_liste_lettres(Client c)
	{
		Query query2 = em.createQuery("select l from lettre l where l.id_cli = ?1");
		query2.setParameter(1, c.getMail());
		List<Lettre> lettres = query2.getResultList();
			return lettres;
	}
	
	
	
	
}
