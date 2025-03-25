package com.practica5;

import com.practica5.Jugadores.Jugador;

public interface GestorTraspasos {
    void aprobarTraspaso(Jugador jugador);  // Método para aprobar traspaso de un jugador
    void rechazarTraspaso(Jugador jugador); // Método para rechazar traspaso de un jugador
}
