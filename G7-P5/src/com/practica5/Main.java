package com.practica5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.practica5.Entrenador.Entrenador;
import com.practica5.Entrenador.Formacion;
import com.practica5.Jugadores.EstadoTraspaso;
import com.practica5.Jugadores.Jugador;
import com.practica5.Jugadores.Poticion;

public class Main {
    public static Date getFechaNacimiento(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar.getTime();
    }

    public static void main(String[] args) {
        // Creación de las fechas de nacimiento de los jugadores

        // Creación de los jugadores
        Jugador jugador1 = new Jugador("Messi", getFechaNacimiento(2000, 10, 20), "Argentina", Poticion.delentero, 10);
        Jugador jugador2 = new Jugador("Ronaldo", getFechaNacimiento(2004, 02, 21), "Portugal", Poticion.delentero, 7);

        // Creación de un entrenador
        Entrenador entrenador1 = new Entrenador("Guardiola", Formacion._433);
        Entrenador entrenador2 = new Entrenador("Mourinho", Formacion._442);

        // Creación de un presidente
        Presidente presidente1 = new Presidente("Laporta");
        Presidente presidente2 = new Presidente("Perez");

        // Creación de los equipos
        ArrayList<Jugador> jugadoresEquipo1 = new ArrayList<>();
        jugadoresEquipo1.add(jugador1);

        ArrayList<Jugador> jugadoresEquipo2 = new ArrayList<>();
        jugadoresEquipo2.add(jugador2);

        Equipo equipo1 = new Equipo("FCB", entrenador1, presidente1);
        Equipo equipo2 = new Equipo("RMA", entrenador2, presidente2);

        // Asociación de los jugadores con sus equipos
        jugador1.setEquipo(equipo1);
        jugador2.setEquipo(equipo2);

        // Mostrar los equipos y sus jugadores
        System.out.println(equipo1);
        System.out.println(equipo2);

        // Simular una solicitud de traspaso
        System.out.println("\n--- SOLICITUD DE TRASPASO ---");
        jugador1.setEstadoTraspaso(EstadoTraspaso.SOLICITADO);
        System.out.println(jugador1);

        // Decisión del entrenador
        System.out.println("\n--- DECISIÓN DEL ENTRENADOR ---");
        entrenador1.decidirTraspaso(jugador1, "Aceptar"); // Aceptado por el entrenador
        System.out.println(jugador1);

        // Decisión del presidente
        System.out.println("\n--- DECISIÓN DEL PRESIDENTE ---");
        presidente1.decidirTraspaso(jugador1, "Rechazar"); // Rechazado por el presidente
        System.out.println(jugador1);

        // Realizar el traspaso
        System.out.println("\n--- TRASPASO REALIZADO ---");
        equipo1.hacerTransferencia(jugador1, equipo2);
        equipo1.hacerTransferencia(jugador2, equipo2);
        System.out.println(equipo1);
        System.out.println(equipo2);
    }
}
}