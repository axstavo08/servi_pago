import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pago',
  templateUrl: './pago.component.html'
})
export class PagoComponent implements OnInit {

  Paso:number;
  loading:boolean=true;
  PagosDisponibles:any=[];
  servicio:any;
  Tarjetas:any=[];

  private ConsultarPagos=(DNI:string)=>{

    setTimeout(()=>{
      this.loading=false;

    },1500)

  }

  constructor() {
    window.sessionStorage.removeItem("id_pago");

    this.PagosDisponibles.push({id:1,servicio:"Servicio1",entidad:"entidad1",monto:"monto1",fecha:"fecha1"});
    this.PagosDisponibles.push({id:2,servicio:"Servicio2",entidad:"entidad2",monto:"monto2",fecha:"fecha2"});
    this.PagosDisponibles.push({id:3,servicio:"Servicio3",entidad:"entidad3",monto:"monto3",fecha:"fecha3"});
    this.PagosDisponibles.push({id:4,servicio:"Servicio4",entidad:"entidad4",monto:"monto4",fecha:"fecha4"});
    this.PagosDisponibles.push({id:5,servicio:"Servicio5",entidad:"entidad5",monto:"monto5",fecha:"fecha5"});
    this.Tarjetas.push({numero:"1234123412341234"});
    this.Tarjetas.push({numero:"1234123412342345"});
    this.Tarjetas.push({numero:"1234123412343456"});

      setTimeout(()=>{
        this.loading=false; 
      },1500)
  }

  

  ngOnInit() {
    this.Paso=1;
  }

  SeleccionarPago(idpago:string){

    this.Paso=1;
    console.log("Esta pasando por aqui");
    window.sessionStorage.setItem("id_pago", idpago);
    this.servicio=idpago;
    this.Paso++;

  }

}
