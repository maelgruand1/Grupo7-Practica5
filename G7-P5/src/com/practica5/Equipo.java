package com.practica5;

import com.practica5.Entrenador.Entrenador;
import com.practica5.Jugadores.Jugador;
import com.practica5.Jugadores.EstadoTraspaso;
import java.util.ArrayList;

public class Equipo {
    private String abreviatura;
    private Entrenador entrenador;
    private Presidente presidente;
    private ArrayList<Jugador> jugadores;

    // Constructeur
    public Equipo(String abreviatura, Entrenador entrenador, Presidente presidente) {
        this.abreviatura = abreviatura;
        this.entrenador = entrenador;
        this.presidente = presidente;
        this.jugadores = new ArrayList<>();
    }

    // Méthode pour ajouter un joueur
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    // Méthode pour réaliser un traspaso (simplifiée)
    public void realizarTraspaso(Jugador jugador, Equipo nuevoEquipo) {
        if (jugador.getTraspaso() == EstadoTraspaso.APROBADO_POR_PRESIDENTE) {
            jugadores.remove(jugador);
            nuevoEquipo.agregarJugador(jugador);
        }
    }

    public void hacerTransferencia(Jugador jugador, Equipo nuevoEquipo) {
        if (jugador.getTraspaso() == EstadoTraspaso.APROBADO_POR_PRESIDENTE) {
            // Supprimer le joueur du team actuel
            jugadores.remove(jugador);
            // Ajouter le joueur à l'équipe nouvelle
            nuevoEquipo.agregarJugador(jugador);
            System.out.println("Le joueur " + jugador.getNombre() + " a été transféré vers " + nuevoEquipo.abreviatura);
        } else {
            System.out.println("Le transfert de " + jugador.getNombre() + " n'a pas été approuvé par le président.");
        }
    }

    @Override
    public String toString() {
        return "Equipo: " + abreviatura + ", Entrenador: " + entrenador.getNombre() + ", Presidente: "
                + presidente.getNombre();
    }
}
