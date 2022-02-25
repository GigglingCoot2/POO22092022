/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareadlibro;

/**
 *
 * @author begax
 */
public class TareaDLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("===Tarea Libro==");
        
        System.out.println("                    ");
        
        Libro libro1 = new Libro();
        libro1.setEditorial("Penguin Young Readers Group");
        System.out.println("Editorial: " + libro1.getEditorial());
        libro1.setAutor("Rachel Hawkins");
        System.out.println("Autor/a: " + libro1.getAutor());
        libro1.setTitulo("Her Royal Highness");
        System.out.println("Titulo: " + libro1.getTitulo());
        libro1.setApublicacion(2019);
        System.out.println("Año de publicación: " + libro1.getApublicacion());
        libro1.setPaginas(288);
        System.out.println("Numero de paginas: " + libro1.getPaginas());
        
        System.out.println("                    ");
        
        Libro libro2 = new Libro();
        libro2.setEditorial("Marvel Press");
        System.out.println("Editorial: " + libro2.getEditorial());
        libro2.setAutor("Margaret Stohl");
        System.out.println("Autor/a: " + libro2.getAutor());
        libro2.setTitulo("Black Widow:Forever Red");
        System.out.println("Titulo: " + libro2.getTitulo());
        libro2.setApublicacion(2015);
        System.out.println("Año de publicacion: " + libro2.getApublicacion());
        libro2.setPaginas(417);
        System.out.println("Numero de paginas: " + libro2.getPaginas());
        
        
    }
    
}
