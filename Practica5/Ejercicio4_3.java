/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eJemplosFuncMetodProd;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ejercicio4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio4_3 fP = new Ejercicio4_3();
        
        fP.tabla();
        
    }
    
    void tabla(){
        
         int tabla;
       int multiplo;
       int resultado;

	for (tabla=1; tabla<=6; tabla++){
            
        System.out.println ("\n\nTabla del " +tabla);
        
	for (multiplo=1;multiplo<=10;multiplo++){
            
            resultado=tabla*multiplo;
	    System.out.println (tabla + " x " + multiplo + " = " +resultado);
        
             }
         }
    }
    
}
