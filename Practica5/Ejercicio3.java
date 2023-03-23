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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio3 fP = new Ejercicio3();
        
        fP.menu();
        
    }

    void menu(){
    Scanner sc = new Scanner(System.in);
    Ejercicio3 fP = new Ejercicio3();
    System.out.println("Ingrese el numero correspondiente a la oprecacion que desea\n"
                + "1. suma\n"
                + "2. Resta\n"
                + "3. Multiplicacion\n"
                + "4. Division");
                int option = sc.nextInt();
                
        
                
        System.out.println("Ingrese el primer numero");
        int n1= sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int n2= sc.nextInt();
        
        switch(option){
            
            case 1:
                System.out.println("El resultado de la suma es: "+fP.suma(n1, n2));
            break;
            
            case 2:
                System.out.println("El resultado de la resta es "+fP.resta(n1, n2));
            break;
            
            case 3:
                System.out.println("El resultado de la multiplicacion es "+fP.multi(n1, n2));
            break;
            
            case 4:
                System.out.println("El resultado de la division es "+fP.divi(n1,n2));
            break;
        }
                
    }
    
    double suma(int num1, int num2){
        int suma= num1+num2;
        return suma;
        
    }
    
    double resta(int num1, int num2){
        int resta=num1-num2;
        return resta;
    }
    
    double multi(int num1, int num2){
        int multi= num1*num2;
        return multi;
    }

    double divi(int num1, int num2){
        int divi=num1/num2;
        return divi;
    }    
}
    

