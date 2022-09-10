/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg2.semana.pkg6.clase.pkg16.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author avin_
 */
public class Unidad2Semana6Clase16Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int fact = 1;
        int num = 0;
        System.out.println("Introduce numero");
        num = teclado.nextInt();
        for(int ind = 1; ind <= num; ind++){
            fact*=ind;
        }
        System.out.println("El factorial es: " + fact);
    }
    
}
