import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';

export interface ListeEvenement {
  id: number;
  titre: string;
  dateDebut: string;
  etat: string;
}

const ELEMENT_DATA: ListeEvenement[] = [
  {id: 1, titre: 'Journée d\'intégration', dateDebut: 'Octobre 17, 2020', etat: 'Accepté'},
  {id: 2, titre: 'Soirée traditionnelle', dateDebut: 'Mars 15, 2020', etat: 'Refusé'},
  {id: 3, titre: 'Sortie', dateDebut: 'Mai 17, 2020', etat: 'En attente'},
  {id: 4, titre: 'Soirée traditionnelle', dateDebut: 'Mars 18, 2020', etat: 'Refusé'},
  {id: 5, titre: 'Soirée', dateDebut: 'Mars 19, 2020', etat: 'Refusé'},
  {id: 6, titre: 'Journée d\'intégration', dateDebut: 'Juin 17, 2020', etat: 'En attente'},
  {id: 7, titre: 'Journée d\'intégration', dateDebut: 'Juin 19, 2020', etat: 'En attente'},
];

@Component({
  selector: 'app-evenement',
  templateUrl: './liste-evenement.component.html',
  styleUrls: ['./liste-evenement.component.scss']
})
export class ListeEvenementComponent implements OnInit {

  displayedColumns: string[] = ['id', 'titre', 'dateDebut', 'etat', 'action'];
  dataSource = ELEMENT_DATA;
  //dataSource: MatTableDataSource<ListeEvenement>; Uncomment when u bring the date from the back

  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: true}) sort: MatSort;

  constructor() { 
  }

  ngOnInit(): void {
    /* UNCOMMENT WHEN U BRING DATA FROM BACK
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort; */

  }



 /*  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  } */

}
