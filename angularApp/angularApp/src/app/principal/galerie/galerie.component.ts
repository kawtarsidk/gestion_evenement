import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ListeEvenement } from '../liste-evenement/liste-evenement.component';
import { ParticipComponent } from '../particip/particip.component';
import {  MatDialog} from '@angular/material/dialog';

@Component({
  selector: 'app-galerie',
  templateUrl: './galerie.component.html',
  styleUrls: ['./galerie.component.scss']
})
export class GalerieComponent implements OnInit {

  listEvenement : ListeEvenement[];

  constructor(private httpClient : HttpClient,public dialog: MatDialog) { }

  ngOnInit(): void {
    this.httpClient.get('http://localhost:8080/events/get')
    .subscribe((response: ListeEvenement[]) => {
      console.log("response", response);
      this.listEvenement = response;
    });
  }


  participer(event){
    //console.log("event",event);
    this.dialog.open(ParticipComponent, {
      width: '450px',
      data: event
    });
  }

}
