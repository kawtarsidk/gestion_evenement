import { Component, OnInit } from '@angular/core';
import { FormGroup ,FormBuilder, Validators} from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Compte } from 'src/app/login/login.component';


@Component({
  selector: 'app-nouveau-compte',
  templateUrl: './nouveau-compte.component.html',
  styleUrls: ['./nouveau-compte.component.scss']
})
export class NouveauCompteComponent implements OnInit {

  compteForm: FormGroup;
  error: string | undefined;
  success : string;
  isPassed : boolean = false;
  id : number;


  constructor(private formBuilder: FormBuilder,private httpClient : HttpClient,) {this.createForm(); }

  ngOnInit(): void {
    
  }

  newCompte(){
    
    console.log("compte form", this.compteForm.value);
    const compte = this.httpClient.post('http://localhost:8080/comptes/save',this.compteForm.value);

    compte.subscribe(
      (compte: Compte) => {
        console.log("compte",compte);
        this.isPassed = true;
        this.success = "Compte crée avec succès";
      },
      error => {
        console.log("error",error);
        this.isPassed = false;
        this.error = error.error.message;
      } 
    );
  }

  private createForm() {
    this.compteForm = this.formBuilder.group({
      id : "",
      login: ['', Validators.required],
      password: ['', Validators.required],
      privilege: ['', Validators.required],
      personne : null
    });
  }
}
