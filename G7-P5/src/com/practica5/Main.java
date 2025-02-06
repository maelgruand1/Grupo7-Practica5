package com.practica5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.practica5.Entrenador.Entrenador;
import com.practica5.Entrenador.Formacion;
import com.practica5.Jugadores.Jugador;
import com.practica5.Jugadores.Poticion;

public class Main {

    public static Date getFechaNacimiento(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Le mois commence à 0, donc il faut soustraire 1
        return calendar.getTime();
    }

    public static void main(String[] args) {
        Entrenador entrenador1 = new Entrenador("Guardiola", Formacion._433);
        Entrenador entrenador2 = new Entrenador("Mourinho", Formacion._442);
        ArrayList<Jugador> jugadoresEquipo1 = new ArrayList<Jugador>();
        ArrayList<Jugador> jugadoresEquipo2 = new ArrayList<Jugador>();

        // Création des présidents
        Presidente presidente1 = new Presidente("Laporta");
        Presidente presidente2 = new Presidente("Perez");
        Equipo equipo1 = new Equipo("FCB", entrenador1, presidente1, jugadoresEquipo1);
        Equipo equipo2 = new Equipo("RMA", entrenador2, presidente2, jugadoresEquipo2);

        // Création des joueurs
        Jugador jugador1 = new Jugador("Messi", getFechaNacimiento(2000, 10, 20), "Argentina", Poticion.delantero, 10,
                equipo1);
        Jugador jugador2 = new Jugador("Ronaldo", getFechaNacimiento(2004, 2, 21), "Portugal", Poticion.delantero, 7,
                equipo2);

        // Ajouter les joueurs aux équipes
        jugadoresEquipo1.add(jugador1);
        jugadoresEquipo2.add(jugador2);

        // Afficher les équipes et leurs joueurs
        System.out.println(equipo1);
        System.out.println(equipo2);

        // Simuler une demande de transfert
        System.out.println("\n--- SOLICITUD DE TRASPASO ---");
        jugador1.solicitarTraspaso();
        jugador2.solicitarTraspaso();
        
        System.out.println(jugador1);
        System.out.println(jugador2);

        // Trainer decision
        System.out.println("\n--- DECISIÓN DEL ENTRENADOR ---");
        entrenador1.decidirTraspaso(jugador1, "Aceptar"); 
        System.out.println(jugador1);
        entrenador2.decidirTraspaso(jugador2, "Aceptar"); 
        System.out.println(jugador2);

        // President desision
        System.out.println("\n--- DECISIÓN DEL PRESIDENTE ---");
        presidente1.decidirTraspaso(jugador1, "Aceptar"); 
        presidente2.decidirTraspaso(jugador2, "Aceptar"); 

        System.out.println(jugador1);
        System.out.println(jugador2);

        // Réalisation du transfert
        System.out.println("\n--- TRASPASO REALIZADO ---");
        equipo1.hacerTransferencia(jugador1, equipo2);
        equipo2.hacerTransferencia(jugador2, equipo1);
        
        System.out.println(jugador1);
        System.out.println(jugador2);

        System.out.println(equipo1);
        System.out.println(equipo2);

    }
}
