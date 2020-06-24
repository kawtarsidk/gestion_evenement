import { Component, OnInit } from '@angular/core';
import { FormGroup ,FormBuilder, Validators} from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import {Compte} from "../../login/login.component";

export interface Event{
  titre: string;
  theme: string;
  type: string;
  objectif:string;
  nbrParticipant: number;
  budjet: number;
  datedebut: Date;
  datefin:Date;
  publicConcerne:string;
  sponsors: string;
  salle: string;
  details: string;
}

@Component({
  selector: 'app-nouvel-evenement',
  templateUrl: './nouvel-evenement.component.html',
  styleUrls: ['./nouvel-evenement.component.scss']
})
export class NouvelEvenementComponent implements OnInit {

  eventForm: FormGroup;
  error: string | undefined;
  success : string;
  isPassed : boolean = false;
  id : number;

  constructor(private formBuilder: FormBuilder,private httpClient : HttpClient,) {this.createForm(); }

  ngOnInit(): void {
  }

  newEvent(){

    console.log("event form", this.eventForm.value);
    const event = this.httpClient.post('http://localhost:8080/',this.eventForm.value);

    event.subscribe(
      (event: Event) => {
        console.log("evenement",event);
        this.isPassed = true;
        this.success = "evenement crée avec succès";
      },
      error => {
        console.log("error",error);
        this.isPassed = false;
        this.error = error.error.message;
      }
    );
  }
  private createForm() {
    this.eventForm = this.formBuilder.group({
      id : "",
      titre: ['', Validators.required],
      theme: ['', Validators.required],
      type: ['', Validators.required],
      objectif: ['', Validators.required],
      nbrParticipant: ['', Validators.required],
      budjet: ['', Validators.required],
      datedebut: ['', Validators.required],
      datefin: ['', Validators.required],
      publicConcerne: ['', Validators.required],
      sponsors: ['', Validators.required],
      salle: ['', Validators.required],
      details: ['', Validators.required],
      personne : null,
      organisateur : null
    });
  }
}
