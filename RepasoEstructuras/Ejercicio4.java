/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoEstructuras;

/**
 *
 * @author Josue
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num1;
        int num2;
        int sum;
        
        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();
        
        sum = num1+num2;
        
        if(num1>0 && num2>0 && (sum%3)==0 ) {
            
            System.out.println("Los numeros que ingreso son amigos");
        }
        
        else{
            System.out.println("Los numeros que ingreso no son amigos");
        }
    } 
}
