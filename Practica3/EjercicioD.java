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

public class EjercicioD {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        int calificacion;
        
        System.out.println("Ingrese la nota del estudiante");
        calificacion= sc.nextInt();
        
        
        
         if (calificacion<=100 && calificacion>85){
            System.out.println("La calificacion del examen es una A ");
        }
        
         else if (calificacion<=85 && calificacion>69){
            System.out.println("La calificaico del examen es una B");
        }
         
        else if (calificacion>=0 &&  calificacion<100) {
            System.out.println("La calificacion del examen es una C");
        }
        
        else{
            System.out.println("El dijito no es correcto");
        }
        
        
    }
    
}
