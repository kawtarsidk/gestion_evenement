import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PrincipalRoutingModule } from './principal-routing.module';

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
import { MaterialModule } from './material-module';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { ModificationModalComponent } from './modification-modal/modification-modal.component';
import { SuppressionModalComponent } from './suppression-modal/suppression-modal.component';
import { UpdateEventComponent } from './update-event/update-event.component';
import { DeleteEventComponent } from './delete-event/delete-event.component';


@NgModule({
  declarations: [
    HomeComponent,
    NouvelEvenementComponent,
    ListeEvenementComponent,
    NouveauCompteComponent,
    NouvelUserComponent,
    ListeUsersComponent,
    ListeDirComponent,
    ListeRespLogistiqueComponent,
    ModifUserComponent,
    ViewUserComponent,
    UserComponent,
    ParticipComponent,
    ListeRespLogistiqueComponent,
    FooterComponent,
    HeaderComponent,
    ModificationModalComponent,
    SuppressionModalComponent,
    UpdateEventComponent,
    DeleteEventComponent
  ],
  imports: [
    CommonModule,
    PrincipalRoutingModule,
    MaterialModule,
    ReactiveFormsModule,
    FormsModule

  ]
})
export class PrincipalModule { }
