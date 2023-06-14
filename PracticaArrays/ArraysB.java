/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

/**
 *
 * @author Josue
 */
public class ArraysB {
    public static void main(String[] args) {
        
        int [][] numeros = new int [4][4];
        
        int numero=1;
        
        //llenar la matriz
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
            numeros[i][j]=numero;
            numero++;
        }
            
        }
        
        
        //mostrar la matriz
        for(int i=0;i<4;i++){
            System.out.println("");
            System.out.println("");
            for(int j=0;j<4;j++){
                
                System.out.print(numeros[i][j]);
                
                if(i!=numeros[j].length)System.out.print("\t");
                
            }
            
        }   

    }
    
}
