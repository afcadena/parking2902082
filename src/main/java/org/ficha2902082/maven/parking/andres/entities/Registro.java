package org.ficha2902082.maven.parking.andres.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {

    // atributos intrinsecos: atributos propios de la naturaleza del objeto
    public LocalDate fechaInicio;
    public LocalTime horaInicio;
    public LocalDate fechaFin;
    public LocalTime horaFin;
    public Double valor;

    // Atributos de relacion
    public Carro carro;

    public Cupo cupo;

    public Empleado empleado;

    // Constructor por defecto
    public Registro() {
    }

    // Constructor parametrizado
    public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin, Double valor,
            Carro carro, Cupo cupo, Empleado empleado) {
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        this.valor = valor;
        this.carro = carro;
        this.cupo = cupo;
        this.empleado = empleado;
    }

}
