import { Injectable } from '@angular/core';
import { Compte } from './login.component';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }

  setUserLoggedIn(user: Compte) {
    localStorage.setItem('user', JSON.stringify(user));
    console.log('saved on localStorage');
  }
  
  getUserLoggedIn() {
    if (localStorage.getItem('user')) {
      JSON.parse(localStorage.getItem('user'));
    } else {
      console.log('localStorage empty');
    }
  }
  clearLocalStorage() {
    localStorage.clear();
  }
}
