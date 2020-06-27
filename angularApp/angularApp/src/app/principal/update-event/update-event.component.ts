import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ListeEvenement } from '../liste-evenement/liste-evenement.component';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-update-event',
  templateUrl: './update-event.component.html',
  styleUrls: ['./update-event.component.scss']
})
export class UpdateEventComponent  {


  constructor(
    public dialogRef: MatDialogRef<UpdateEventComponent>,
    @Inject(MAT_DIALOG_DATA) public data: ListeEvenement, private httpClient :HttpClient
    ) {}

    onNoClick(): void {
      this.dialogRef.close();
    }

}
