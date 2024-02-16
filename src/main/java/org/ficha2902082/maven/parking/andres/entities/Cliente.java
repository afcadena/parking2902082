package org.ficha2902082.maven.parking.andres.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

        public String nombre;
        public String apellido;
        public tipoDocumento tipoDocumento;
        public Long numeroDocumento;
        public Long celular;

        public List<Carro> misCarros= 
                                        new ArrayList<Carro>();
        //metodo 1: añadir carro al cliente
        //definir metodo (firma del metodo - signature)
        // -modificador acceso
        // -tipo de dato de retorno
        // -nombre del metodo
        //parametros (estradas, input):
        // 1.tipo de dato del parametro
        // 2. nombre del parametro 
        public void addCar(Carro c){
            this.misCarros.add(c);
        }

        //sobrecarga el metodo addCar
        public void addCar(String placa, TipoVehiculo tipoVehiculo){
            //construir (instanciar)
            Carro c = new Carro();
            c.placa = placa;
            c.TipoVehiculo = tipoVehiculo;
            this.misCarros.add(c);
        }
        //sobrecarga de metodos
        //en una clase se permiten metodos
        //con el mismo nombre pero
        //con diferente firma

}
