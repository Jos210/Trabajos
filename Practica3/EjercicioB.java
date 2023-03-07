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

public class EJercicioB {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num ;
        
        System.out.println("Ingrese el numero ");
        num = sc.nextInt();
        
        double resi=num%2;
        
        if (resi==0){
            System.out.println("El numero que ingreso es un numero par ");
        }
        else{
            System.out.println("El numero que ingreso es el numero impar");
        }
        
    }
    
}
