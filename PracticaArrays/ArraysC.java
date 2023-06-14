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
public class ArraysC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Indique el numero de columnas que desea");
        int c= sc.nextInt();
        
        int num [][] = new int[5][c];
        
        for(int i=0;i<5;i++){
            for(int j=0;j<c;j++){
            num[i][j]=(int)(Math.random()*10); 
            }
            
        }
        
            for(int i=0;i<5;i++){
            System.out.println("  \n");
            for(int j=0;j<c;j++){
                System.out.print(num[i][j]+"     ");
            }
        }
    }
}