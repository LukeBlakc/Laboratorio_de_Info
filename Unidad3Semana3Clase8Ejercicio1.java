/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg3.semana.pkg3.clase.pkg8.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author avin_
 */
public class Unidad3Semana3Clase8Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Reader = new Scanner(System.in);
        String quieroJugar = "si";
        while(quieroJugar.equals("si")){
            System.out.println("¿Quieres seguir jugando");
            quieroJugar = Reader.next();
        }
    }
    
}
