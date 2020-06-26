import { Component, OnInit } from '@angular/core';
import { FormGroup ,FormBuilder, Validators} from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import {Salle} from "../Salle";


export interface Event{
  titre: string;
  theme: string;
  //type: string;
  objectif:string;
  nbrParticipant: number;
  budjet: number;
  datedebut: Date;
  datefin:Date;
  etat:string;
  equipements:string;
  publicConcerne:string;
  //sponsors: string;
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
  salle:Salle[];

  constructor(private formBuilder: FormBuilder,private httpClient : HttpClient) {this.createForm(); }

  ngOnInit(): void {
    this.httpClient.get<Salle[]>('http://localhost:8080/salles/gets').subscribe(res => {this.salle = res},
  error1 => {console.log("error", error1);
        this.error = error1.error.message;
      });
  }



  newEvent(){

    console.log("event form", this.eventForm.value);
    const event = this.httpClient.post('http://localhost:8080/events/save',this.eventForm.value);

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
      //type: ['', Validators.required],
      objectif: ['', Validators.required],
      nbrParticipant: ['', Validators.required],
      budjet: ['', Validators.required],
      datedebut: ['', Validators.required],
      datefin: ['', Validators.required],
      publicConcerne: ['', Validators.required],
      //sponsors: ['', Validators.required],
      salle: ['', Validators.required],
      details: ['', Validators.required],
      equipements: ['', Validators.required],
      etat:""

    });
  }
}
