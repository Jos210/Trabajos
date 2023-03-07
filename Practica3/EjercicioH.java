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

public class EjercicioH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int edad;
        
        System.out.println("Ingrese la edad de la persona ");
        edad = sc.nextInt();
        
        if(edad>=0 && edad<=3){
            System.out.println("La persona es un bebe");
        }
        
        else if (edad>=4 && edad<=11){
            System.out.println("La persona es un niño");
        }
        
        else if(edad>=12 && edad<=17){
            System.out.println("La persona es un adolescente");
        }
        
        else if (edad>=18 && edad<=29){
            System.out.println("La persona es un adulto joven");
        }
        
        else if(edad>=30 && edad<=64){
            System.out.println("La persona es un adulto");
        }
        
        else if (edad>=65){
            System.out.println("La persona es un adulto mayor");
        }
        
    
    }
    
}
