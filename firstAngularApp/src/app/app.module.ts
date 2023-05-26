import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UtilisateurComponent } from './utilisateur/utilisateur.component';
import { RoleComponent } from './role/role.component';
import { FormsModule } from '@angular/forms';
import { MyDirectiveDirective } from './directives/my-directive.directive';
import { SqrtPipe } from './pipes/sqrt.pipe';
import { UtilisateurService } from './services/utilisateur.service';
import {HttpClientModule} from '@angular/common/http';
import { ReservationComponent } from './reservation/reservation.component';
import { AvisComponent } from './avis/avis.component';
import { AvisService } from './services/avis.service';

@NgModule({
  declarations: [
    AppComponent,
    UtilisateurComponent,
    RoleComponent,
    MyDirectiveDirective,
    SqrtPipe,
    ReservationComponent
    AvisComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,  // [(ngModel)] : Two-way DataBinding
    HttpClientModule // Pour utiliser les verbes http : GET,POST,PUT,DELETE
  ],
  providers: [AvisService], // Les services
  bootstrap: [AppComponent]
})
export class AppModule { }
