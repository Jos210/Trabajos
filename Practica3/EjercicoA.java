/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estruct_Seleccion;

/**
 *
 * @author Josue
 */

import java.util.Scanner;

public class EjercicioA {
    public static void main(String[] args) {
     
        Scanner sc= new Scanner (System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingrese el primer número" );
        num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo número");
        num2 = sc.nextInt();
        
        if (num1>num2 ){
            System.out.println("El numero 1 es mayor al numero 2");
        
        }
        else if (num1==num2) {
             System.out.println("Los numeros son iguales");
                    
                    }
        else {
             System.out.println("El numero 2 es mayor al numero 1");
         }
        
        
        int sum=num1+num2;
        
        System.out.println("La suma de los dos numeros es de "+sum);
    }
    
}
