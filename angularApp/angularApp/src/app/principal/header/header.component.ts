import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/login/login.service';
import { Router } from '@angular/router';
import { Compte } from 'src/app/login/login.component';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {
  compte : Compte;
  isAdmin; isOrganisateur ; isDirector; isResponsable; isParticipant  : boolean = false;
   

  constructor(private loginService : LoginService,private router: Router) { 
    this.getUserLoggedIn();
  }

  ngOnInit(): void {
  }

  getUserLoggedIn() {
    this.compte = JSON.parse(localStorage.getItem('user'));
     
    if(this.compte){
      console.log("compte", this.compte);  
      if(this.compte.privilege === "Administrateur"){
        this.isAdmin = true;
      }else if(this.compte.privilege === "Organisateur"){
        this.isOrganisateur = true;
      }else if(this.compte.privilege === "Directeur"){
        this.isDirector = true;
      }else if(this.compte.privilege === "Responsable logistique"){
        this.isResponsable = true;
      }else{
        this.isParticipant = true;
      }
    }
    
  }


  logout() {
    this.loginService.clearLocalStorage(); 
    this.router.navigate(['/login']);
   }
  

}
