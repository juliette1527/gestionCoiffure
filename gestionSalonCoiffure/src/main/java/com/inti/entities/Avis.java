package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AVIS", schema = "gestion_salon_coiffure")
public class Avis implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAvis; 
	private String titre;
	private String description; 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idUtilisateur")
	private Utilisateur utilisateur;
	public Avis() {
	
	}
	public Avis(String titre, String description) {
		this.titre = titre;
		this.description = description;
	}
	public Avis(String titre, String description, Utilisateur utilisateur) {
		this.titre = titre;
		this.description = description;
		this.utilisateur = utilisateur;
	}
	public long getIdAvis() {
		return idAvis;
	}
	public void setIdAvis(long idAvis) {
		this.idAvis = idAvis;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", titre=" + titre + ", description=" + description + ", utilisateur="
				+ utilisateur + "]";
	}
	
	
	

}
