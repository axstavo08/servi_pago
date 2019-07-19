import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { map, catchError } from 'rxjs/operators';
import { of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SpotifyService {

  constructor(private _HttpClient:HttpClient) { 
    console.log("Servicio disponible!");
  }

  getQuery(query:string){
    const url =`https://api.spotify.com/v1/${ query }`;
    const headers= new HttpHeaders({
      'Authorization':'Bearer BQAALdOaWMFCEXwmpKtSY_TwEHDYRBZB8EJ8Q-ryI8U-eS-sFMEBHxi7P3MnIV2uNR1PjmroiVuXsCVuC7U'
    });

    return this._HttpClient.get(url,{headers});
  }

  getNuevasCanciones(){

    return this.getQuery('browse/new-releases')
            .pipe( map( (data:any)=>data.albums.items), catchError(( err:any)=>{return of(err)}));
  }

  getArtistas(termino:string,limite:number=15){

    return this.getQuery(`search?q=${ termino }&type=artist&limit=${limite}`)
            .pipe( map((data:any)=>data.artists.items), catchError(( err:any)=>{return of(err)}));
  }

  getArtista(id:string){
    return this.getQuery(`artists/${ id }`);
        // .pipe( map((data:any)=>data.artists.items), catchError(( err:any)=>{return of(err)}));
  }

  getTopTrack(id:string){
    return this.getQuery(`artists/${id}/top-tracks?country=PE`)
    .pipe( map((data:any)=>data.tracks), catchError(( err:any)=>{return of(err)}));
  }

}
