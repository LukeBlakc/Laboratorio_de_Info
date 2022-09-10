/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg3.semana.pkg4.clase.pkg12.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author avin_
 */
public class Unidad3Semana4Clase12Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0, cant = 0, valor, promedio;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Ingrese 0 para salir");
            System.out.println("Ingrese el valor: ");
            valor = entrada.nextInt();
            if (valor != 0){
                suma = suma + valor;
                cant = cant + 1;
            }
        }while (valor != 0);
        if(cant != 0){
            promedio = suma / cant;
            System.out.println("El promedio es: " + promedio);
        } else{
            System.out.println("No se ingresaron valores");
        }
    }
    
}
