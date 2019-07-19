import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'SpotiApp';

  Logeado:string;

  constructor() { 
    this.Logeado= window.localStorage.getItem("token");
  }
}
