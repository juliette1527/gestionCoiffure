import { Component, OnInit } from '@angular/core';
import { AvisService } from '../services/avis.service';
import { Avis } from '../models/avis.model';

@Component({
  selector: 'app-avis',
  templateUrl: './avis.component.html',
  styleUrls: ['./avis.component.css'],
  providers: []
})
export class AvisComponent implements OnInit{
 
 
  users!:any[]; 
  user:Avis=new Avis();
  // DI : par constructeur  
  constructor(private avisService:AvisService){
  }
  ngOnInit(): void {
    this.findAllAvis();
  }
  findAllAvis(){
    this.avisService.findAll().subscribe(data => {this.users = data});
  }
  saveAvis(){
    this.avisService.save(this.user).subscribe(
      () => {
        // MAJ la liste des utilisateurs
        this.findAllAvis();
        // Vider le formulaire
        this.user = new Avis();
      }
    )
  }
  deleteAvis(id:number){
    this.avisService.delete(id).subscribe(
      () => {
        this.findAllAvis();
      }
    )
  }
}

