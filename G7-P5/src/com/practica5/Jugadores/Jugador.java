package com.practica5.Jugadores;

import com.practica5.Jugadores.Jugador;

import java.util.ArrayList;
import java.util.Date;
import com.practica5.Equipo;

public class Jugador {
   private String nombre;
   private Date fechaNacimiento;
   private String paisOrigen;
   private Poticion posicion; // "Delantero", "Defensa", etc.
   private int dorsal;
   private EstadoTraspaso traspaso;
   private Equipo equipo;

   // Constructeur
   public Jugador(String nombre, Date fechaNacimiento, String paisOrigen, Poticion posicion, int dorsal,
         Equipo equipo) {
      this.nombre = nombre;
      this.fechaNacimiento = fechaNacimiento;
      this.paisOrigen = paisOrigen;
      this.posicion = posicion;
      this.dorsal = dorsal;
      this.traspaso = EstadoTraspaso.SIN_SOLICITAR;
      this.equipo = equipo;
   }

   // Getters et setters
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

   public String getPaisOrigen() {
      return paisOrigen;
   }

   public void setPaisOrigen(String paisOrigen) {
      this.paisOrigen = paisOrigen;
   }

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
      if (dorsal >= 0)
         this.dorsal = dorsal;
   }

   public EstadoTraspaso getTraspaso() {
      return traspaso;
   }

   public void setTraspaso(EstadoTraspaso traspaso) {
      this.traspaso = traspaso;
   }

   public void equipoSet(Equipo equipo) {
      equipo.agregarJugador(this);
   }

   
   public Equipo getEquipo() {
      return equipo;
   }

   public void setEquipo(Equipo nuevoClub) {
      this.equipo = nuevoClub;
   }
   public void solicitarTraspaso() {
      // Vérifie si un transfert est déjà demandé
      if (this.traspaso == EstadoTraspaso.SOLICITADO) {
         System.out.println("El jugador ya ha solicitado un traspaso.");
      } else {
         // Change l'état de traspaso en "SOLICITADO"
         this.traspaso = EstadoTraspaso.SOLICITADO;
         System.out.println("El jugador " + this.nombre + " ha solicitado un traspaso.");
      }
   }
   

   @Override
   public String toString() {
      return "Jugador: " + nombre + " " + this.fechaNacimiento + ", Dorsal: " + dorsal + ", Estado Traspaso: " + traspaso
            + " " + "equipo "
            + equipo.getAbreviatura();
   }

}