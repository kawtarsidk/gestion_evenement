import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
export interface Compte{
  login :string;
  password : string;
}
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit, OnDestroy {
  error: string | undefined;
  loginForm: FormGroup;
  isLoading = false;

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private formBuilder: FormBuilder,
    private httpClient : HttpClient
  ) {
    this.createForm();
  }

  ngOnInit() {}

  ngOnDestroy() {}

  login() {
    this.isLoading = true;
    const login$ = this.httpClient.post('http://localhost:8080/authentification/login',this.loginForm.value);

    login$.subscribe(
      (compte: Compte) => {
        console.log("compte",compte);
        this.router.navigate(['/home'], { replaceUrl: true });
      },
      error => {
        this.isLoading = false;
        console.log("error",error);
        this.error = error;
      }
    );
  } 

  private createForm() {
    this.loginForm = this.formBuilder.group({
      login: ['', Validators.required],
      password: ['', Validators.required]
    });
  }
}
