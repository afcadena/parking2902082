package org.ficha2902082.maven.parking.andres;

import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;

//importar dependencias
import org.ficha2902082.maven.parking.andres.entities.Carro;
import org.ficha2902082.maven.parking.andres.entities.TipoVehiculo;

import org.ficha2902082.maven.parking.andres.entities.Cliente;
import org.ficha2902082.maven.parking.andres.entities.Cupo;
import org.ficha2902082.maven.parking.andres.entities.Registro;
import org.ficha2902082.maven.parking.andres.entities.tipoDocumento;

public class Main {
    public static void main(String[] args) {

        // Crear un cupo

        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.30;
        cupito1.largo = 3.0;
        cupito1.letra = 'A'; // Para los char

        Cupo cupito2 = new Cupo('B', 4.3, 2.0);

        Carro carrito1 = new Carro("OEP 123", TipoVehiculo.CARRO);

        Carro carrito2 = new Carro("ALI 879", TipoVehiculo.BUS);

        // Para el Long se finalisa con L
        Cliente clientecito1 = new Cliente("Nil", "Ojeda", tipoDocumento.TI, 12456789L, 2323454L);

        // vincular carros al cliente
        clientecito1.addCar(carrito1);
        clientecito1.addCar(carrito2);
        clientecito1.addCar("ASD 123", TipoVehiculo.MOTO);

        // Declara una lista de registro

        List<Registro> misRegistros = new ArrayList<>();

        // Instanciar dos registros E/S

        Registro registro1 = new Registro(
        LocalDate.of(2024, Month.MARCH, 5) ,
        LocalTime.of(15,50 , 15) ,
        LocalDate.of(2025, Month.DECEMBER, 20) , 
        LocalTime.of(21, 58, 59),
        45936000.00,
        clientecito1.misCarros.get(0),
        cupito1
        );

        Registro registro2 = new Registro(
        LocalDate.of(2023, Month.MARCH, 6) ,
        LocalTime.of(18,56 , 30) ,
        LocalDate.of(2024, Month.JANUARY, 10) , 
        LocalTime.of(19, 45, 40),
        204400000.00,
        clientecito1.misCarros.get(1),
        cupito2
        );

        /*Vincular a la lista de
         * registro
         */

        misRegistros.add(registro1);
        
        //Recorrer la lista de registros

        for( Registro r : misRegistros ){

            System.out.println( "Placa:" +
                                    r.carro.placa + "|" +
                                    "Cupo: " +
                                    r.cupo.letra + "|" +
                                    "Valor: " + 
                                    r.valor + "|" +
                                    "Fecha Inicio:" +
                                    r.fechaInicio.toString() + "|" +
                                    "Hora Inicio:" +
                                    r.horaInicio.toString() + "|" +
                                    "Fecha Salida:" +
                                    r.fechaFin.toString() + "|" +
                                    "Hora Salida:" +
                                    r.horaFin 

                                    
            );
        } 


        
    }
}