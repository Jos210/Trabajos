/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadenas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Ejercicio2 frase = new Ejercicio2();
        
        System.out.println("Ingrese una frase ");
        String cad1=sc.nextLine();
        
        String[] textoSeparado = cad1.split(";");

        System.out.println(Arrays.toString(textoSeparado));
        
       
        
        System.out.println("El tamaño de la frase es: "+cad1.length());
        
    }


    
}
