/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine;

import componentesPelicula.Actor;
import componentesPelicula.Director;
import componentesPelicula.Productora;

/**
 *
 * @author begax
 */
public class Pelicula {
    String titulo;
    Director direccion;
    Productora casaProductora;
    Actor reparto;

    public Pelicula() {
        direccion = new Director();
        casaProductora = new Productora();
        reparto = new Actor();
    }

    public Pelicula(String titulo, Director direccion, Productora casaProductora, Actor reparto) {
        this.titulo = titulo;
        this.direccion = direccion;
        this.casaProductora = casaProductora;
        this.reparto = reparto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Director getDireccion() {
        return direccion;
    }

    public void setDireccion(Director direccion) {
        this.direccion = direccion;
    }

    public Productora getCasaProductora() {
        return casaProductora;
    }

    public void setCasaProductora(Productora casaProductora) {
        this.casaProductora = casaProductora;
    }

    public Actor getReparto() {
        return reparto;
    }

    public void setReparto(Actor reparto) {
        this.reparto = reparto;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", direccion=" + direccion + ", casaProductora=" + casaProductora + ", reparto=" + reparto + '}';
    }
    
    
    
}
