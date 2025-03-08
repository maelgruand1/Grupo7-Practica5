package com.practica5.Entrenador;

import com.practica5.Jugadores.EstadoTraspaso;
import com.practica5.Jugadores.Jugador;
import java.util.Date;
import com.practica5.Trabajador;
import com.practica5.GestorTraspasos;

public class Entrenador extends Trabajador implements GestorTraspasos {
    private Formacion formacionPreferida; 
    private static int contadorEntrenadores = 0;

    // Constructor
    public Entrenador(String nombre, Date fechaNacimiento, String paisOrigen, Formacion formacionPreferida) {
        super(nombre, fechaNacimiento, paisOrigen);
        this.formacionPreferida = formacionPreferida;
        contadorEntrenadores++; 
    }

    public Formacion getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(Formacion formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    public static int getContadorEntrenadores() {
        return contadorEntrenadores;
    }

    
    // Implementación de GestorTraspasos
    @Override
    public void aprobarTraspaso(Jugador jugador) {
        if (jugador.getTraspaso() == EstadoTraspaso.SOLICITADO) {
            jugador.setTraspaso(EstadoTraspaso.APROBADO_POR_ENTRENADOR);
            System.out.println("El traspaso de " + jugador.getNombre() + " ha sido aprobado por el entrenador.");
        } else {
            System.out.println("El jugador " + jugador.getNombre() + " no ha solicitado un traspaso.");
        }
    }

    @Override
    public void rechazarTraspaso(Jugador jugador) {
        if (jugador.getTraspaso() == EstadoTraspaso.SOLICITADO) {
            jugador.setTraspaso(EstadoTraspaso.RECHAZADO_POR_ENTRENADOR);
            System.out.println("El traspaso de " + jugador.getNombre() + " ha sido rechazado por el entrenador.");
        } else {
            System.out.println("El jugador " + jugador.getNombre() + " no ha solicitado un traspaso.");
        }
    }

    @Override
    public String toString() {
    return "Entrenador: " + getNombre() + ", Nacido el: " + getFechaNacimiento() + 
           ", País: " + getPaisOrigen() + ", Formación preferida: " + formacionPreferida;
}


  // Mostrar información utilizando toString()
    @Override
    public void mostrarInfo() {
        System.out.println(toString());  // Llamamos a toString para evitar duplicación
    }
}