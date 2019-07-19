import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { SpotifyService } from '../../services/spotify.service.ts.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html'
})
export class HomeComponent implements OnInit {

  loading:boolean;
  Error:boolean;
  MsgError:string;
  NuevasCanciones:any[]=[];
  cliente:string;

  constructor(private _HttpCliente:HttpClient, private _SpotifyService:SpotifyService) {
    window.scrollTo(0,0);
    this.cliente=window.localStorage.getItem("cliente");

    /*this.loading=true;
    this.Error=false;
    this._SpotifyService.getNuevasCanciones()
      .subscribe( (data:any) =>{
        console.log("Data",data);
        if(!data.error){
          this.NuevasCanciones=data;
        }else{
          this.Error=true;
          this.MsgError=data.error.error.message;
        }
        this.loading=false;       
      });  
*/  
    }

  ngOnInit() {
  }

}
