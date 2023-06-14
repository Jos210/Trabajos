
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
public class ArraysD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num [][] = new int[3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
              
                System.out.println("Ingrese el numero que desea en la fila "+i+" columna "+j);
                int numintro = sc.nextInt();
                
                num[i][j]=numintro;
            }
            
        }
     
         for(int i=0;i<3;i++){
            System.out.println("");
            System.out.println("");
            for(int j=0;j<3;j++){
                
                System.out.print(num[i][j]);
                
                if(i!=num[j].length)System.out.print("\t");
                
            }
        
          }

    }
    
}