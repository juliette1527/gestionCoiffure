import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UtilisateurComponent } from './utilisateur/utilisateur.component';
import { ReservationComponent } from './reservation/reservation.component';
import { AvisComponent } from './avis/avis.component';


const routes: Routes = [
  {
    path:'utilisateur', // localhost:4200/utilisateur
    component:UtilisateurComponent

  },
  {
    path:'reservation', // localhost:4200/utilisateur
    component:ReservationComponent
  }, 
  {
  path:'avis',
  component:AvisComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
