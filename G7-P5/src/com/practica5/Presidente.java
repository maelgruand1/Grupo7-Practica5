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
        if (jugador.getTraspaso() == EstadoTraspaso.SOLICITADO) {
            if ("Aceptar".equalsIgnoreCase(decision)) {
                jugador.setTraspaso(EstadoTraspaso.APROBADO_POR_ENTRENADOR);
                System.out.println("Le transfert de " + jugador.getNombre() + " a été accepté par l'entraîneur.");
            } else if ("Rechazar".equalsIgnoreCase(decision)) {
                jugador.setTraspaso(EstadoTraspaso.RECHAZADO_POR_ENTRENADOR);
                System.out.println("Le transfert de " + jugador.getNombre() + " a été rejeté par l'entraîneur.");
            } else {
                System.out.println("Décision invalide. Utilisez 'Aceptar' ou 'Rechazar'.");
            }
        } else {
            System.out.println("Le joueur " + jugador.getNombre() + " n'a pas demandé de transfert.");
        }
    }

    @Override
    public String toString() {
        return "Presidente: " + nombre;
    }
}
