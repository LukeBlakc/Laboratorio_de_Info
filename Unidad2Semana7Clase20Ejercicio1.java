/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg2.semana.pkg7.clase.pkg20.ejercicio.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author avin_
 */
public class Unidad2Semana7Clase20Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menu = new String("Elige una opción: 1, 2, 3 o 4 \n");
        for(int i = 1; i <= 4; i++){
            menu = menu + " opción " + i + "\n";
        }
        String option = JOptionPane.showInputDialog(menu.toString());
        switch (option){
            case "1":
                JOptionPane.showMessageDialog(null, "Felicitaciones, ha elegido la opción 1");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Felicitaciones, ha elegido la opción 2");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Felicitaciones, ha elegido la opción 3");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Felicitaciones, ha elegido la opción 4");
                break;
            default:
                JOptionPane.showMessageDialog(null, option + " no es una opción válida");
                break;
        }
    }
    
}
