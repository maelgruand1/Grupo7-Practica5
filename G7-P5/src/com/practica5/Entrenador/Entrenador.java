package Entrenador;

import Jugadores.EstadoTraspaso;
import Jugadores.Jugador;
import java.util.Date;
import Trabajador.Trabajador;

public class Entrenador extends Trabajador {
    private Formacion formacionPreferida; 
    private static int contadorEntrenadores = 0;

    // Constructor
    public Entrenador(String nombre, Date fechaNacimiento, String paisOrigen, Formacion formacionPreferida) {
        super(nombre, fechaNacimiento, paisOrigen);
        this.formacionPreferida = formacionPreferida;
        contadorEntrenadores++; 
    }

    public Formacion getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(Formacion formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    public static int getContadorEntrenadores() {
        return contadorEntrenadores;
    }

    // Método para decidir sobre un traspaso
    public void decidirTraspaso(Jugador jugador, String decision) {
        if (jugador.getTraspaso() == EstadoTraspaso.SOLICITADO) {
            if ("Aceptar".equalsIgnoreCase(decision)) {
                jugador.setTraspaso(EstadoTraspaso.APROBADO_POR_ENTRENADOR);
                System.out.println("El traspaso de " + jugador.getNombre() + " ha sido aceptado por el entrenador.");
            } else if ("Rechazar".equalsIgnoreCase(decision)) {
                jugador.setTraspaso(EstadoTraspaso.RECHAZADO_POR_ENTRENADOR);
                System.out.println("El traspaso de " + jugador.getNombre() + " ha sido rechazado por el entrenador.");
            } else {
                System.out.println("Decisión inválida. Usa 'Aceptar' o 'Rechazar'.");
            }
        } else {
            System.out.println("El jugador " + jugador.getNombre() + " no ha solicitado un traspaso.");
        }
    }

    // Implementación del método abstracto
    @Override
    public void mostrarInfo() {
        System.out.println("Entrenador: " + getNombre() + ", Nacido el: " + getFechaNacimiento() + 
                           ", País: " + getPaisOrigen() + ", Formación preferida: " + formacionPreferida);
    }
}
