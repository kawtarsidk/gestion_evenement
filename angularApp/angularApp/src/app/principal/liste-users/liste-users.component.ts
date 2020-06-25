import { Component, OnInit, ViewChild, Inject } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { HttpClient } from '@angular/common/http';
import {  MatDialog} from '@angular/material/dialog';
import { ModificationModalComponent } from '../modification-modal/modification-modal.component';
import { SuppressionModalComponent } from '../suppression-modal/suppression-modal.component';



export interface ListeUsers {
  id: number;
  nom: string;
  prenom : string;
  mail: string;
  cin: string;
  telephone: string;
}


@Component({
  selector: 'app-evenement',
  templateUrl: './liste-users.component.html',
  styleUrls: ['./liste-users.component.scss']
})
export class ListeUsersComponent implements OnInit {

  displayedColumns: string[] = ['id', 'nom', 'prenom', 'mail', 'cin', 'telephone', 'action'];
  dataSource: MatTableDataSource<ListeUsers>;
  user;

  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: true}) sort: MatSort;

  constructor(private httpClient : HttpClient,public dialog: MatDialog) { 
  }

  ngOnInit(): void {
    this.httpClient.get('http://localhost:8080/user/get')
      .subscribe((response : ListeUsers[])=> {
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

  editUser(user) {
    const dialogRef = this.dialog.open(ModificationModalComponent, {
      width: '450px',
      data: user
    });

    dialogRef.afterClosed().subscribe(result => {
      this.httpClient.put('http://localhost:8080/user/update',result).subscribe(response => {});
      this.user = user;
    });
  }

  deleteUser(user){
    const dialogRef = this.dialog.open(SuppressionModalComponent, {
      width: '450px',
      data: user
    });

    dialogRef.afterClosed().subscribe(result => {
      const url = `http://localhost:8080/user/delete/${result.id}`; 
      this.httpClient.delete(url).subscribe(response => {
        console.log("response",response);
        this.ngOnInit();
      });
      this.user = user;
      
    });
  }

}
