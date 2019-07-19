import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'noimage'
})
export class NoimagePipe implements PipeTransform {

  transform(Tarjeta: string): string {
      return `Terminado en ${Tarjeta.substring(-4)}` 
  }

}
