package org.ficha2902082.maven.parking.andres;

//importar dependencias
import org.ficha2902082.maven.parking.andres.entities.Carro;
import org.ficha2902082.maven.parking.andres.entities.TipoVehiculo;

import org.ficha2902082.maven.parking.andres.entities.Cliente;
import org.ficha2902082.maven.parking.andres.entities.tipoDocumento;

public class Main {
    public static void main(String[] args) {
        // Creas dos instancias
        // de la clase carro
        Carro carrito1 = new Carro();
        carrito1.placa= "ASB 345";
        carrito1.TipoVehiculo = TipoVehiculo.CAMIONETA;

        Carro carrito2= new Carro();
        carrito2.placa ="AWS 234";
        carrito2.TipoVehiculo = TipoVehiculo.TAXI;
        
        Carro carrito3= new Carro();
        carrito3.placa ="AJT 456";
        carrito3.TipoVehiculo = TipoVehiculo.MOTO;


        //CLIENTE 

        Cliente clientecito = new Cliente();
        clientecito.nombre = "Juan";
        clientecito.apellido = "Lopez";
        clientecito.tipoDocumento 
                = tipoDocumento.CC;
        clientecito.numeroDocumento = 12326755443L;
        clientecito.celular = 3044321324L ;
//añadir carros al cliente
//invocar, llamar, ejecutar el metod
//el metodo addCar

        clientecito.addCar(carrito1);
        clientecito.addCar(carrito2);
        clientecito.addCar("ASC 456",TipoVehiculo.CAMION);
        //IMPRIMIR 
        
        System.out.println("Cliente:"+clientecito.nombre);
        System.out.println("Documento:"+clientecito.tipoDocumento);
        System.out.println("tipo de documento:"+clientecito.numeroDocumento);
        System.out.println("Nombre:"+clientecito.nombre);
        System.out.println("Apellido:"+clientecito.nombre);
        System.out.println("numero de celular:"+clientecito.celular);
        System.out.println("vehiculos:");
        for(Carro c :  clientecito.misCarros){
            System.out.println("placa:"+ c.placa);
            System.out.println("tipo:"+ c.TipoVehiculo);
            System.out.println("_____________________________________");
        };



    }
}