/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_DoWhile;

/**
 *
 * @author Josue
 */

import java.util.Scanner;

public class EjercicioA {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num=1, suma = 1;
        
        //1 3 5 7 9 11
        
        do{
            
            num=num+2;
            
            suma=suma+num;
            
        }while(num<10);
        
        
        
         System.out.println("La suma de los numeros es "+suma);
        
    }
    
}
