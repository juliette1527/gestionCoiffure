import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Reservation } from '../models/reservation.model';

@Injectable({
  providedIn: 'root'
})
export class ReservationService {
  private BASE_URL = "http://localhost:8080/reservations";
  constructor(private httpClient:HttpClient) { }
 
 
  public findAll():Observable<any>{
    return this.httpClient.get(this.BASE_URL);
  }
  public save(reservation:Reservation):Observable<any>{
    return this.httpClient.post(this.BASE_URL,reservation);
  }
  public delete(id:number):Observable<any>{
    return this.httpClient.delete(this.BASE_URL+"/"+id);
  }
}

