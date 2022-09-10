/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg3.semana.pkg4.semana.pkg5.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author avin_
 */
public class Unidad3Semana4Semana5Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        int valor;
        do{
            System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza): ");
            valor = datos.nextInt();
            if (valor >= 100){
            System.out.println("Es de 3 dígitos ");
        } else {
                if (valor >= 10){
                    System.out.println("Es de 2 dígitos ");
                } else{
                    System.out.println("Es de 1 dígito");
                }
            }
        } while (valor != 0);
    }
    
}
