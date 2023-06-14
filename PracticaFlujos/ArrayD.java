/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flujos;

import java.util.Arrays;

/**
 *
 * @author Josue
 */
public class ArrayD {
    public static void main(String[] args) {
        
        int numeros []= new int [40];
        
        int suma = 0;
        double promedio;
        
        //llenar el arreglo con numeros aleatorios y sacar el promedio y suma 
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*100); 
            suma=+numeros[i];
        }
        
        promedio=suma/numeros.length;
       

        //muestra del arreglo completo 
        
        System.out.print("Arreglo completo: \n");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        
        }
        
        //ordenar y mostrar de forma ascendente 
        
        Arrays.sort(numeros);
        
        System.out.println("\nArreglo ordenado de forma ascendente: ");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }
        
        
        //ordenar y mostrar de forma descendente
        System.out.println("\nArreglo ordenado de forma descendente: ");
        for(int i = numeros.length-1;i>0;i--){
            
            System.out.println(numeros[i] + " ");
        }
    
    }
}  