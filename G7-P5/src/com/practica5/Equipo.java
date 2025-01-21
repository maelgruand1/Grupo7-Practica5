package com.practica5;

public class Equipo {
    private String nombre;
    private Presidente presidente;
    private Entrenador entrenador;
    private Jugador jugador;
    
    public Equipo(String nombre, Presidente presidente, Entrenador entrenador, Jugador jugador) {
        this.nombre = nombre;
        this.presidente = presidente;
        this.entrenador = entrenador;
        this.jugador = jugador;
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

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    public String toString() {
        return "Equipo : " +
                "nombre='" + nombre + '\'' +
                ", presidente=" + presidente +
                ", entrenador=" + entrenador +
                ", jugador=" + jugador;
    }
}
