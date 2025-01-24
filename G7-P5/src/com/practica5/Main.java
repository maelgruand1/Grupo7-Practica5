package com.practica5;

// modulos
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
        cal.set(day, month, year);
        return cal.getTime();
    }

    public static void main(String[] args) throws Exception {

        Jugador jugador = new Jugador("Toni Kros", getFecha(18, 07, 1999), "Alemania", 8, Poticion.centro);
        jugador.solicitarTraspaso(); // Debería cambiar el estado a SOLICITADO

        Jugador jugador1 = new Jugador("Cristiano Ronaldo", getFecha(5, 6, 1985), "Portugal", 7,
                Poticion.delentero);
        jugador1.solicitarTraspaso();

        Jugador jugador2 = new Jugador("Lionel Messi", getFecha(05, 06, 1987), "Argentina", 10,
                Poticion.izquierdo);
        jugador2.solicitarTraspaso();

        Jugador jugador3 = new Jugador("Neymar", getFecha(05, 06, 1992), "Brasil", 10, Poticion.derecho);
        jugador3.solicitarTraspaso();

        Jugador jugador4 = new Jugador("Kylian Mbappe", getFecha(01, 01, 1998), "Francia", 10,
                Poticion.delentero);
        jugador4.solicitarTraspaso();

        Jugador jugador5 = new Jugador("Luka Modric", getFecha(01, 01, 1988), "Croacia", 10,
                Poticion.defensor);
        jugador5.solicitarTraspaso();

        Entrenador entrenador = new Entrenador("Zinedine Zidane", Formacion._433);
        Presidente presidente = new Presidente(456789, "Florentino Perez", null);

        ArrayList<Jugador> realMadrid = new ArrayList<Jugador>();
        ArrayList<Jugador> barcelona = new ArrayList<Jugador>();
        realMadrid.add(jugador);
        realMadrid.add(jugador1);
        barcelona.add(jugador2);
        barcelona.add(jugador3);
        realMadrid.add(jugador4);
        barcelona.add(jugador5);

        Equipo equipo = new Equipo("Real Madrid", presidente, entrenador, realMadrid);
        Equipo equipo2 = new Equipo("Barcelona", presidente, entrenador, barcelona);
        System.out.println(equipo);
        System.out.println(equipo2);

    }
}
