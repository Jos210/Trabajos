/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flujos;

/**
 *
 * @author Josue
 */
public class ArrayC {
    public static void main(String[] args) {
        
        int numeros []= new int [20];
        
        int suma=0;
        
        double promedio;
        
        for(int i=0;i<numeros.length;i++){
            numeros[i]= i+1;;
        }
        
        
        for(int i=0;i<numeros.length;i++){
            suma=+numeros[i];
        }
        
        promedio = suma/numeros.length;
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.print(numeros[i] + " ");
            
        }
        
        System.out.println("\nSuma de los números: " + suma);
        System.out.println("Promedio de los números: " + promedio);
    }
    
    
}
    

