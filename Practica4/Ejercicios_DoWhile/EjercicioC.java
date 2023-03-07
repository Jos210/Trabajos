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

public class EjercicioC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numrepe = 0;
        int num;
        double produc = 1;
        int sumanum;
        
        do{
            System.out.println("Ingrese un numero");
            num = sc.nextInt();
            
            numrepe++;
            
            produc*=num;

        }while(numrepe<5);

                System.out.println("El producto de los 5 numeros es "+produc);
                
    }
    
}
