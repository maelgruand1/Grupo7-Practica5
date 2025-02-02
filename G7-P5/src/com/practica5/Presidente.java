package com.practica5;

public class Presidente {
    private String nombre;

    public Presidente(String nombre){
        this.nombre = nombre;
    }
    public void decidirTraspaso(Jugador jugador, Equipo origen, Equipo destino, boolean aceptar) {
        if (jugador.getEstadoTraspaso() != EstadoTraspaso.APROBADO_POR_ENTRENADOR) {
            System.out.println("Error: El presidente solo puede decidir sobre jugadores aprobados por el entrenador.");
            return;
        }
            if (aceptar) {
                jugador.setEstadoTraspaso(EstadoTraspaso.APROBADO_POR_PRESIDENTE);
                origen.removerJugador(jugador);
                destino.agregarJugador(jugador);
            } else {
                jugador.setEstadoTraspaso(EstadoTraspaso.RECHAZADO_POR_PRESIDENTE);
            }
        }
    }
}
    
