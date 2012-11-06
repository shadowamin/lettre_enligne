package metier;

import dao.LettreDao;
import models.Lettre;
import MetierImpl.LettreMetierImpl;

public class LettreMetier implements LettreMetierImpl{
LettreDao ld = new LettreDao();

	public LettreDao getLd() {
	return ld;
}

public void setLd(LettreDao ld) {
	this.ld = ld;
}

	@Override
	public void ajouter_lettre(Lettre lettre) {
		ld.ajouter_lettre(lettre);
	}

	@Override
	public void changer_etat(int etat, Lettre lettre) {
		ld.changer_etat(etat, lettre);
		
	}

}
