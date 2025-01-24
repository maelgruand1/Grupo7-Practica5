package com.practica5;

import java.sql.Date;
import java.util.ArrayList;

import com.practica5.Entrenador.Entrenador;
import com.practica5.Entrenador.Formacion;
import com.practica5.Jugadores.Jugador;
import com.practica5.Jugadores.Poticion;

public class Main {
    public static void main(String[] args) throws Exception {
        Jugador jugador = new Jugador("Toni Kros", Date.valueOf("1990-01-04"), "Alemania", 8, Poticion.centro);
        jugador.solicitarTraspaso(); // Debería cambiar el estado a SOLICITADO

        Jugador jugador1 = new Jugador("Cristiano Ronaldo", Date.valueOf("1985-02-05"), "Portugal", 7,
                Poticion.delentero);

        Entrenador entrenador = new Entrenador("Zinedine Zidane", Formacion._433);
        Presidente presidente = new Presidente(456789, "Florentino Perez", null);

        ArrayList<Jugador> realMadrid = new ArrayList<Jugador>();
        realMadrid.add(jugador);
        realMadrid.add(jugador1);

        Equipo equipo = new Equipo("Real Madrid", presidente, entrenador, realMadrid);
        System.out.println(equipo);

    }
}
