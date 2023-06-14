/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flujos;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class ArrayB {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese de que tamaño desea hacer el arreglo");
        int n = sc.nextInt();
        
        float numeros[] = new float [n];
        
        for(int i=0;i<numeros.length;i++){
            System.out.println("Digite un numero");
            float num = sc.nextFloat(); 
            

             if(par(num)){
                 
                 numeros[i]=num;
            
             }            
        }
        
        System.out.println("Los numeros pares son");
        for (double numero : numeros) {
            
        if (numero != 0) {
        System.out.println(numero);
        
      }
        
    }  
        
        System.out.println("El contenido del arreglo es:");
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println(numeros[i]);
        }
        
 }
    
    
    public static boolean par(float numero){
        
        return numero % 2==0; 
    }
    
    /*
    
    - ¿Qué dimensión tiene su arreglo? 
    
    una sola dimension 
    
    - ¿Cuál es el índice máximo que va tener el arreglo? 
    
    depende de lo que ingrese el usuario
    
    - ¿Qué tipo de datos almacena el arreglo? 
    
    de coma flotante
    
    - ¿Qué tipo de arreglo se utilizó? 
    
    arreglo unidimensional
    
    */
}
