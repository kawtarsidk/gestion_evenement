import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { EvenementComponent } from './evenement/evenement.component';


const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'evenement', component : EvenementComponent},
  { path: '',   redirectTo: '/home', pathMatch: 'full' }, 
  { path: '**', component: HomeComponent },
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
