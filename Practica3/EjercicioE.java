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

public class EjercicioE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int estu;
        
        System.out.println("Ingrese la cantidad de estudiantes");
        estu = sc.nextInt();
        
        double prec20=2500*0.20;
        
        double precomp=2500+prec20;
        
        double prediv=550000/29;
        
        if(estu>120){
            System.out.println("El costo por estudiante es de 2500 colones");
        }
        
        else if (estu>60 && estu<=120){
            System.out.println("El costo por estudiante es de 2800 colones");
        }
        
        else if(estu>30 && estu<=59){
            System.out.println("El precio por estudiante es de"+precomp); 
        }
        
        else if(estu<30 && estu>0){
            System.out.println("El precio por estudiante es de "+prediv);
        }
        else{
            System.out.println("El numero que indico no es correcto ");
        }
    }
    
}
