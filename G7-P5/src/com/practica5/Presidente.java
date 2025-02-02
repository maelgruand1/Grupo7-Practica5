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

                System.out.println("Traspaso aprobado por el presidente " + nombre + 
                ": " + jugador.getNombre() + " pasa de " + origen.getNombre() + " a " + destino.getNombre());
            } else {
                jugador.setEstadoTraspaso(EstadoTraspaso.RECHAZADO_POR_PRESIDENTE);
                System.out.println("Traspaso rechazado por el presidente " + nombre + 
                " para el jugador " + jugador.getNombre());
            }
        }
    }

    
