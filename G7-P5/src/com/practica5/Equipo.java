package com.practica5;

import java.util.ArrayList;

import com.practica5.Entrenador.Entrenador;
import com.practica5.Jugadores.Jugador;

public class Equipo {
    private String nombre;
    private Presidente presidente;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, Presidente presidente, Entrenador entrenador, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.presidente = presidente;
        this.entrenador = entrenador;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String toString() {
        return "Equipo : " + nombre + " con presidente " + presidente + " y entrenador " + entrenador + " y jugadores "
                + jugadores;
    }
}
