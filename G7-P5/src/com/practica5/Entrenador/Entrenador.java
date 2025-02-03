package com.practica5.Entrenador;

import com.practica5.Jugadores.EstadoTraspaso;
import com.practica5.Jugadores.Jugador;

public class Entrenador {
    private String nombre;
    private Formacion formacion;

    public Entrenador(String nombre, Formacion formacion) {
        this.nombre = nombre;
        this.formacion = formacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Formacion getFormacion() {
        return formacion;
    }

    public void setFormacion(Formacion formacion) {
        this.formacion = formacion;
    }

    public String toString() {
        return "Entrenador : " + nombre + " con formacion de equipo " + formacion;
    }

    public void decidirTraspaso(Jugador jugador, boolean aceptar) {
      
    if(jugador.getEstadoTraspaso()==EstadoTraspaso.SOLICITADO)

    {
        jugador.setEstadoTraspaso(aceptar ? EstadoTraspaso.APROBADO_POR_ENTRENADOR
                : EstadoTraspaso.RECHAZADO_POR_ENTRENADOR);
        System.out.println("El entrenador " + nombre + " ha " +
                (aceptar ? "aprobado" : "rechazado") + " el traspaso de " + jugador.getNombre());
    }else
    {
        System.out.println("El traspaso no puede ser decidido en este estado.");
    }
    }


}
