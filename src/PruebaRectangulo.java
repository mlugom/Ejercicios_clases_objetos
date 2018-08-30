/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
public class PruebaRectangulo {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la base y la altura del primer rectangulo.");
        double base1 = lectura.nextDouble();
        double altura1 = lectura.nextDouble();

        System.out.println("Ingrese la base y la altura del segundo rectangulo.");
        double base2 = lectura.nextDouble();
        double altura2 = lectura.nextDouble();
        
        Rectangulo[] rect = new Rectangulo[2];
        rect[0] = new Rectangulo(base1, altura1);
        rect[1] = new Rectangulo(base2, altura2);
        
        System.out.println("El perimetro y el area del primer rectangulo son: " + rect[0].calcularP() + " y " + rect[0].calcularA());
        System.out.println("El perimetro y el area del segundo rectangulo son: " + rect[1].calcularP() + " y " + rect[1].calcularA());
    }
}
