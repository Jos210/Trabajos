/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoEstructuras;

/**
 *
 * @author Josue
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);//instanciamiento de la clase scanner
        
        int clave;
        int intentoclave;
        
        System.out.println("Asigne una contraseña(entre 0 y 999)");
        clave = sc.nextInt();
        
        if(clave<0 && clave>999){
            System.out.println("usted asigno caracteres no validos");
        }
        else{
            System.out.println("Su contraseña ha sido asignada");
        }     
        
        System.out.println("Ingrese su contraseña");
        intentoclave = sc.nextInt();
        
        for(int intento=2;intento>=0;intento--){

            if(intentoclave==clave){
                System.out.println("Su contraseña es correcta");
            }
            
            else{
                
            if (intentoclave!=clave){
                System.out.println("Su contraseña es incorrecta, le quedan " + intento+" intentos ");
                 System.out.println("Ingrese su contraseña");
                 intentoclave = sc.nextInt();
            } 
            else{
                 System.out.println("Ha Excedido el numero de intentos permitidos"); 
            }          
            }
         }
     }
}
