/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

import componentesLibro.Autor;
import componentesLibro.Editorial;

/**
 *
 * @author begax
 */
public class Libro {
    private String titulo;
    private Autor autores;
    private Editorial editoriales;

    public Libro() {
        autores = new Autor();
        editoriales = new Editorial();
        
        
    }

    public Libro(String titulo, Autor autores, Editorial editoriales) {
        this.titulo = titulo;
        this.autores = autores;
        this.editoriales = editoriales;
    }

    public Editorial getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(Editorial editoriales) {
        this.editoriales = editoriales;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutores() {
        return autores;
    }

    public void setAutores(Autor autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autores=" + autores + ", editoriales=" + editoriales + '}';
    }
    
    
}
