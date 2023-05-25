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
@Table(name ="PRESTATIONS", schema ="gestion_salon_coiffure")
public class Prestation implements Serializable{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrestation;
	private String namePrestation;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="reservationPrestation_id")
	private Reservation reservationPrestation;
	
	public Prestation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prestation(String namePrestation, Reservation reservationPrestation) {
		super();
		this.namePrestation = namePrestation;
		this.reservationPrestation = reservationPrestation;
	}

	public Long getIdPrestation() {
		return idPrestation;
	}
	public void setIdPrestation(Long idPrestation) {
		this.idPrestation = idPrestation;
	}
	public String getNamePrestation() {
		return namePrestation;
	}
	public void setNamePrestation(String namePrestation) {
		this.namePrestation = namePrestation;
	}
	public Reservation getReservationPrestation() {
		return reservationPrestation;
	}

	public void setReservationPrestation(Reservation reservationPrestation) {
		this.reservationPrestation = reservationPrestation;
	}

	@Override
	public String toString() {
		return "Prestation [idPrestation=" + idPrestation + ", namePrestation=" + namePrestation
				+ ", reservationPrestation=" + reservationPrestation + "]";
	}

	
	
}
