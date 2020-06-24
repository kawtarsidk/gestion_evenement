import {Compte} from "../../login/login.component";

export interface User {
  id: number;
  cin: string;
  nom : string;
  prenom : string;
  mail : string;
  telephone : string;
  compte : Compte;
}
