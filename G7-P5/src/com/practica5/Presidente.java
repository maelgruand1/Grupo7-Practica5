package com.practica5;

import com.practica5.Jugadores.EstadoTraspaso;
import com.practica5.Jugadores.Jugador;

public class Presidente {
    private String nombre;

    // Constructeur
    public Presidente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void decidirTraspaso(Jugador jugador, String decision) {
        // Vérifie si l'entraîneur a déjà approuvé le transfert
        if (jugador.getTraspaso() == EstadoTraspaso.APROBADO_POR_ENTRENADOR) {
            if ("Aceptar".equalsIgnoreCase(decision)) {
                jugador.setTraspaso(EstadoTraspaso.APROBADO_POR_PRESIDENTE);
                System.out.println("El traspaso de " + jugador.getNombre() + " ha sido aprobado por el presidente.");
            } else if ("Rechazar".equalsIgnoreCase(decision)) {
                jugador.setTraspaso(EstadoTraspaso.RECHAZADO_POR_PRESIDENTE);
                System.out.println("El traspaso de " + jugador.getNombre() + " ha sido rechazado por el presidente.");
            } else {
                System.out.println("Decisión inválida. Use 'Aceptar' o 'Rechazar'.");
            }
        } else {
            System.out.println("El jugador " + jugador.getNombre() + " no ha sido aprobado por el entrenador para el traspaso.");
        }
    }

    @Override
    public String toString() {
        return "Presidente: " + nombre;
    }
}
