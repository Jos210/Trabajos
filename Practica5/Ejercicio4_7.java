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
public class Ejercicio4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Ejercicio4_7 fP = new Ejercicio4_7();
        
        System.out.println("Escriba el valor minimo del intervalo");
        int valormin = sc.nextInt();
        
        System.out.println("Escriba el valor maximo del intervalo");
        int valormax = sc.nextInt();
        
        while(valormin>valormax){
            
        System.out.println("Escriba el valor minimo del intervalo");
        valormin = sc.nextInt();
        
        System.out.println("Escriba el valor maximo del intervalo");
        valormax = sc.nextInt();
        
        fP.numeros(valormax, valormin); 

    }
    }
    
    void numeros(int max, int min){
        Scanner sc = new Scanner(System.in);
        int num;
        int sum=0;
        int fuera=0;
        
        do{
        System.out.println("digite un numero(para finalizar el programa digite 0)");
        num = sc.nextInt();
        
        
        if(num<max && num>min){
            
           
           sum+=num;
            
        }
        else{
            
             fuera++;
        }

        }while(num!=0);
        
        System.out.println("La suma de todos los numeros dentro del intervalo es "+sum);
        System.out.println("Los numeros digitados fuera del intervalo fueron "+fuera);
    }
}
