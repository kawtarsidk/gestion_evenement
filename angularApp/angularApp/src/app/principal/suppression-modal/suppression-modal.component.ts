import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ListeUsers } from '../liste-users/liste-users.component';
import { HttpClient } from '@angular/common/http';
import {ListeEvenement} from "../liste-evenement/liste-evenement.component";

@Component({
  selector: 'app-suppression-modal',
  templateUrl: './suppression-modal.component.html',
  styleUrls: ['./suppression-modal.component.scss']
})
export class SuppressionModalComponent {

  constructor(
    public dialogRef: MatDialogRef<SuppressionModalComponent>,
    @Inject(MAT_DIALOG_DATA) public data: ListeUsers, private httpClient: HttpClient,
    @Inject(MAT_DIALOG_DATA) public data1: ListeEvenement, private httpClien: HttpClient) { }

  onNoClick(): void {
    this.dialogRef.close();
  }

}
