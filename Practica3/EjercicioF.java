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

public class EjercicioF {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int dia;
        
        System.out.println("Ingrese el numero del dia que desea saber");
        dia = sc.nextInt();
        
        if(dia>0 && dia==1){
            System.out.println("El dia es lunes ");
        }
        
        else if(dia==2){
            System.out.println("El dia es Martes");
        }
        
        else if(dia==3){
            System.out.println("El dia es Miercoles");
        }
        
        else if(dia==4){
            System.out.println("El dia es Jueves");
        }
        
        else if(dia==5){
            System.out.println("El dia es Viernes");
        }
        
        else if(dia==6){
            System.out.println("El dia es Sabado");
        }
        else if(dia==7 && dia<8){
            System.out.println("El dia es Domingo");
        }
        else{
            System.out.println("El numero no es valido");
        }
        
    }
    
}
