/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maquina_contadora;

import java.util.Scanner;

/**
 *
 * @author DMG
 */
public class Maquina_Contadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int option = 0,n = 0,r = 0;
        Permutacion p;
        Combinacion c;
        System.out.println("///////////////La Máquina Contadora\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        while (option == 0) {
            n= 0;
            r = 0;
            System.out.println("Por favor seleccione alguna de las siguientes opciones para realizar los cálculos correspondientes:\n"
                    + "1. Permutación de tamaño \"r\" para \"n\" objetos distintos\n"
                    + "2. Combinación de tamaño \"r\" para \"n\" objetos distintos\n");
            while (option == 0) {
                option = reader.nextInt();
                option = option < 1 || option > 2 ? 0 : option;
                if(option == 0){
                    System.out.println("Por favor seleccione 1 o 2 de acuerdo a la operación que desee realizar");
                }
            }
            System.out.println("Por favor ingrese el valor de \"n\"");
            while (n == 0) {
                n = reader.nextInt();
                n = n < 1? 0 : n;
                if(n == 0){
                    System.out.println("El valor de \"n\" debe ser mayor o igual a 1. Ingrese su valor nuevamente.");
                }
            }
            System.out.println("Por favor ingrese el valor de \"r\"");
            while (r == 0) {
                r = reader.nextInt();
                r = r < 1 || r > n? 0 : r;
                if(r == 0){
                    System.out.println("El valor de \"r\" debe encontrarse entre 1 y \"n\". Ingrese su valor nuevamente.");
                }
            }
            if(option == 1){
                p = new Permutacion(n,r);
                System.out.println("P(" + n + "," + r + ") = " + p.permutacion());                
            } else {
                c = new Combinacion(n,r);
                System.out.println("C(" + n + "," + r + ") = " + c.combinacion()); 
            }
            option = 3;
            System.out.println("Por favor seleccione 1 si desea realizar otra cuenta o 2 si desea salir");   
            while (option == 3) {
                option = reader.nextInt();
                if(option < 1 || option > 2){
                    option = 3;
                } else if (option == 2){
                    System.out.println("Gracias por utilizar \"La Máquina Calculadora\"");
                } else if (option == 1){
                    option = 0;
                }
                if (option == 3){
                    System.out.println("Seleccion incorrecta. Por favor ingrese 1 si desea realizar otra cuenta o 2 si desea salir");
                }
            }
            
        }
        
    }
    
}
