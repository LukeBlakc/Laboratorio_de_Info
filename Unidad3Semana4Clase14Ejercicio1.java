/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg3.semana.pkg4.clase.pkg14.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author avin_
 */
public class Unidad3Semana4Clase14Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota = 0,cont1 = 0,cont2 = 0;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Ingrese la nota del alumno: ");
            nota = teclado.nextInt();
            if (nota >= 7){
                cont1 = cont1 + 1;
            } else if (nota > 0){
                cont2 = cont2 + 1;
            }
        }while (nota != 0);
         System.out.println("La cantidad de alumnos que tienen notas mayores o iguales a 7 son:" + cont1);
         System.out.println("La cantidad de almunos que tienen notas menores a 7 son: " + cont2);
    }
    
}
