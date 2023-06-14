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
public class Practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //respuesta 1
        String cad1 = " Al mal paso darle Prisa";
        
        //respuesta 2
        System.out.println("Ingrese lo que desea almacenar en la cadena");
        String cad2= sc.nextLine();
        
        //respuesta 3 
        System.out.println("El tamaño de la cadena 1 es \n"+cad1.length());
        System.out.println("El tamaño de la cadena 2 es \n"+cad2.length());
        
        //respuesta 4
        System.out.println("La cadena 1 en mayuscula es \n"+cad1.toUpperCase());
        
        //respuesta 5
        System.out.println("La cadena 2 en minuscula es \n"+cad2.toLowerCase());
        
        //respuesta 6 
        System.out.println("Ingrese el numero del caracter que desea devolver\n");
        int num = sc.nextInt();
        System.out.println("El caracter que desea devolver de la cadena uno es \n"+cad1.charAt(num));
        System.out.println("El caracter que desea devolver de la cadena uno es \n"+cad2.charAt(num));
        
        //respuesta 7 
        String cad3=cad1.concat(cad2);
        System.out.println("Las 2 cadenas concatenadas son \n"+cad3);
        
        //respuesta 8
        System.out.println("La porcion del texto de la cadena es \n"+cad1.substring(4, 9));
        
        //respuesta 9
        System.out.println("EL numero de posicion en la cual se encuentra la palabra paso es \n"+cad1.indexOf("paso"));
        
        //respuesta 10
        if(cad2.endsWith("amor")){
            System.out.println("La cadena si finaliza con amor");
        }
        else{
            System.out.println("La cadena no finaliza con amor");
        }
        
        //respuesta 11
        System.out.println("La cadena uno remplazando las letras 'a' por letras 'u' queda de la siguiente manera: \n"+cad1.replace("a", "u"));
        
        //respuesta 12
        if(cad1.equalsIgnoreCase(cad2)){
            System.out.println("Las cadenas son iguales\n");
        }
        else{
            System.out.println("Las cadenas no son iguales\n");
        }
        
        //respuesta 13
        char arregloca2[]=cad2.toCharArray();
        for(char i:arregloca2){
            System.out.println(i);
        }
        
        //respuesta 14
         System.out.println("La cadena uno sin espacios queda de la siguiente manera: \n"+cad1.replace(" ", ""));
        
    }

}