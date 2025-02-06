package com.practica5;

// Modulos
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

// Clases
import com.practica5.Entrenador.Entrenador;
import com.practica5.Entrenador.Formacion;
import com.practica5.Jugadores.EstadoTraspaso;
import com.practica5.Jugadores.Jugador;
import com.practica5.Jugadores.Poticion;

public class Main {

        public static Date getFecha(int day, int month, int year) {
                Calendar cal = Calendar.getInstance();
                cal.set(year, month, day);
                return cal.getTime();
        }

        public static void main(String[] args) throws Exception {
                Entrenador entrenador = new Entrenador("Zinedine Zidane", Formacion._433);
                Presidente presidente = new Presidente("Florentino Perez");
                ArrayList<Jugador> realMadrid = new ArrayList<Jugador>();
                ArrayList<Jugador> barcelona = new ArrayList<Jugador>();

                Equipo equipo = new Equipo("Real Madrid", presidente, entrenador, realMadrid, "RMA");
                Equipo equipo2 = new Equipo("Barcelona", presidente, entrenador, barcelona, "BAR");

                Jugador jugador = new Jugador("Toni Kros", getFecha(18, 07, 1999), "Alemania", 8, Poticion.centro);
                jugador.solicitarTraspaso(); // Debería cambiar el estado a SOLICITADO
                entrenador.decidirTraspaso(jugador, true); // Debería cambiar el estado a APROBADO_POR_ENTRENADOR
                presidente.decidirTraspaso(jugador, equipo, equipo2, true); // Debería cambiar el estado a
                                                                            // APROBADO_POR_PRESIDENTE

                Jugador jugador1 = new Jugador("Cristiano Ronaldo", getFecha(5, 6, 1985), "Portugal", 7,
                                Poticion.delentero);
                jugador1.solicitarTraspaso();
                entrenador.decidirTraspaso(jugador1, true);
                presidente.decidirTraspaso(jugador1, equipo, equipo2, true);

                Jugador jugador2 = new Jugador("Lionel Messi", getFecha(05, 06, 1987), "Argentina", 10,
                                Poticion.izquierdo);
                jugador2.solicitarTraspaso();
                entrenador.decidirTraspaso(jugador2, false);
                presidente.decidirTraspaso(jugador2, equipo2, equipo, true);

                Jugador jugador3 = new Jugador("Neymar", getFecha(05, 06, 1992), "Brasil", 10, Poticion.derecho);
                jugador3.solicitarTraspaso();
                entrenador.decidirTraspaso(jugador3, true);
                presidente.decidirTraspaso(jugador3, equipo2, equipo, false);

                Jugador jugador4 = new Jugador("Kylian Mbappe", getFecha(01, 01, 1998), "Francia", 10,
                                Poticion.delentero);
                jugador4.solicitarTraspaso();
                entrenador.decidirTraspaso(jugador4, false);
                presidente.decidirTraspaso(jugador4, equipo, equipo2, true);

                Jugador jugador5 = new Jugador("Luka Modric", getFecha(01, 01, 1988), "Croacia", 10,
                                Poticion.defensor);
                jugador5.solicitarTraspaso();
                entrenador.decidirTraspaso(jugador5, true);
                presidente.decidirTraspaso(jugador5, equipo2, equipo, false);

                // Poner en un metodo en el main

                presidente.aceptarTraspaso(jugador);
                presidente.rechazarTraspaso(jugador1);

        }

}
