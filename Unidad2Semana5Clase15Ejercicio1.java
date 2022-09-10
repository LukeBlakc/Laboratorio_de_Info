/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg2.semana.pkg5.clase.pkg15.ejercicio.pkg1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author avin_
 */
public class Unidad2Semana5Clase15Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area, descuento, preciototal = 10000, total;
        Scanner entrada = new Scanner(System.in);
        area = entrada.nextDouble();
        int valor = 0;
        if (area > 400 && area < 500){
            valor = 1;
        } else if (area > 500 &&area < 1000){
            valor = 2;
        } else if (area > 1000){
            valor = 3;
        }
        switch(valor){
            case 1:
                descuento = preciototal * .10;
                total = preciototal - descuento;
                JOptionPane.showMessageDialog(null, "Se aplica un descuento de 10%");
                JOptionPane.showMessageDialog(null, "El precio es de: " + total);
                break;
            case 2:
                descuento = preciototal * .17;
                total = preciototal - descuento;
                JOptionPane.showMessageDialog(null, "Se aplica un descuento de 17%");
                JOptionPane.showMessageDialog(null, "El precio es de: " + total);
                break;
            case 3:
                descuento = preciototal * .25;
                total = preciototal - descuento;
                JOptionPane.showMessageDialog(null, "Se aplica un descuento de 25%");
                JOptionPane.showMessageDialog(null, "El precio es de: " + total);
                break;
            default:
                System.out.println("Tu terreno no aplica a descuento");
                break;
        }
    }
    
}
