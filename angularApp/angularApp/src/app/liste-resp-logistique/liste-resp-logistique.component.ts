import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';

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
  //dataSource: MatTableDataSource<ListeEvenement>; Uncomment when u bring the date from the back

  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: true}) sort: MatSort;

  constructor() { }

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
