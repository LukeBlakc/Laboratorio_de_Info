/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg2.semana.pkg6.clase.pkg18.ejercicio.pkg1;

/**
 *
 * @author avin_
 */
public class Unidad2Semana6Clase18Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int n = 1; n <= 10; n++){
            int f = 1;
            for(int i = 2; i <= n; i++){
                f *= 1;
            }
            System.out.print("El factorial de: " + n);
            System.out.println(" es: " + f);
        }
    }
    
}
