package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Client {
	
	
	@Id
	private String mail;
	private String mot_de_passe;
	private String adress;
	private String nom;
	private Long num_tel;
	
	@OneToMany(cascade=CascadeType.MERGE)
	private List<Lettre> leslettres;
	
	public List<Lettre> getLeslettres() {
		return leslettres;
	}
	public void setLeslettres(List<Lettre> leslettres) {
		this.leslettres = leslettres;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Long getNum_tel() {
		return num_tel;
	}
	public void setNum_tel(Long num_tel) {
		this.num_tel = num_tel;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result
				+ ((leslettres == null) ? 0 : leslettres.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result
				+ ((mot_de_passe == null) ? 0 : mot_de_passe.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((num_tel == null) ? 0 : num_tel.hashCode());
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
		Client other = (Client) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (leslettres == null) {
			if (other.leslettres != null)
				return false;
		} else if (!leslettres.equals(other.leslettres))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (mot_de_passe == null) {
			if (other.mot_de_passe != null)
				return false;
		} else if (!mot_de_passe.equals(other.mot_de_passe))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (num_tel == null) {
			if (other.num_tel != null)
				return false;
		} else if (!num_tel.equals(other.num_tel))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Client [getLeslettres()=" + getLeslettres() + ", getMail()="
				+ getMail() + ", getMot_de_passe()=" + getMot_de_passe()
				+ ", getAdress()=" + getAdress() + ", getNom()=" + getNom()
				+ ", getNum_tel()=" + getNum_tel() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
