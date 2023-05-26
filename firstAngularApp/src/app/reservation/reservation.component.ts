import { Component, OnInit } from '@angular/core';
import { ReservationService } from '../services/reservation.service';
import { Reservation } from '../models/reservation.model';

@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.css'],
  providers:[]
})
export class ReservationComponent implements OnInit {
  reservations!:any[];
  reservation:Reservation=new Reservation();


  constructor(private reservationService:ReservationService){


  }


  ngOnInit(): void {
    this.findAllReservation();
  }
  findAllReservation()
  {
    this.reservationService.findAll().subscribe(data => {this.reservations = data});
  }
  saveReservation(){
    this.reservationService.save(this.reservation).subscribe(
      () => {
        // MAJ la liste des utilisateurs
        this.findAllReservation();
        // Vider le formulaire
        this.reservation = new Reservation();
      }
    )
  }
  deleteReservation(id:number){
    this.reservationService.delete(id).subscribe(
      () => {
        this.findAllReservation();
      }
    )
  }

}
