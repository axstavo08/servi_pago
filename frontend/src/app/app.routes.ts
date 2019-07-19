import {Routes} from '@angular/router'
import { HomeComponent } from './components/home/home.component';
import { SearchComponent } from './components/search/search.component';
import { ArtistaComponent } from './components/artista/artista.component';
import { PagoComponent} from './components/pago/pago.component';
import { HistorialComponent} from './components/historial/historial.component';
import { SubscripcionesComponent} from './components/subscripciones/subscripciones.component';
import { LoginComponent} from './components/login/login.component';


export const ROUTES: Routes=[
    {path:'inicio',component:HomeComponent},
    {path:'RealizarPago',component:PagoComponent},
    {path:'HistorialPago',component:HistorialComponent},
    {path:'tarjeta',component:SearchComponent},
    {path:'Subscripciones',component:SubscripcionesComponent},
    {path:'artist/:id',component:ArtistaComponent},
    {path:'IniciarSesion',component:LoginComponent},
    {path:'',pathMatch:'full',redirectTo:'inicio'},
    {path:'**',pathMatch:'full',redirectTo:'inicio'}
]
