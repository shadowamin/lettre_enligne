package DaoImp;

import models.Lettre;

public interface LettredaoImpl {
	public void ajouter_lettre(Lettre lettre);
	public void changer_etat(int etat , Lettre lettre);
}
