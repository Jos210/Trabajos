/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ejercicio5 {
    
    String nombre;
    char inicial;
    int edad;
    String genero;
    double estatura;
    double peso;
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Ejercicio5 datos=new Ejercicio5();
        
        Ejercicio5 arrayDatos[]=new Ejercicio5[20];
        
         for(int i=0;i<arrayDatos.length;i++){
             
        //inicializar el elemto 0 del arreglo
        arrayDatos[i]=new Ejercicio5();
        
        System.out.println("Ingrese el nombre de la persona");
        arrayDatos[i].nombre=sc.nextLine();
        
        System.out.println("Ingrese la edad de la persona");
        arrayDatos[i].edad=sc.nextInt();
        
        System.out.println("Ingrese el genero de la persona");
        arrayDatos[i].genero=sc.next();
        
        System.out.println("Ingrese la estatura de la persona");
        arrayDatos[i].estatura=sc.nextDouble();
        
         System.out.println("Ingrese el peso de la persona");
        arrayDatos[i].peso=sc.nextDouble();
        sc.nextLine();
        
        System.out.println("\nNombre: "+arrayDatos[i].nombre+
                "\nInicial: "+arrayDatos[i].nombre.charAt(0)+
                "\nEdad: "+arrayDatos[i].edad+
                "\nGenero: "+arrayDatos[i].genero+
                "\nEstatura: "+arrayDatos[i].estatura+
                "\nPeso: "+arrayDatos[i].peso);
        
        
        }
    }
}