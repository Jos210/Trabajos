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

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valormin, valormax, num, sum=0, fuera=0;
        
        
        System.out.println("Escriba el valor minimo del intervalo");
        valormin = sc.nextInt();
        
        System.out.println("Escriba el valor maximo del intervalo");
        valormax = sc.nextInt();
        
        while(valormin>valormax){
            
        System.out.println("Escriba el valor minimo del intervalo");
        valormin = sc.nextInt();
        
        System.out.println("Escriba el valor maximo del intervalo");
        valormax = sc.nextInt();
        
            
        }
        
        do{
            System.out.println("digite un numero(para finalizar el programa digite 0)");
        num = sc.nextInt();
        
        
        if(num<valormax && num>valormin){
            
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
