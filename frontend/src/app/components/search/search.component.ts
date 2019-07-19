import { Component, OnInit } from '@angular/core';
import { SpotifyService } from '../../services/spotify.service.ts.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styles: []
})
export class SearchComponent {
  Buscado:boolean=false;
  artistas:any[]=[];
  loading:boolean;
  Error:boolean;
  MsgError:string;
  constructor(private _SpotifyService:SpotifyService) {
    window.scrollTo(0,0);
  }
  
  buscar(termino:string){
    this.loading=true;
    this.Error=false;
    let TerminoAux=termino.trim();
    if(TerminoAux===''){
      this.Buscado=false;
      this.loading=false;
    }else{
      this.Buscado=true;
      this._SpotifyService.getArtistas(TerminoAux)
      .subscribe( (data:any) =>{
        console.log("Data",data);
        if(!data.error){
          this.artistas=data;
        }else{
          this.Error=true;
          this.MsgError=data.error.error.message;
        }
        this.loading=false; 
      });
    }
    
  };
}
