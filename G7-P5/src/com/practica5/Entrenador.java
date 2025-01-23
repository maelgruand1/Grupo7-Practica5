package com.practica5;

public class Entrenador {
    private String nombre;
    private Formacion formacion;

    public Entrenador(String nombre, Formacion formacion) {
        this.nombre = nombre;
        this.formacion = formacion;
    }
    
    public String toString() {
        return "Entrenador : " + nombre + " con formacion de equipo " +  formacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Formacion getFormacion() {
        return formacion;
    }

    public void setFormacion(Formacion formacion) {
        this.formacion = formacion;
    }

}
