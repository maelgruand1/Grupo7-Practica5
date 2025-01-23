package com.practica5;
import java.util.Date;

public class Jugador {
   private String nombre;
   private Date fechaNacimiento;
   private String pais;
   private int dorsal;
   private Poticion poticion;


public Jugador(String nombre, Date fechaNacimiento, String pais, int dorsal, Poticion poticion) {
   this.nombre = nombre;
   this.fechaNacimiento = fechaNacimiento;
   this.pais = pais;
   this.dorsal = dorsal;
   this.poticion = poticion;
}


// Getters y Setters
public String getNombre() {
   return nombre;
}
public void setNombre(String nombre) {
   this.nombre = nombre;
}
public Date getFechaNacimiento() {
   return fechaNacimiento;
}
public void setFechaNacimiento(Date fechaNacimiento) {
   this.fechaNacimiento = fechaNacimiento;
}
public String getPais() {
   return pais;
}
public void setPais(String pais) {
   this.pais = pais;
}
public int getDorsal() {
   return dorsal;
}

public void setDorsal(int dorsal) {
   this.dorsal = dorsal;
}

public Poticion getPoticion() {
   return poticion;
}

public void setPoticion(Poticion poticion) {
   this.poticion = poticion;
}

// Metodo para generar un String de los elementos
public String toString() {
   return "Jugador : " + nombre + " del " + fechaNacimiento + " de " + 
           pais +
           " numero : " + dorsal + " y en posición " +  poticion;
}

}




