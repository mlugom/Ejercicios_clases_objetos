/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibros {
    private Libro[] coleccion;

    public ConjuntoLibros() {
        this.coleccion = new Libro[4];
    }
    
    public boolean anadirLibro(Libro libro){
        for(int i = 0; i < this.coleccion.length; i++){
            if(this.coleccion[i] == null){
                this.coleccion[i] = libro;
                return true;
            }
        }
        return false;
    }
    public boolean eliminarxAutor(String autor){
        for(int i = 0; i < this.coleccion.length; i++){
            if(this.coleccion[i].getAutor().equals(autor)){
                this.coleccion[i] = null;
                return true;
            }
        }
        return false;
    }
    public boolean eliminarxTitulo(String titulo){
        for(int i = 0; i < this.coleccion.length; i++){
            if(this.coleccion[i].getTitulo().equals(titulo)){
                this.coleccion[i] = null;
                return true;
            }
        }
        return false;
    }
    public Libro obtenerMejorCalificado(){
        float comp = 0;
        for(int i = 0; i < this.coleccion.length; i++){
            if(this.coleccion[i].getCalificacion() > comp){
                comp = this.coleccion[i].getCalificacion();
            }
        }
        for(int i = 0; i < this.coleccion.length; i++){
            if(this.coleccion[i].getCalificacion() == comp){
                return this.coleccion[i];
            }
        }
    }
    public Libro obtenerPeorCalificado(){
        return null;
    }
    public Libro[] mostrarContenido(){
        return this.coleccion;
    }
            
}
