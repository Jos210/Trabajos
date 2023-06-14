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
public class ArrayA {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        
        String Productos[]=new String [9];
        
        Productos[0]="Manzana";
        Productos[1]="Mango";
        Productos[2]="Pera";
        Productos[3]="Durazno";
        Productos[4]="Fresa";
        Productos[5]="Sandia";
        Productos[6]="Papaya";
        Productos[7]="Yuplon";
        Productos[8]="Naranja";
        
        for(int i=0;i<Productos.length;i++){
            System.out.println(Productos[i]);
        }
        
    }
    /*
    - ¿Qué dimensión tiene su arreglo? 
    
    es unidimensional
    
    - ¿Cuál es el índice máximo que va tener el arreglo? 
    
    8
    
    - ¿Qué tipo de datos almacena el arreglo? 
    
    String 
    
   - ¿Qué tipo de arreglo se utilizó? 
    
    un arreglo unidimensaional

    */
}
