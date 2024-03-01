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
import org.ficha2902082.maven.parking.andres.entities.Empleado;
public class Main {
    public static void main(String[] args) {

        // Crear un cupo

        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.30;
        cupito1.largo = 3.0;
        cupito1.letra = 'A'; // Para los char

        Cupo cupito2 = new Cupo('B', 4.3, 2.0);
        Cupo cupito3 = new Cupo('C', 5.0, 1.0);
        Cupo cupito4 = new Cupo('A', 6.0, 2.0);
        Cupo cupito5 = new Cupo('B', 2.0, 2.0);

        Carro carrito1 = new Carro("OEP 123", TipoVehiculo.CARRO);
        Carro carrito2 = new Carro("ALI 879", TipoVehiculo.BUS);
        Carro carrito3 = new Carro("AAD 312", TipoVehiculo.TAXI);
        Carro carrito4 = new Carro("HBF 722", TipoVehiculo.CAMION);
        Carro carrito5 = new Carro("PAH 070", TipoVehiculo.MOTO);

        // Para el Long se finalisa con L
        Cliente clientecito1 = new Cliente("Nil", "Ojeda", tipoDocumento.TI, 12456789L, 2323454L);
        Cliente clientecito2 = new Cliente("Auge", "Sanchez", tipoDocumento.TI, 12456789L, 2323454L);
        Cliente clientecito3 = new Cliente("Ganyar", "Lorena", tipoDocumento.TI,4345422789L, 1234354L);
        Cliente clientecito4 = new Cliente("Esteban", "Ojeda", tipoDocumento.TI, 123456789L, 2453454L);
        Cliente clientecito5 = new Cliente("Erick", "Sanchez", tipoDocumento.TI, 17896789L, 1235543454L);

        // vincular carros al cliente
        clientecito1.addCar(carrito1);
        clientecito2.addCar(carrito2);
        clientecito3.addCar(carrito3);
        clientecito4.addCar(carrito4);
        clientecito5.addCar(carrito5);
        
        

        //empleado
        Empleado Empleado1 = new Empleado("Carlos", 8612L);
        Empleado Empleado2 = new Empleado("Andres", 8642L);
        Empleado Empleado3 = new Empleado("Steven", 8732L);

       
        

        // Declara una lista de registro

        List<Registro> misRegistros = new ArrayList<>();

        // Instanciar dos registros E/S

        Registro registro1 = new Registro(
                LocalDate.of(2024, Month.MARCH, 5),
                LocalTime.of(15, 50, 15),
                LocalDate.of(2025, Month.DECEMBER, 20),
                LocalTime.of(21, 58, 59),
                45936000.00,
                clientecito1.misCarros.get(0),
                cupito1, Empleado1);

        LocalDate fi1 = LocalDate.of(2024, Month.JANUARY, 22);

        LocalTime Hi1 = LocalTime.of(11, 32, 50);

        //fecha y hora fin

        LocalDate ff2 = LocalDate.of(2024, Month.DECEMBER, 22);

        LocalTime Hf1 = LocalTime.of(10, 30, 10);

        Double valorR2 = 50000.0;

        // registro 2
        Registro registro2 = new Registro( fi1, Hi1, ff2, Hf1, valorR2, clientecito2.misCarros.get(0), cupito2, Empleado2);

        /*
         * Vincular a la lista de
         * registro
         */
        Registro registro3 = new Registro(
            LocalDate.of(2024, Month.AUGUST, 12),
            LocalTime.of(10, 12, 10),
            LocalDate.of(2025, Month.JUNE, 1),
            LocalTime.of(14, 58, 59),
            31000.00,
            clientecito3.misCarros.get(0),
            cupito3, Empleado3);


        Registro registro4 = new Registro(
                LocalDate.of(1948, Month.NOVEMBER, 5),
                LocalTime.of(15, 50, 15),
                LocalDate.of(2000, Month.FEBRUARY, 20),
                LocalTime.of(15, 1, 59),
                50074323.00,
                clientecito4.misCarros.get(0),
                cupito4, Empleado1);


        Registro registro5 = new Registro(
                LocalDate.of(2024, Month.OCTOBER, 15),
                LocalTime.of(22, 43, 20),
                LocalDate.of(2024, Month.DECEMBER, 15),
                LocalTime.of(20, 30, 50),
                388929320.00,
                clientecito5.misCarros.get(0),
                cupito5, Empleado2);





        misRegistros.add(registro1);
        misRegistros.add(registro2);
        misRegistros.add(registro3);
        misRegistros.add(registro4);
        misRegistros.add(registro5);

        // Recorrer la lista de registros

        for (Registro r : misRegistros) {

            System.out.println("Placa:" +
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
                    r.horaFin + "|" + 
                    "Empleado:" +
                    r.empleado.nombre + "|" 
                    + "Codigo:"
                    + r.empleado.codigo

            );
        }

    }
}