import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators} from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import {Compte} from "../../login/login.component";

export interface personnes {
  id: number;
  cin: string;
  nom : string;
  prenom : string;
  mail : string;
  telephone : string;
  compte : Compte;
}

@Component({
  selector: 'app-nouvel-user',
  templateUrl: './nouvel-user.component.html',
  styleUrls: ['./nouvel-user.component.scss']
})
export class NouvelUserComponent implements OnInit {
  userForm: FormGroup;
  error: string | undefined;
  success : string;
  isPassed : boolean = false;
  id : number;
  compte : Compte;

  constructor(private formBuilder: FormBuilder,private httpClient : HttpClient,) { this.createForm();}

  ngOnInit(): void {
  }

  newUser(){
    console.log("userForm", this.userForm.value);
    const user = this.httpClient.post('http://localhost:8080/Personnes/save',this.userForm.value);
    user.subscribe(
      (user: personnes) => {
        console.log("user",user);
        this.isPassed = true;
        this.success = "User crée avec succès";
      },
      error => {
        console.log("error",error);
        this.isPassed = false;
        this.error = error.error.message;
      }
    );
  }

  private createForm() {
    this.userForm = this.formBuilder.group({
      cin: ['', Validators.required],
      nom: ['', Validators.required],
      prenom: ['', Validators.required],
      adresse: ['', Validators.required],
      email: ['', Validators.required],
      telephone: ['', Validators.required, Validators.pattern("[0-9 ]{10}")],
      compte:['', Validators.required]
    });
  }

}
