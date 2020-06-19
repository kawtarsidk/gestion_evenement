import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';

export interface ListeUsers {
  id: number;
  nom: string;
  email: string;
  role: string;
}
const ELEMENT_DATA: ListeUsers[] = [
  {id: 1, nom: 'Ahmed Alami', email: 'alami@gmail.com', role: 'Organisateur'},
 /* {id: 2, nom: 'Leila Chaouki', email: 'Chaouki@gmail.com', role: 'Directeur'},
  {id: 3, nom: 'Driss Alaoui', email: 'Alaoui@gmail.com', role: 'RespLogistique'},*/

];
@Component({
  selector: 'app-liste-users',
  templateUrl: './liste-users.component.html',
  styleUrls: ['./liste-users.component.scss']
})
export class ListeUsersComponent implements OnInit {
  displayedColumns: string[] = ['id', 'nom', 'email', 'role', 'action'];
  dataSource =ELEMENT_DATA ;
  //dataSource: MatTableDataSource<ListeEvenement>; Uncomment when u bring the date from the back

  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: true}) sort: MatSort;
  constructor() { }

  ngOnInit(): void {
     /*
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
