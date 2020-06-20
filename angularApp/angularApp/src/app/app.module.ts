import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './home/home.component';
import { NouvelEvenementComponent } from './nouvel-evenement/nouvel-evenement.component';
import { ListeEvenementComponent } from './liste-evenement/liste-evenement.component';
import { MaterialModule } from './material-module';
import { NouveauCompteComponent } from './nouveau-compte/nouveau-compte.component';
import { NouvelUserComponent } from './nouvel-user/nouvel-user.component';
import { ListeUsersComponent } from './liste-users/liste-users.component';
import { ListeDirComponent } from './liste-dir/liste-dir.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NouvelEvenementComponent,
    ListeEvenementComponent,
    NouveauCompteComponent,
    NouvelUserComponent,
    ListeUsersComponent,
    ListeDirComponent
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
