/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg1.semana.pkg6.clase.pkg17.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author avin_
 */
public class Unidad1Semana6Clase17Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre,clave;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese nombre de usuario: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese clave de usuario: ");
        clave = entrada.nextLine();
        if(nombre.equals("juan") && clave.equals("123456")){
            System.out.println("Bienvenido al Sistema");
    }
        else{
            System.out.println("Nombre de Usuario o Contraseña Incorrectos");
        }
    }
    
}
