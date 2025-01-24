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

   // para gestionar los estados de los traspasos

   public EstadoTraspaso getEstadoTraspaso() {
      return estadoTraspaso;
   }

   public void setEstadoTraspaso(EstadoTraspaso estado) {
      this.estadoTraspaso = estado;
   }

   public void solicitarTraspaso() {
      if (estadoTraspaso == EstadoTraspaso.SIN_SOLICITAR) {
         estadoTraspaso = EstadoTraspaso.SOLICITADO;
         System.out.println(nombre + " ha solicitado un traspaso.");
      } else {
         System.out.println("El traspaso ya ha sido solicitado o está en otro estado: " + estadoTraspaso);
      }
   }
}