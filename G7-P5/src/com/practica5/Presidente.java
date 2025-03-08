package com.practica5;

import com.practica5.Jugadores.EstadoTraspaso;
import com.practica5.Jugadores.Jugador;
import java.util.Date;

/**
 * Clase que representa a un presidente de un equipo de fútbol. El presidente tiene la capacidad
 * de decidir sobre los traspasos de los jugadores, siempre y cuando el entrenador haya aprobado
 * previamente el traspaso.
 */
public class Presidente extends Trabajador {  // Hereda de Trabajador
    private static int contadorPresidentes = 0; // Atributo estático para contar instancias

    /**
     * Constructor para crear un nuevo presidente con los atributos proporcionados.
     *
     * @param nombre El nombre del presidente.
     * @param fechaNacimiento La fecha de nacimiento del presidente.
     * @param paisOrigen El país de origen del presidente.
     */
    public Presidente(String nombre, Date fechaNacimiento, String paisOrigen) {
        super(nombre, fechaNacimiento, paisOrigen);  // Llamada al constructor de la clase base
        contadorPresidentes++; // Incrementa el contador al crear una instancia
    }

    /**
     * Obtiene el contador de presidentes.
     *
     * @return El número de presidentes creados.
     */
    public static int getContadorPresidentes() {
        return contadorPresidentes;
    }

    /**
     * Método para que el presidente decida sobre un traspaso de un jugador.
     * El traspaso solo se puede aprobar o rechazar si el entrenador ha aprobado previamente
     * el traspaso del jugador. Si la decisión es "Aceptar", el presidente aprueba el traspaso;
     * si es "Rechazar", lo rechaza.
     *
     * @param jugador El jugador cuyo traspaso se está decidiendo.
     * @param decision La decisión del presidente sobre el traspaso ("Aceptar" o "Rechazar").
     */
    public void decidirTraspaso(Jugador jugador, String decision) {
        // Verifica si el entrenador ya ha aprobado el traspaso
        if (jugador.getTraspaso() == EstadoTraspaso.APROBADO_POR_ENTRENADOR) {
            if ("Aceptar".equalsIgnoreCase(decision)) {
                jugador.setTraspaso(EstadoTraspaso.APROBADO_POR_PRESIDENTE);
                System.out.println("El traspaso de " + jugador.getNombre() + " ha sido aprobado por el presidente.");
            } else if ("Rechazar".equalsIgnoreCase(decision)) {
                jugador.setTraspaso(EstadoTraspaso.RECHAZADO_POR_PRESIDENTE);
                System.out.println("El traspaso de " + jugador.getNombre() + " ha sido rechazado por el presidente.");
            } else {
                System.out.println("Decisión inválida. Use 'Aceptar' o 'Rechazar'.");
            }
        } else {
            System.out.println("El jugador " + jugador.getNombre() + " no ha sido aprobado por el entrenador para el traspaso.");
        }
    }

    /**
     * Método para representar al presidente como una cadena de texto.
     *
     * @return Una cadena que representa al presidente con su nombre.
     */
    @Override
    public String toString() {
        return "Presidente: " + getNombre();  // Usamos getNombre() heredado de Trabajador
    }

    @Override
    public void mostrarInfo() {
        System.out.println(this.toString());
    }
}

