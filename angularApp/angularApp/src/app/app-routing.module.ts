import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { EvenementComponent } from './evenement/evenement.component';
import { ListeEvenementComponent } from './liste-evenement/liste-evenement.component';
import { NouvelEvenementComponent } from './nouvel-evenement/nouvel-evenement.component';


const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'evenement', component : EvenementComponent},
  { path: 'liste-evenement', component : ListeEvenementComponent},
  { path: 'nouvel-evenement', component : NouvelEvenementComponent},
  { path: '',   redirectTo: '/home', pathMatch: 'full' }, 
  { path: '**', component: HomeComponent },
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
