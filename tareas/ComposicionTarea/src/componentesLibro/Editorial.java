/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentesLibro;

/**
 *
 * @author begax
 */
public class Editorial {
    private String nombre;
    private int anioFundacion;

    public Editorial() {
    }

    public Editorial(String nombre, int anioFundacion) {
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(int anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", anioFundacion=" + anioFundacion + '}';
    }
    
    
}
