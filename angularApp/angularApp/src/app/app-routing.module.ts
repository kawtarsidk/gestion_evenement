import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ListeEvenementComponent } from './liste-evenement/liste-evenement.component';
import { NouvelEvenementComponent } from './nouvel-evenement/nouvel-evenement.component';
import { NouvelUserComponent } from './nouvel-user/nouvel-user.component';
import { NouveauCompteComponent } from './nouveau-compte/nouveau-compte.component';
import { ListeUsersComponent } from './liste-users/liste-users.component';
import { ListeDirComponent } from './liste-dir/liste-dir.component';
import { ListeRespLogistiqueComponent } from './liste-resp-logistique/liste-resp-logistique.component';
import { ModifierEvenementComponent } from './modifier-evenement/modifier-evenement.component';
import { DetailsEvenementComponent } from './details-evenement/details-evenement.component';


const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'liste-evenement', component : ListeEvenementComponent,
  children: [
    { path: 'modifier-evenement', component : ModifierEvenementComponent},
    { path: 'details-evenement', component : DetailsEvenementComponent}
  ]
},
  { path: 'nouvel-evenement', component : NouvelEvenementComponent},
  { path: 'nouvel-user', component : NouvelUserComponent},
  { path: 'nouveau-compte', component : NouveauCompteComponent},
  { path: 'liste-users', component : ListeUsersComponent},
  { path: 'liste-dir', component : ListeDirComponent},
  { path: 'liste-resp-logistique', component : ListeRespLogistiqueComponent},
  { path: '',   redirectTo: '/home', pathMatch: 'full' }, 
  { path: '**', component: HomeComponent },
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
