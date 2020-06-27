import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import {ListeUsers } from '../liste-users/liste-users.component';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-modification-modal',
  templateUrl: './modification-modal.component.html',
  styleUrls: ['./modification-modal.component.scss']
})
export class ModificationModalComponent {

  constructor(
    public dialogRef: MatDialogRef<ModificationModalComponent>,
    @Inject(MAT_DIALOG_DATA) public data: ListeUsers, private httpClient : HttpClient,

    ) {}

  onNoClick(): void {
    this.dialogRef.close();
  }


}
