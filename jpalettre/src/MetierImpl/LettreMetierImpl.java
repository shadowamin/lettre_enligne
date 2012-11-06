package MetierImpl;

import models.Lettre;

public interface LettreMetierImpl {
	public void ajouter_lettre(Lettre lettre);
	public void changer_etat(int etat , Lettre lettre);
}
