import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import {HttpClient} from "@angular/common/http";
import {MatDialog} from "@angular/material/dialog";
import {ListeUsers} from "../liste-users/liste-users.component";
import {ModificationModalComponent} from "../modification-modal/modification-modal.component";
import {SuppressionModalComponent} from "../suppression-modal/suppression-modal.component";

export interface ListeEvenement {
  id: number;
  titre: string;
  dateDebut: string;
  etat: string;
}


@Component({
  selector: 'app-evenement',
  templateUrl: './liste-evenement.component.html',
  styleUrls: ['./liste-evenement.component.scss']
})
export class ListeEvenementComponent implements OnInit {

  displayedColumns: string[] = ['id', 'titre', 'dateDebut', 'etat', 'action'];
  dataSource: MatTableDataSource<ListeEvenement>;
  event;

  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: true}) sort: MatSort;

  constructor(private httpClient : HttpClient,public dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.httpClient.get('http://localhost:8080/events/get')
      .subscribe((response: ListeEvenement[]) => {
        console.log("response", response);
        this.dataSource = new MatTableDataSource(response);
        this.dataSource.paginator = this.paginator;
        this.dataSource.sort = this.sort;

      });

  }

    applyFilter(event: Event) {
       const filterValue = (event.target as HTMLInputElement).value;
       this.dataSource.filter = filterValue.trim().toLowerCase();

       if (this.dataSource.paginator) {
         this.dataSource.paginator.firstPage();
       }
     }

  editEvent(event) {
    const dialogRef = this.dialog.open(ModificationModalComponent, {
      width: '450px',
      data: event
    });

    dialogRef.afterClosed().subscribe(result => {
      this.httpClient.put('http://localhost:8080/events/update',result).subscribe(response => {});
      this.event = event;
    });
  }

  deleteEvent(event){
    const dialogRef = this.dialog.open(SuppressionModalComponent, {
      width: '450px',
      data: event
    });

    dialogRef.afterClosed().subscribe(result => {
      const url = `http://localhost:8080/events/delete/${result.id}`;
      this.httpClient.delete(url).subscribe(response => {
        console.log("response",response);
        this.ngOnInit();
      });
      this.event = event;

    });
  }

}
