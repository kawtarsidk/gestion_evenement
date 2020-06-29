import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { HttpClient } from '@angular/common/http';
import {ListeUsers} from "../liste-users/liste-users.component";

export interface ListeRespLogistique {
  id: number;
  titre: string;
  salle_id: string;
  equipements: string;
}


@Component({
  selector: 'app-liste-resp-logistique',
  templateUrl: './liste-resp-logistique.component.html',
  styleUrls: ['./liste-resp-logistique.component.scss']
})
export class ListeRespLogistiqueComponent implements OnInit {
  displayedColumns: string[] = ['id', 'titre', 'salle_id', 'equipements'];
  dataSource: MatTableDataSource<ListeRespLogistique>;

  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: true}) sort: MatSort;

  constructor(private httpClient : HttpClient) { }

  ngOnInit(): void {

     this.httpClient.get("http://localhost:8080/events/get")
      .subscribe((response : ListeRespLogistique[]) => {
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


}
