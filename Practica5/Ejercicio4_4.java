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
public class Ejercicio4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Ejercicio4_4 fP = new Ejercicio4_4();
        
        System.out.println("Ingrese el primer numero");
        int n1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int n2 = sc.nextInt();
        
        fP.amigos(n1, n2);
        
    }
    
    void amigos(int num1, int num2){
        int sum = num1+num2;
        
        if(num1>0 && num2>0 && (sum%3)==0 ) {
            
            System.out.println("Los numeros que ingreso son amigos");
        }
        
        else{
            System.out.println("Los numeros que ingreso no son amigos");
        }
    }
    
}
