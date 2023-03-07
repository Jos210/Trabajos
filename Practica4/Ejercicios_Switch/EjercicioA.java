/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Switch;

/**
 *
 * @author Josue
 */

import java.util.Scanner;

public class EjercicioA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1;
        int num2;
        int option;
        int total;
        
        System.out.println("Introduzca el primer numero");
        num1 = sc.nextInt();
        
        System.out.println("Introduzca el segundo numero");
        num2 = sc.nextInt();
        
        System.out.println("Introduzca el numero de la oprecion que desea realizar \n 1. Suma"
                + " 2. Resta"
                + " 3. Multiplicación"
                + " 4. División"
                + " 5. Promedio");
        option = sc.nextInt();
        
        switch(option){
            
            case 1:
                total=num1+num2;
                System.out.println("La suma de los numeros es "+total);
            break;
            
            case 2:
                total=num1-num2;
                System.out.println("La resta de los numeros es "+total);
            break;
            
            case 3:
                total=num1*num2;
                System.out.println("La multiplicacion de los numeros es "+total);
            break;
            
            case 4:
                total=num1/num2;
                System.out.println("La division de los numeros es "+total);
            break;
            
            case 5:
                int sum=num1+num2;
                total=sum/2;
                System.out.println("El promedio es "+total);
        }
    }
    
}
