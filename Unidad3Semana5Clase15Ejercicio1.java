/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg3.semana.pkg5.clase.pkg15.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author avin_
 */
public class Unidad3Semana5Clase15Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad, suma = 0, contador = 0, promedio = 0;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Ingrese la edad de la persona: ");
            edad = teclado.nextInt();
            suma = suma + edad;
            contador = contador + 1;
            promedio = suma / contador;
            System.out.println("El promedio de ahora es " + promedio);
            if (promedio > 25){
                break;
            }
        }while (edad > 0);
        System.out.println("La suma de las edades es: " + suma + ". La cantidad de edades ingresadas fueron: " + contador);
        System.out.println("El promedio es igual a: " + promedio);
        if (promedio >25 ){
            System.out.println("El promedio fue mayor que 25 y ha finalizado");
    } else{
            System.out.println("Reinicia el programa ya que el promedio no fue superior a 25");
        }
}
    
}
