import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ListeEvenement } from '../liste-evenement/liste-evenement.component';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-delete-event',
  templateUrl: './delete-event.component.html',
  styleUrls: ['./delete-event.component.scss']
})
export class DeleteEventComponent{

  constructor(
    public dialogRef: MatDialogRef<DeleteEventComponent>,
    @Inject(MAT_DIALOG_DATA) public data: ListeEvenement, private httpClient: HttpClient) { }

  onNoClick(): void {
    this.dialogRef.close();
  }

}
