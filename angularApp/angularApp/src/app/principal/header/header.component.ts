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

  constructor(private loginService : LoginService,private router: Router) { 
    this.getUserLoggedIn();
  }

  ngOnInit(): void {
  }

  getUserLoggedIn() {
    this.compte = JSON.parse(localStorage.getItem('user'));
    
  }


  logout() {
  
    this.loginService.clearLocalStorage(); 
    console.log("compte after localstorate",JSON.parse(localStorage.getItem('user')))
    this.router.navigate(['/login']);
   }
  

}
