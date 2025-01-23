package com.practica5;

import java.sql.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Jugador jugador = new Jugador("Toni Kros", Date.valueOf("1990-01-04"), "Alemania", 8, Poticion.centro);
        Jugador jugador1 = new Jugador("Cristiano Ronaldo", Date.valueOf("1985-02-05"), "Portugal", 7, Poticion.delentero);
        System.out.println(jugador);
        System.out.println(jugador1);
    }
}
