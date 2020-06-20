import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';

export interface ListeDir {
  id: number;
  titre: string;
  dateDebut: string;
  
}
const ELEMENT_DATA: ListeDir[] = [
  {id: 1, titre: 'Journée d\'intégration', dateDebut: 'Octobre 17, 2020'},
  {id: 2, titre: 'Soirée traditionnelle', dateDebut: 'Mars 15, 2020'},
  {id: 3, titre: 'Sortie', dateDebut: 'Mai 17, 2020'},

];
@Component({
  selector: 'app-liste-dir',
  templateUrl: './liste-dir.component.html',
  styleUrls: ['./liste-dir.component.scss']
})
export class ListeDirComponent implements OnInit {

  displayedColumns: string[] = ['id', 'titre', 'dateDebut',  'action'];
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
