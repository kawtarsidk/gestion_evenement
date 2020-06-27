import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import {ListeEvenement} from "../liste-evenement/liste-evenement.component";
import {MatTableDataSource} from "@angular/material/table";
import {HttpClient} from "@angular/common/http";
import {MatDialog} from "@angular/material/dialog";
import {Compte} from "../../login/login.component";

export interface ListeDir {
  id: number;
  titre: string;
  dateDebut: string;

}

@Component({
  selector: 'app-liste-dir',
  templateUrl: './liste-dir.component.html',
  styleUrls: ['./liste-dir.component.scss']
})
export class ListeDirComponent implements OnInit {
  error: string | undefined;
  success: string ;
  isAccepted:boolean;
  isRefused:boolean;
  displayedColumns: string[] = ['id', 'titre', 'dateDebut',  'action'];
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

  accept(event){

    this.httpClient.put('http://localhost:8080/events/accepter',event)
      .subscribe(result=>{
          this.event=result;
          this.isAccepted=true;
          this.isRefused=false;
          //this.success = "Vous avez refusé l'événement "+event.id+" "+event.titre;
          },
        error1 => { console.log("error",error1);
          this.error = error1.error.message;});
    }

  refuse(event){

    this.httpClient.put('http://localhost:8080/events/refuser',event)
      .subscribe(
        result=>{
          this.event=result;
         // this.success = "Vous avez refusé l'événement "+event.id+" "+event.titre;
          this.isAccepted=false;
          this.isRefused=true;
        },
        error1 => { console.log("error",error1);
          this.error = error1.error.message;});
  }

}
