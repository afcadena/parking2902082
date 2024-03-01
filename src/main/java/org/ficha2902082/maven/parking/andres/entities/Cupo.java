package org.ficha2902082.maven.parking.andres.entities;

public class Cupo {


    public char letra;
    public Double largo;
    public Double ancho;

    //Constructor 
    public Cupo() {
    }

    /*Constructor de Clase: Metodo especial en una entidad
     Cuando se ejecuta cuando se crea un objeto (Instanciar (Crear una instancia) ) 
     Sirve para dar valores al objeto */
    // Constructor con parametros
    public Cupo(char letra, Double largo, Double ancho) {
        this.letra = letra;
        this.largo = largo;
        this.ancho = ancho;
    }

    
}
