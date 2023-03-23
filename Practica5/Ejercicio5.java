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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Ejercicio5 fP = new Ejercicio5();
        
        String user;
        System.out.println("Ingrese su nombre de usuario ");
        user = sc.next();

        fP.nombre(user);
        
        float num1,num2,num3;
        
        System.out.println("Ingrese un numero");
        num1 = sc.nextFloat();
        
        System.out.println("Ingrese otro numero");
        num2 = sc.nextFloat();
        
        System.out.println("Ingrese otro numero");
        num3 = sc.nextFloat();
        
        System.out.println("El promedio de los numeros ingresados es "+promedio(num1,num2,num3));
        System.out.println("La sumatoria de los numeros al cuadrado es "+cuadrado(num1,num2,num3));
        
    }
    
    void nombre(String us){

        System.out.println("Bienvenido al programa "+us+" disfrutelo ");

    }
    
    public static float promedio(float n1,float n2,float n3){
        
        float sum=n1+n2+n3;
        float prom=sum/3;
        
        return prom;
    }
    
    public static float cuadrado(float n1,float n2,float n3){
    
        float sum=n1+n2+n3;
        float cua=(float) Math.pow(sum,2);
        
        return cua;
    }
    
}