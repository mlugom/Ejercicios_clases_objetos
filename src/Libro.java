/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Libro {
    private String titulo;
    private String autor;
    private int pags;
    private float calificacion;

    public Libro(String titulo, String autor, int pags, float calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.pags = pags;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPags() {
        return pags;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPags(int pags) {
        this.pags = pags;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    
    
}
