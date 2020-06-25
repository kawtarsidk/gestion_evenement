import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { HttpClient } from '@angular/common/http';

export interface ListeRespLogistique {
  id: number;
  titre: string;
  salle: string;
  materiel: string;
}

const ELEMENT_DATA: ListeRespLogistique[] = [
  {id: 1, titre: 'Journée d\'intégration', salle: 'A', materiel: '2 micros - 2 videoPr - 40 chaises'},
  {id: 2, titre: 'Soirée traditionnelle', salle: 'B', materiel: '1 micros - 1 videoPr - 20 chaises'},
  {id: 3, titre: 'Sortie', salle: 'F', materiel: ' 40 chaises - 4 tables'}
];

@Component({
  selector: 'app-liste-resp-logistique',
  templateUrl: './liste-resp-logistique.component.html',
  styleUrls: ['./liste-resp-logistique.component.scss']
})
export class ListeRespLogistiqueComponent implements OnInit {
  displayedColumns: string[] = ['id', 'titre', 'salle', 'materiel'];
  dataSource = ELEMENT_DATA;
  //dataSource: MatTableDataSource<ListeRespLogistique>; 

  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: true}) sort: MatSort;

  constructor(private httpClient : HttpClient) { }

  ngOnInit(): void {

    /* this.httpClient.get("")
      .subscribe(response => {
        this.dataSource = new MatTableDataSource(response);
        this.dataSource.paginator = this.paginator;
        this.dataSource.sort = this.sort;
      }); */
    

  }

  /*  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    } 
  } */

}
