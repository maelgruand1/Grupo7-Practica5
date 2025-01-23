package com.practica5;

public class Presidente {
    private int dni;
    private String nomnbre;
    private Equipo equipo;

    public Presidente(int dni, String nomnbre, Equipo equipo) {
        this.dni = dni;
        this.nomnbre = nomnbre;
        this.equipo = equipo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String toString() {
        return "Presidente : " + nomnbre + " con dni " + dni + " y equipo " + equipo;
    }
}
