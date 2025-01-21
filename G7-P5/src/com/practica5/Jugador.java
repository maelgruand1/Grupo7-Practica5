package com.practica5;
import java.util.Date;

public class Jugador {
   private String nombre;
   private Date fechaNacimiento;
   private String pais;
   private int dorsal;
   private String poticion;


public Jugador(String nombre, Date fechaNacimiento, String pais, int dorsal, String poticion) {
   this.nombre = nombre;
   this.fechaNacimiento = fechaNacimiento;
   this.pais = pais;
   this.dorsal = dorsal;
   this.poticion = poticion;
}

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

public String getPoticion() {
   return poticion;
}

public void setPoticion(String poticion) {
   this.poticion = poticion;
}


public String toString() {
   return "Jugador : " +
           "nombre='" + nombre + '\'' +
           ", fechaNacimiento=" + fechaNacimiento +
           ", pais='" + pais + '\'' +
           ", dorsal=" + dorsal +
           ", poticion=" + poticion;

}

}




