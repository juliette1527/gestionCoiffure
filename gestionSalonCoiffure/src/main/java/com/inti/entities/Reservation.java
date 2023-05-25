package com.inti.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="RESERVATIONS", schema ="gestion_salon_coiffure")
public class Reservation implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@OneToMany(mappedBy = "reservationPrestation", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Prestation> prestations = new ArrayList<>();

	@OneToMany(mappedBy = "reservationSalon", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Prestation> salons = new ArrayList<>();
	
	@ManyToOne
	private Utilisateur utilisateur;
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Reservation(Date date, Utilisateur utilisateur) {
		super();
		this.date = date;
		this.utilisateur = utilisateur;
	}

	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Prestation> getPrestations() {
		return prestations;
	}

	public void setPrestations(List<Prestation> prestations) {
		this.prestations = prestations;
	}

	public List<Prestation> getSalons() {
		return salons;
	}

	public void setSalons(List<Prestation> salons) {
		this.salons = salons;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", date=" + date + ", utilisateur=" + utilisateur + "]";
	}


	
}
