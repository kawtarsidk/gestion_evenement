import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ListeEvenementComponent } from './liste-evenement/liste-evenement.component';
import { NouvelUserComponent } from './nouvel-user/nouvel-user.component';
import { NouvelEvenementComponent } from './nouvel-evenement/nouvel-evenement.component';
import { NouveauCompteComponent } from './nouveau-compte/nouveau-compte.component';
import { ParticipComponent } from './user/particip/particip.component';
import { UserComponent } from './user/user.component';
import { ModifUserComponent } from './modif-user/modif-user.component';
import { ViewUserComponent } from './view-user/view-user.component';
import { ListeUsersComponent } from './liste-users/liste-users.component';
import { ListeDirComponent } from './liste-dir/liste-dir.component';
import { ListeRespLogistiqueComponent } from './liste-resp-logistique/liste-resp-logistique.component';


const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'liste-evenement', component : ListeEvenementComponent},
  { path: 'nouvel-evenement', component : NouvelEvenementComponent},
  { path: 'nouvel-user', component : NouvelUserComponent},
  { path: 'nouveau-compte', component : NouveauCompteComponent},
  { path: 'particip', component : ParticipComponent},
  { path: 'user', component : UserComponent, children:[
    { path: 'modif-user', component : ModifUserComponent},
    { path: 'view-user', component : ViewUserComponent},
    { path: 'liste-users', component : ListeUsersComponent}
  ]},
  { path: 'liste-users', component : ListeUsersComponent},
  { path: 'liste-dir', component : ListeDirComponent},
  { path: 'liste-resp-logistique', component : ListeRespLogistiqueComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PrincipalRoutingModule { }
