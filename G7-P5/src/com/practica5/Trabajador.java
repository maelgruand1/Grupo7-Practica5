package com.practica5;
import java.util.Date;

// Clase abstracta Trabajador
public abstract class Trabajador {
    public String nombre;
    private Date fechaNacimiento;
    private String paisOrigen;

    // Constructor
    public Trabajador(String nombre, Date fechaNacimiento, String paisOrigen) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.paisOrigen = paisOrigen;
    }

    // Método para comprobar si dos trabajadores tienen la misma nacionalidad
    public boolean mismaNacionalidad(Trabajador otro) {
        return this.paisOrigen.equalsIgnoreCase(otro.paisOrigen);
    }

    // Método abstracto para mostrar la información del trabajador
    public abstract void mostrarInfo();

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    @Override
    public String toString() {
        return "Trabajador: " + nombre + ", Fecha de nacimiento: " + fechaNacimiento + ", País de origen: "
                + paisOrigen;
    }

}
