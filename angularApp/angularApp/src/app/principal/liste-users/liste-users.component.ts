import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';

export interface ListeUsers {
  id: number;
  nom: string;
  email: string;
  role: string;
}

const ELEMENT_DATA: ListeUsers[] = [
  {id: 1, nom: 'Alami Ahmad', email: 'ahmad@gmail.com', role: 'Directeur'},
  {id: 2, nom: 'Alaoui Ali', email: 'Ali@gmail.com', role: 'Organisateur'},
  {id: 3, nom: 'Amina slimani', email: 'Amina@gmail.com', role: 'Responsable'},
];

@Component({
  selector: 'app-evenement',
  templateUrl: './liste-users.component.html',
  styleUrls: ['./liste-users.component.scss']
})
export class ListeUsersComponent implements OnInit {

  displayedColumns: string[] = ['id', 'nom', 'email', 'role', 'action'];
  dataSource = ELEMENT_DATA;
  //dataSource: MatTableDataSource<ListeUsers>; Uncomment when u bring the date from the back

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
