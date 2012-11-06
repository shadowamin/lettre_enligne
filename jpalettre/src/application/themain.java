package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import MetierImpl.ClientMetierImpl;
import MetierImpl.LettreMetierImpl;
import models.Client;

public class themain {
	

	

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicataionContext.xml");
		ClientMetierImpl cm = (ClientMetierImpl)context.getBean("Climetier");
	//	LettreMetierImpl lm = (LettreMetierImpl)context.getBean("Lettremetier");
		
		Client c= new Client();
	
		c.setNom("amin");
		c.setMail("atitallah.amin@gmail.com");
		c.setMot_de_passe("evanlinken");
		c.setNum_tel((long) 21788307);
cm.saveClient(c);

	}

}
