/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composiciontarea;

import Cine.Pelicula;
import Libreria.Libro;
import componentesLibro.Autor;
import componentesLibro.Editorial;
import componentesPelicula.Actor;
import componentesPelicula.Director;
import componentesPelicula.Productora;

/**
 *
 * @author begax
 */
public class ComposicionTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro miLibro = new Libro("Los juegos del hambre", 
                new Autor("Suzanne Collins", "Estadoudidense"), 
                new Editorial("Schoolastic Press", 1920));
        
        System.out.println(miLibro);
        
        System.out.println("---------------------------------------------------------------------------");
        
        Pelicula miPeli = new Pelicula("Black Widow", 
                new Director("Cate Shortlan", 4), 
                new Productora("Marvel Studios", "Avi Arad"), 
                new Actor("Scarlett Johansson", 37));
        System.out.println(miPeli);
        
        
        
    }
    
}
