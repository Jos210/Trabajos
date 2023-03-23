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
public class Ejercicio4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio4_6 fP = new Ejercicio4_6();
        
        System.out.println("Ingrese el pirmer numero");//pedir primer numero
        int n1 = sc.nextInt();//recoger primer numero
        
        System.out.println("Ingrese el segundo numero");//pedir segundo numero 
        int n2 = sc.nextInt();//recoger segundo
        
        fP.pares(n1, n2);
        
    }
    
    void pares(int num1, int num2){
        
        System.out.println("los numeros pares entre "+num1+" y "+num2+"son:");
        
        if(num1%2!=0){
            num1++;
        }
        
        for(int num=num1;num>=num1 && num<=num2;num=num+2){
            System.out.println(num);
  
        }
    }
    
}
