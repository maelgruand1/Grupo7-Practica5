package com.practica5;

import com.practica5.Jugadores.EstadoTraspaso;
import com.practica5.Jugadores.Jugador;

public class Presidente {
    private String nombre;

    public Presidente(String nombre) {
        this.nombre = nombre;
    }

    public void decidirTraspaso(Jugador jugador, Equipo origen, Equipo destino, boolean aceptar) {
        if (jugador.getEstadoTraspaso() != EstadoTraspaso.APROBADO_POR_ENTRENADOR) {
            System.out.println("Error: El presidente solo puede decidir sobre jugadores aprobados por el entrenador.");
            return;
        }

    }
}
