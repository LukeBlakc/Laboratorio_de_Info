/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg1.semana.pkg5.clase.pkg13.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author avin_
 */
public class Unidad1Semana5Clase13Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int plato, cantidad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 1 o 2 según el plato que desea : ");
        plato = entrada.nextInt();
        System.out.println("Numero de ordenes: ");
        cantidad = entrada.nextInt();
        double totalInicial = 0, descuento, totalFinal = 0, precioPlato1= 5, precioPlato2 = 7;
        if (plato == 1){
            if (cantidad >= 1 & cantidad <=5){
                descuento = 0.05;
                totalInicial = cantidad * precioPlato1;
                totalFinal = totalInicial - (totalInicial * descuento);
            } else if (cantidad >= 6 & cantidad <= 10){
                totalInicial = cantidad * precioPlato1;
                descuento = 0.07;
                totalFinal = totalInicial - (totalInicial * descuento);
            } else if (cantidad >= 11){
                totalInicial = cantidad * precioPlato1;
                descuento = 0.09;
                totalFinal = totalInicial - (totalInicial * descuento);
            } else{
                System.out.println("Cantidad equivocada");
            }
        } else if (plato == 2){
            if (cantidad >= 1 & cantidad <=5 ){
                totalInicial = cantidad * precioPlato2;
                descuento = 0.06;
                totalFinal = totalInicial - (totalInicial * descuento);
            } else if (cantidad >= 6 & cantidad <= 10){
                totalInicial = cantidad * precioPlato2;
                descuento = 0.09;
                totalFinal = totalInicial - (totalInicial * descuento);
            } else if (cantidad >= 11){
                totalInicial = cantidad *  precioPlato2;
                descuento = 0.12;
                totalFinal = totalInicial - (totalInicial *  descuento);
            } else {
                System.out.println("Cantidad equivocada");
            }
        } else {
            System.out.println("Plato equivocado");
        }
        System.out.println("El menu es: " + plato);
        System.out.println("La cantidad es: " + cantidad);
        System.out.println("El total inicial es: " + totalInicial);
        System.out.println("El total final es: " + totalFinal);
    }
    
}
