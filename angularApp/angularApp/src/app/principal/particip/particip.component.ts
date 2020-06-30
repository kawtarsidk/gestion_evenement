import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ListeEvenement } from '../liste-evenement/liste-evenement.component';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-particip',
  templateUrl: './particip.component.html',
  styleUrls: ['./particip.component.scss']
})
export class ParticipComponent {

  constructor(
    public dialogRef: MatDialogRef<ParticipComponent>,
    @Inject(MAT_DIALOG_DATA) public data: ListeEvenement, private httpClient: HttpClient ) { }

  onNoClick(): void {
    this.dialogRef.close();
  }
}
