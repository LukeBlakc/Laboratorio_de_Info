/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg2.semana.pkg6.clase.pkg17.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author avin_
 */
public class Unidad2Semana6Clase17Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num;
        int supar = 0;
        int sumimpar = 0;
        System.out.println("Introduce número");
        num = teclado.nextInt();
        for(int ind = 1; ind <= num; ind++){
            if(ind % 2 == 0){
                supar += ind;
            }
            else {
                sumimpar += ind;
            }
        }
        System.out.println("La suma de los pares es: " + supar);
        System.out.println("La suma de los imapres es: " + sumimpar);
    }
    
}
