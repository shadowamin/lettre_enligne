package models;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Lettre {

	@Id
	private String idlettre;
	private int etat ;
	private String type;
	private int nb_page;

	@OneToMany(cascade=CascadeType.MERGE)
	private List<Destinataire> list_dist;
	public String getIdlettre() {
		return idlettre;
	}
	public void setIdlettre(String idlettre) {
		this.idlettre = idlettre;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNb_page() {
		return nb_page;
	}
	public void setNb_page(int nb_page) {
		this.nb_page = nb_page;
	}
	public List<Destinataire> getList_dist() {
		return list_dist;
	}
	public void setList_dist(List<Destinataire> list_dist) {
		this.list_dist = list_dist;
	}
	@Override
	public String toString() {
		return "Lettre [getIdlettre()=" + getIdlettre() + ", getEtat()="
				+ getEtat() + ", getType()=" + getType() + ", getNb_page()="
				+ getNb_page() + ", getList_dist()=" + getList_dist() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + etat;
		result = prime * result
				+ ((idlettre == null) ? 0 : idlettre.hashCode());
		result = prime * result
				+ ((list_dist == null) ? 0 : list_dist.hashCode());
		result = prime * result + nb_page;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lettre other = (Lettre) obj;
		if (etat != other.etat)
			return false;
		if (idlettre == null) {
			if (other.idlettre != null)
				return false;
		} else if (!idlettre.equals(other.idlettre))
			return false;
		if (list_dist == null) {
			if (other.list_dist != null)
				return false;
		} else if (!list_dist.equals(other.list_dist))
			return false;
		if (nb_page != other.nb_page)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	
	
}
