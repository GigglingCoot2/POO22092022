/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentesPelicula;

/**
 *
 * @author begax
 */
public class Director {
    private String nombre;
    private int nomPeliculas;

    public Director() {
    }

    public Director(String nombre, int nomPeliculas) {
        this.nombre = nombre;
        this.nomPeliculas = nomPeliculas;
    }

    public int getNomPeliculas() {
        return nomPeliculas;
    }

    public void setNomPeliculas(int nomPeliculas) {
        this.nomPeliculas = nomPeliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", nomPeliculas=" + nomPeliculas + '}';
    }
    
    
}
