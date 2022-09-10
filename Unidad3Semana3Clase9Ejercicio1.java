/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg3.semana.pkg3.clase.pkg9.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author avin_
 */
public class Unidad3Semana3Clase9Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte opcion = 0;
        Scanner lectura = new Scanner(System.in);
        do {
            System.out.println("1. Mostrar 100 números con un bucle for");
            System.out.println("2. Mostrar 100 números con un bucle while");
            System.out.println("3. Introduce un número. ¿Es mayor que cero?");
            
            System.out.println("Introduce un número: ");
            
            opcion = lectura.nextByte();
            
        } while (opcion < 1 || opcion > 3);
        
        switch(opcion){
            case 1:
                System.out.println("Opción 1 ejecutada");
                break;
            case 2:
                System.out.println("Opción 2 ejecutada");
                break;
            case 3:
                System.out.println("Opción 3 ejecutada");
                break;
                default:
                    System.out.println("Es imposible que el programa entre aquí");
        }
    }
    
}
