/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadenas;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ejercicio1 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la primera cadena: ");
        String cad1 = sc.nextLine();

        System.out.println("Ingresa la segunda cadena: ");
        String cad2 = sc.nextLine();

         String cad3=cad1.concat(cad2);
        System.out.println("Cadena intercalada: " + cad3);
   
        StringBuilder result = new StringBuilder();
        String cadenaResto = new String();

       for(int i=0; i<cad1.length();i++){
            result.append(cad1.substring(i,i+1));
            result.append(cad2.substring(i,i+1));
        }
       
       result.append(cadenaResto);
       
       System.out.println("RESULTADO: CADENAS MEZCLADAS");
    System.out.println("----------------------------");
    System.out.println("El resultado de mezclar \""+cad1+"\" con \""+cad2+"\" es \""+result+"\"");
    }
}
