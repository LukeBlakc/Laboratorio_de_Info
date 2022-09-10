/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg1.semana.pkg5.clase.pkg14.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author avin_
 */
public class Unidad1Semana5Clase14Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int reglas;
        double nota;
        System.out.println("Usted cumple con lsa reglas de la universidad: ");
        System.out.println("Ingrese un numero: \n 1.Simpre \n 2.A veces \n 3.Nunca");
        reglas = entrada.nextInt();
        System.out.println("Que nota obtuvo en el laboratorio: ");
        nota = entrada.nextDouble();
        if (reglas == 1){
            if (nota >= 8 & nota <= 10){
                nota = 10;
            } else{
                System.out.println("Nota invalida");
            }
        } else if(reglas == 2){
            if (nota < 6){
                nota = nota + 0.5;
            } else if (nota >=6 & nota < 8){
                nota = nota + 0.7;
            } else {
                System.out.println("Nota invalida");
            }
        } else{
            System.out.println("Usted debe cumplir las reglas");
        }
        System.out.println("la nueva nota es: " + nota);
    }
    
}
