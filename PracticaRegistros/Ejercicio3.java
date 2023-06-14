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
public class Ejercicio3 {
    
    String nombre;
    char inicial;
    int edad;
    String genero;
    double estatura;
    double peso;
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Ejercicio3 datos=new Ejercicio3();
        Ejercicio3 datos1=new Ejercicio3();
        
        
        System.out.println("Ingrese el nombre de la primera persona");
        datos.nombre=sc.nextLine();
        
        datos.inicial=datos.nombre.charAt(0);
        
        System.out.println("Ingrese la edad de la primera persona");
        datos.edad=sc.nextInt();
        
        System.out.println("Ingrese el genero de la primera persona");
        datos.genero=sc.next();
        
        System.out.println("Ingrese la estatura de la primera persona");
        datos.estatura=sc.nextDouble();
        
         System.out.println("Ingrese el peso de la primera persona");
        datos.peso=sc.nextDouble();
        
         
        
        System.out.println("Ingrese el nombre de la segunda persona");
        datos1.nombre=sc.next();
        
        datos1.inicial=datos1.nombre.charAt(0);
        
        System.out.println("Ingrese la edad de la segunda persona");
        datos1.edad=sc.nextInt();
        
        System.out.println("Ingrese el genero de la segunda persona");
        datos1.genero=sc.next();
        
        System.out.println("Ingrese la estatura de la segunda persona");
        datos1.estatura=sc.nextDouble();
        
         System.out.println("Ingrese el peso de la segunda persona");
        datos1.peso=sc.nextDouble();
        
        System.out.println("Nombre: "+datos.nombre+
                "\nInicial: "+datos.inicial+
                "\nEdad: "+datos.edad+
                "\nGenero: "+datos.genero+
                "\nEstatura: "+datos.estatura+
                "\nPeso: "+datos.peso);
        
        System.out.println("Nombre: "+datos1.nombre+
                "\nInicial: "+datos1.inicial+
                "\nEdad: "+datos1.edad+
                "\nGenero: "+datos1.genero+
                "\nEstatura: "+datos1.estatura+
                "\nPeso: "+datos1.peso);
    }
    
}
