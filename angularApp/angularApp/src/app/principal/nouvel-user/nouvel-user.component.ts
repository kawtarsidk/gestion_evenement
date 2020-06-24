import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators} from '@angular/forms';

@Component({
  selector: 'app-nouvel-user',
  templateUrl: './nouvel-user.component.html',
  styleUrls: ['./nouvel-user.component.scss']
})
export class NouvelUserComponent implements OnInit {
  userForm: FormGroup;

  constructor(private formBuilder: FormBuilder) { this.createForm();}

  ngOnInit(): void {
  }

  newUser(){
    console.log("userForm", this.userForm.value);
  }

  private createForm() {
    this.userForm = this.formBuilder.group({
      cin: ['', Validators.required],
      nom: ['', Validators.required],
      prenom: ['', Validators.required],
      adresse: ['', Validators.required],
      email: ['', Validators.required],
      tel: ['', Validators.required, Validators.pattern("[0-9 ]{10}")],
      compte : ['', Validators.required]
    });
  }

}
