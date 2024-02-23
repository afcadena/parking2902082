package org.ficha2902082.maven.parking.andres.entities;

public class Carro {

    //Sintaxis  de artributos
    //1. Modificador de acceso
    //2. Tipo de dato del atributo
    //3. Nombre del atributo 
    // (camel case)
    public String placa;
    public TipoVehiculo TipoVehiculo;
    public Carro() {
    }
    public Carro(String placa, org.ficha2902082.maven.parking.andres.entities.TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        TipoVehiculo = tipoVehiculo;
    }

    

}
