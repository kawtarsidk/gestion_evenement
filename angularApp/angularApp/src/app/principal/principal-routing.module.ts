import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ListeEvenementComponent } from './liste-evenement/liste-evenement.component';
import { NouvelUserComponent } from './nouvel-user/nouvel-user.component';
import { NouvelEvenementComponent } from './nouvel-evenement/nouvel-evenement.component';
import { NouveauCompteComponent } from './nouveau-compte/nouveau-compte.component';
import { ParticipComponent } from './particip/particip.component';
import { UserComponent } from './user/user.component';
import { ModifUserComponent } from './modif-user/modif-user.component';
import { ViewUserComponent } from './view-user/view-user.component';
import { ListeUsersComponent } from './liste-users/liste-users.component';
import { ListeDirComponent } from './liste-dir/liste-dir.component';
import { ListeRespLogistiqueComponent } from './liste-resp-logistique/liste-resp-logistique.component';
import { AuthGuardService } from '../login/auth-guard.service';
import { LoginComponent } from '../login/login.component';


const routes: Routes = [
  { path: 'home', component: HomeComponent , canActivate : [AuthGuardService]},
  { path: 'liste-evenement', component : ListeEvenementComponent, canActivate : [AuthGuardService]},
  { path: 'nouvel-evenement', component : NouvelEvenementComponent, canActivate : [AuthGuardService]},
  { path: 'nouvel-user', component : NouvelUserComponent, canActivate : [AuthGuardService]},
  { path: 'nouveau-compte', component : NouveauCompteComponent, canActivate : [AuthGuardService]},
  { path: 'particip', component : ParticipComponent, canActivate : [AuthGuardService]},
  { path: 'user', component : UserComponent, canActivate : [AuthGuardService], children:[
    { path: 'modif-user', component : ModifUserComponent, canActivate : [AuthGuardService]},
    { path: 'view-user', component : ViewUserComponent, canActivate : [AuthGuardService]},
    { path: 'liste-users', component : ListeUsersComponent, canActivate : [AuthGuardService]}
  ]},
  { path: 'liste-users', component : ListeUsersComponent, canActivate : [AuthGuardService]},
  { path: 'liste-dir', component : ListeDirComponent, canActivate : [AuthGuardService]},
  { path: 'liste-resp-logistique', component : ListeRespLogistiqueComponent, canActivate : [AuthGuardService]},
  { path: '', component: LoginComponent },
  { path: '**', component: LoginComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PrincipalRoutingModule { }
