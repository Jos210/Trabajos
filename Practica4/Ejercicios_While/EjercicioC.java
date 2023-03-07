/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_While;

/**
 *
 * @author Josue
 */

import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int num,suma = 0, numintro=1;
        double porcen;
        
         System.out.println("escriba un numero");
        num = sc.nextInt();
        
        suma=num;
        
        while(num!=0){

        System.out.println("escriba un numero");
        num = sc.nextInt();
        
        suma+=num;
        
         numintro++;
        
        }
        
        porcen = suma/numintro;
        
        System.out.println("La suma de todos los numeros es "+suma);
        System.out.println("El total de numero introducidos es "+numintro);
        System.out.println("El promedio de los numeros introducidos es de "+porcen);
        
    }
    
}
