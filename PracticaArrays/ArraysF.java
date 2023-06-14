/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class ArraysF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        String [] [] tabla = new String [7] [2];

           
           for(int i=0;i<tabla.length;i++){
           System.out.println("Ingrese el confite numero "+(i+1)+":");
           tabla[i][0]=sc.nextLine();
           
           System.out.println("Ingrese el precio de "+tabla[i][0]);
           tabla[i][1]=sc.nextLine();
           }

            for(int i=0;i<7;i++){
            System.out.println("\t");
            System.out.println("\t");
            for(int j=0;j<2;j++){
                
                System.out.print(tabla[i][j]+"\t");
 
            }      
        }       
    }     
}