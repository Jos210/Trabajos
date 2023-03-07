/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_For;

/**
 *
 * @author Josue
 */

import java.util.Scanner;

public class EjercicioB {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int nummax;
        int primernum;
        int num;
        
        
        System.out.println("Introduzca la cantidad de veces que desea poner un numero ");
        nummax =sc.nextInt();
        
         System.out.println("Introduzca el numero que desee");
         primernum = sc.nextInt();
        
        for(int numintro=1;numintro<=nummax;numintro++){
            
           System.out.println("Introduzca el numero que desee");
           num = sc.nextInt();
           
           if(num<primernum){ 
               System.out.println("El numero que digito es menor a el primer numero ingresado");
 
            }
           if(numintro==nummax){
                   
               int numsum=+num;
               int sumavalo=primernum+numsum;
               double arit=sumavalo/nummax;   
               System.out.println("La medida aritmetica es "+arit);
               
               }
          
        }
          
        
        
        
        
    }
    
}
