/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareadlibro;

/**
 *
 * @author begax
 */
public class Libro {
    private String editorial;
    private String autor;
    private String titulo;
    private int Apublicacion;
    private int paginas;
    
    public Libro () {
}

    public Libro(String editorial, String autor, String titulo, int Apublicacion, int paginas) {
        this.editorial = editorial;
        this.autor = autor;
        this.titulo = titulo;
        this.Apublicacion = Apublicacion;
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getApublicacion() {
        return Apublicacion;
    }

    public void setApublicacion(int Apublicacion) {
        this.Apublicacion = Apublicacion;
    }

    
    //tarea editada
    @Override
    public String toString() {
        return "Libro{" + "editorial=" + editorial + ", autor=" + autor + ", titulo=" + titulo + ", Apublicacion=" + Apublicacion + ", paginas=" + paginas + '}';
    }

}
