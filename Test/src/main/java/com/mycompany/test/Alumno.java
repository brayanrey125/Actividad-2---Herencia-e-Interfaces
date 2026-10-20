package com.mycompany.test;
public class Alumno extends Persona {

    public Alumno() {
    }

    @Override
    public String toString() {
        System.out.println("Se crea Alumno...");
        return "Un alumno llamado: " + nombre;
    }
    
}
