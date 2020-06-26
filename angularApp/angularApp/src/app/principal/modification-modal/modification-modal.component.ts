import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import {ListeUsers } from '../liste-users/liste-users.component';
import { HttpClient } from '@angular/common/http';
import {ListeEvenement} from "../liste-evenement/liste-evenement.component";

@Component({
  selector: 'app-modification-modal',
  templateUrl: './modification-modal.component.html',
  styleUrls: ['./modification-modal.component.scss']
})
export class ModificationModalComponent {

  constructor(
    public dialogRef: MatDialogRef<ModificationModalComponent>,
    @Inject(MAT_DIALOG_DATA) public data: ListeUsers, private httpClient : HttpClient,
    @Inject(MAT_DIALOG_DATA) public data1: ListeEvenement, private httpClien :HttpClient
    ) {}

  onNoClick(): void {
    this.dialogRef.close();
  }


}
