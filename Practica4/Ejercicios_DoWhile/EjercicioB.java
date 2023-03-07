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

public class EjercicioB {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int num1, num2;
        
        do{
            
             System.out.println("Ingrese el primero numero");
             num1 = sc.nextInt();
            
            System.out.println("Ingrese el segundo numero");
            num2 = sc.nextInt();
            
        }while(num1!=num2);
    }
    
}
