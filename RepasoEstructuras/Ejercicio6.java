/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoEstructuras;

/**
 *
 * @author Josue
 */

import java.util.Scanner;//llamado de la clase scanner 

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//intanciamiento de la clase escanner 
        
        
        //declaracion de varibles
        
        int num1,num2;
        
        System.out.println("Ingrese el pirmer numero");//pedir primer numero
        num1 = sc.nextInt();//recoger primer numero
        
        System.out.println("Ingrese el segundo numero");//pedir segundo numero 
        num2 = sc.nextInt();//recoger segundo
        
        System.out.println("los numeros pares entre "+num1+" y "+num2+"son:");
        
        if(num1%2!=0){
            num1++;
        }
        
        for(int num=num1;num>=num1 && num<=num2;num=num+2){
            System.out.println(num);
  
        }
        
    }
    
}
