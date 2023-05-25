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
@Table(name ="SALONS", schema ="gestion_salon_coiffure")
public class Salon implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSalon;
	private String nameSalon;
	private String adress;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="reservationSalon_id")
	private Reservation reservationSalon;
	
	public Salon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Salon(String nameSalon, String adress, Reservation reservationSalon) {
		super();
		this.nameSalon = nameSalon;
		this.adress = adress;
		this.reservationSalon = reservationSalon;
	}

	public Long getIdSalon() {
		return idSalon;
	}
	public void setIdSalon(Long idSalon) {
		this.idSalon = idSalon;
	}
	public String getNameSalon() {
		return nameSalon;
	}
	public void setNameSalon(String nameSalon) {
		this.nameSalon = nameSalon;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Reservation getReservationSalon() {
		return reservationSalon;
	}

	public void setReservationSalon(Reservation reservationSalon) {
		this.reservationSalon = reservationSalon;
	}

	@Override
	public String toString() {
		return "Salon [idSalon=" + idSalon + ", nameSalon=" + nameSalon + ", adress=" + adress + ", reservationSalon="
				+ reservationSalon + "]";
	}
	
	
}
