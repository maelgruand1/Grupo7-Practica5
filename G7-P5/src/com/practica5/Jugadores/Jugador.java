package com.practica5.Jugadores;

import java.util.Date;

public class Jugador {
   private String nombre;
   private Date fechaNacimiento;
   private String pais;
   private int dorsal;
   private Poticion poticion;
   private EstadoTraspaso estadoTraspaso;

   public Jugador(String nombre, Date fechaNacimiento, String pais, int dorsal, Poticion poticion) {
      this.nombre = nombre;
      this.fechaNacimiento = fechaNacimiento;
      this.pais = pais;
      this.dorsal = dorsal;
      this.poticion = poticion;
      this.estadoTraspaso = EstadoTraspaso.SIN_SOLICITAR;
   }

   public EstadoTraspaso getEstadoTraspaso() {
        return estadoTraspaso;
    }

   public void setEstadoTraspaso(EstadoTraspaso estado) {
    this.estadoTraspaso = estado;
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
            " numero : " + dorsal + " y en posición " + poticion;
   }

}
// para gestionar los estados de los traspasos
public enum EstadoTraspaso {
    SIN_SOLICITAR,
    SOLICITADO,
    APROBADO_POR_ENTRENADOR,
    RECHAZADO_POR_ENTRENADOR,
    APROBADO_POR_PRESIDENTE,
    RECHAZADO_POR_PRESIDENTE;
}

