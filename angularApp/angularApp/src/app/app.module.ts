import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './home/home.component';
import { EvenementComponent } from './evenement/evenement.component';
import { NouvelEvenementComponent } from './nouvel-evenement/nouvel-evenement.component';
import { ListeEvenementComponent } from './liste-evenement/liste-evenement.component';
import { MaterialModule } from './material-module';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    EvenementComponent,
    NouvelEvenementComponent,
    ListeEvenementComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
