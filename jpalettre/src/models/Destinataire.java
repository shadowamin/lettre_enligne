package models;

import javax.persistence.Id;

public class Destinataire {
	@Id
	private String id_dest;
	private String nom ;
	private String adress;
	public String getId_dest() {
		return id_dest;
	}
	public void setId_dest(String id_dest) {
		this.id_dest = id_dest;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Destinataire [getId_dest()=" + getId_dest() + ", getNom()="
				+ getNom() + ", getAdress()=" + getAdress() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((id_dest == null) ? 0 : id_dest.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		Destinataire other = (Destinataire) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (id_dest == null) {
			if (other.id_dest != null)
				return false;
		} else if (!id_dest.equals(other.id_dest))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	
	
	
}
