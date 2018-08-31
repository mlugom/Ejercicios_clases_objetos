
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo de Trabajo
 */
public class PruebaLibro {
    public static void main(String[] args) {
        Libro libA = new Libro("titA", "autA", 20, 7);
        Libro libB = new Libro("titB", "autB", 10, 3);
        Libro libC = new Libro("titC", "autC", 100, 8);
        
        ConjuntoLibros estante1 = new ConjuntoLibros();
        
        estante1.anadirLibro(libA);
        estante1.anadirLibro(libB);
        
        estante1.eliminarxTitulo("titB");
        estante1.eliminarxAutor("autA");
        
        estante1.anadirLibro(libC);
        
        System.out.println(Arrays.toString(estante1.mostrarContenido()));
        
    }
}
