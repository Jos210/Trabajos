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
public class Ejercicio4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio4_5 fP = new Ejercicio4_5();
        
         System.out.println("Asigne una contraseña(entre 0 y 999)");
         int c = sc.nextInt();
        
        fP.inicioSe(c);
        
        System.out.println("Ingrese su contraseña");
        int in = sc.nextInt();
        
        fP.intento(c, in); 
        
    }
    
  void inicioSe(int clave){
      if(clave<0 && clave>999){
            System.out.println("usted asigno caracteres no validos");
        }
        else{
            System.out.println("Su contraseña ha sido asignada");
        }     
  }
  
  void intento(int clave, int intentoclave){
      Scanner sc = new Scanner(System.in);
      
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