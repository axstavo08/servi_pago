import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';

import { SpotifyService } from '../../services/spotify.service.ts.service';

@Component({
  selector: 'app-artista',
  templateUrl: './artista.component.html',
  styles: []
})
export class ArtistaComponent implements OnInit {

  artista:any={};
  tracks:any=[];
  loading:boolean;

  constructor(private _ActivateRoute:ActivatedRoute, private _SpotifyService:SpotifyService,private _Location:Location) { 
    window.scrollTo(0,0);
    this.loading=true;
    this._ActivateRoute.params.subscribe(params=>{
      // console.log(params['id'])
      this.getArtista(params['id']);
      this.getTopTracks(params['id']); 
    })  
  }

  ngOnInit() {
  }

  getArtista(id:string){
    this.loading=true;
    this._SpotifyService.getArtista(id)
      .subscribe(artista=>{
        console.log(artista);
        this.artista=artista;
        this.loading=false;
      })
  }
  
  getTopTracks(id:string){
    this._SpotifyService.getTopTrack(id)
      .subscribe((data:any)=>{
        console.log(data);
        this.tracks=data;

      });
  }

  Atras(){
   this._Location.back();
  }

}
