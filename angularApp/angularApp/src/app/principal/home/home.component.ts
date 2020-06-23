import { Component, OnInit } from '@angular/core';
import { Compte } from 'src/app/login/login.component';
import { LoginService } from 'src/app/login/login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  login : string;
  compte : Compte;
  open : boolean = false;

  constructor() {
    
   }

  ngOnInit(): void {
    this.compte = JSON.parse(localStorage.getItem('user'));
    this.login = this.compte.login;
  }


  
  colaps(): void {
    this.open=! this.open;
  }

}
