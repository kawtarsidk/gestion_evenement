import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ListeEvenementComponent } from './liste-evenement/liste-evenement.component';
import { NouvelEvenementComponent } from './nouvel-evenement/nouvel-evenement.component';
import { NouvelUserComponent } from './nouvel-user/nouvel-user.component';
import { NouveauCompteComponent } from './nouveau-compte/nouveau-compte.component';
import { ListeUsersComponent } from './liste-users/liste-users.component';
import { ListeDirComponent } from './liste-dir/liste-dir.component';


const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'liste-evenement', component : ListeEvenementComponent},
  { path: 'nouvel-evenement', component : NouvelEvenementComponent},
  { path: 'nouvel-user', component : NouvelUserComponent},
  { path: 'nouveau-compte', component : NouveauCompteComponent},
  { path: 'liste-users', component : ListeUsersComponent},
  { path: 'liste-dir', component : ListeDirComponent},
  { path: '',   redirectTo: '/home', pathMatch: 'full' }, 
  { path: '**', component: HomeComponent },
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
