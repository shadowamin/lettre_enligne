package MetierImpl;

import java.util.List;

import models.Client;
import models.Lettre;

public interface ClientMetierImpl {
	public Client getClient(String mail , String mp);
	public void saveClient(Client client);
	public void add_lettre(Client client ,Lettre lettre);
	public List<Lettre> Get_liste_lettres(Client c);
}
