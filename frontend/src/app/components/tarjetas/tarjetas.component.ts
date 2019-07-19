import { Component, OnInit,Input } from '@angular/core';
import { Router } from '@angular/router'

@Component({
  selector: 'app-tarjetas',
  templateUrl: './tarjetas.component.html',
  styles: []
})
export class TarjetasComponent implements OnInit {

  @Input() items:any[]=[];
  constructor(private _Router:Router) { 
    window.scrollTo(0,0);
  }

  ngOnInit() {
  }
  
  verArtista(item:any){  
    let ArtistaID;
    if(item.type==='artist'){
      ArtistaID=item.id;
    }else{
      ArtistaID=item.artists[0].id;
    }
    this._Router.navigate(['/artist',ArtistaID])
  }
}
