/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg2.semana.pkg7.clase.pkg19.ejercicio.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author avin_
 */
public class Unidad2Semana7Clase19Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String daysLeft = "";
        String weekDay = JOptionPane.showInputDialog("Ingrese el día de la semana (En ingles)");
        switch (weekDay.toUpperCase()){
            case "SUNDAY":
                    daysLeft = daysLeft + "SUNDAY ";
            case "MONDAY":
                daysLeft = daysLeft + "MONDAY ";
            case "THUESDAY":
                daysLeft = daysLeft + "Thuesday ";
            case "WEDNESDAY":
                daysLeft = daysLeft + "WEDNESDAY ";
            case "THURSDAY":
                daysLeft = daysLeft + "THURSDAY ";
            case "FRIDAY":
                daysLeft = daysLeft + "FRIDAY ";
            case "SATURDAY":
                daysLeft = daysLeft + "SATURDAY ";
        }
        JOptionPane.showMessageDialog(null, "Quedan \"" + daysLeft + "\" para terminar la semana");
    }
    
}
