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
    public Equipo(String abreviatura, Entrenador entrenador, Presidente presidente, ArrayList<Jugador> jugadores) {
        this.abreviatura = abreviatura;
        this.entrenador = entrenador;
        this.presidente = presidente;
        this.jugadores = jugadores;
    }
    

    // Méthode pour ajouter un joueur
    public void agregarJugador(Jugador jugador) {
        if (!jugadores.contains(jugador)) {
            jugadores.add(jugador);
            System.out.println("Jugador " + jugador.getNombre() + " agregado al equipo " + abreviatura);
        } else {
            System.out.println("Jugador " + jugador.getNombre() + " ya está en el equipo.");
        }
    }

    // Méthode pour réaliser un traspaso (simplifiée)

    public void hacerTransferencia(Jugador jugador, Equipo nuevoEquipo) {
        if (jugador.getTraspaso() == EstadoTraspaso.APROBADO_POR_PRESIDENTE) {
            // Supprimer le joueur de l'équipe actuelle
            jugadores.remove(jugador);
            jugador.setEquipo(nuevoEquipo);
            // Ajouter le joueur à la nouvelle équipe
            nuevoEquipo.agregarJugador(jugador);
            System.out.println("El jugador " + jugador.getNombre() + " ha sido movido a " + nuevoEquipo.abreviatura);
        } else {
            System.out.println("La transferencia no ha podido realizarse: " + jugador.getNombre()
                    + " no ha sido movido a " + nuevoEquipo.abreviatura);
        }

    }
    

    @Override
    public String toString() {

        return "Equipo: " + abreviatura + ", Entrenador: " + entrenador.getNombre() + ", Presidente: "
                + presidente.getNombre() + ", Jugadores: " + jugadores;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }


    public String toString() {
        return "Equipo : " +
                "nombre='" + nombre + '\'' +
                ", presidente=" + presidente +
                ", entrenador=" + entrenador +
                ", jugador=" + jugador;
    }

}
