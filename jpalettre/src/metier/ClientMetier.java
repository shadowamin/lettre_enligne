package metier;
import java.util.List;

import dao.ClientDao;

import models.Client;
import models.Lettre;
import MetierImpl.ClientMetierImpl;
public class ClientMetier implements ClientMetierImpl{

	ClientDao cd = new ClientDao();
	
	public ClientDao getCd() {
		return cd;
	}

	public void setCd(ClientDao cd) {
		this.cd = cd;
	}

	@Override
	public Client getClient(String mail, String mp) {
		
		return cd.getClient(mail, mp);
	}

	@Override
	public void saveClient(Client client) {
		cd.saveClient(client);
		
	}

	@Override
	public void add_lettre(Client client, Lettre lettre) {
		cd.add_lettre(client, lettre);
		
	}

	@Override
	public List<Lettre> Get_liste_lettres(Client c) {
		// TODO Auto-generated method stub
		return cd.Get_liste_lettres(c);
	}

}
