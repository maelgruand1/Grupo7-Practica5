package com.practica5.Jugadores;

import com.practica5.Trabajador;
import com.practica5.Equipo;
import com.practica5.Jugadores.EstadoTraspaso;
import com.practica5.Jugadores.Poticion;
import java.util.Date;

/**
 * Clase que representa a un jugador de fútbol con atributos como posición,
 * dorsal, estado del traspaso y equipo.
 */
public class Jugador extends Trabajador {
    private Poticion posicion;
    private int dorsal;
    private EstadoTraspaso traspaso;
    private Equipo equipo;
    private static int contadorJugadores = 0;

    /**
     * Constructor para crear un nuevo jugador.
     *
     * @param nombre Nombre del jugador.
     * @param fechaNacimiento Fecha de nacimiento.
     * @param paisOrigen País de origen.
     * @param posicion Posición en el campo.
     * @param dorsal Número de dorsal.
     * @param equipo Equipo actual.
     */
    public Jugador(String nombre, Date fechaNacimiento, String paisOrigen, Poticion posicion, int dorsal, Equipo equipo) {
        super(nombre, fechaNacimiento, paisOrigen);
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.traspaso = EstadoTraspaso.SIN_SOLICITAR;
        this.equipo = equipo;
        contadorJugadores++;
    }

    // Getters y setters
    public Poticion getPosicion() {
        return posicion;
    }

    public void setPosicion(Poticion posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        if (dorsal >= 0) {
            this.dorsal = dorsal;
        }
    }

    public EstadoTraspaso getTraspaso() {
        return traspaso;
    }

    public void setTraspaso(EstadoTraspaso traspaso) {
        this.traspaso = traspaso;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo nuevoEquipo) {
        this.equipo = nuevoEquipo;
    }

    /**
     * Solicita un traspaso para el jugador.
     */
    public void solicitarTraspaso() {
        if (this.traspaso == EstadoTraspaso.SOLICITADO) {
            System.out.println("El jugador ya ha solicitado un traspaso.");
        } else {
            this.traspaso = EstadoTraspaso.SOLICITADO;
            System.out.println("El jugador " + getNombre() + " ha solicitado un traspaso.");
        }
    }

    /**
     * Devuelve el número total de jugadores instanciados.
     */
    public static int getContadorJugadores() {
        return contadorJugadores;
    }

    /**
     * Muestra la información del jugador.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Jugador: " + getNombre() +
                "\nFecha de nacimiento: " + getFechaNacimiento() +
                "\nPaís de origen: " + getPaisOrigen() +
                "\nPosición: " + posicion +
                "\nDorsal: " + dorsal +
                "\nEstado del traspaso: " + traspaso +
                "\nEquipo: " + (equipo != null ? equipo.getAbreviatura() : "Sin equipo"));
    }

    @Override
    public String toString() {
        return "Jugador: " + getNombre() + ", Dorsal: " + dorsal +
                ", Estado Traspaso: " + traspaso +
                ", Equipo: " + (equipo != null ? equipo.getAbreviatura() : "Sin equipo");
    }
}
