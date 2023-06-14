/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

/**
 *
 * @author Josue
 */
public class Ejercicio1 {
    
    String tipo;
    String marca;
    String modelo;
    double cilindraje;
    int capacidad;
    
    
    public static void main(String[] args) {
        Ejercicio1 vehiculo= new Ejercicio1();
        
        vehiculo.tipo="Automóvil";
        vehiculo.marca="Toyota";
        vehiculo.modelo=" Camry";
        vehiculo.cilindraje=2500;
        vehiculo.capacidad=5;
        
        Ejercicio1 vehiculo1= new Ejercicio1();
        
        vehiculo1.tipo="SUV";
        vehiculo1.marca="Ford";
        vehiculo1.modelo=" Explorer";
        vehiculo1.cilindraje=3500;
        vehiculo1.capacidad=7;
        
        Ejercicio1 vehiculo2= new Ejercicio1();
        
        vehiculo2.tipo="Moto";
        vehiculo2.marca="Honda";
        vehiculo2.modelo="CBR600RR";
        vehiculo2.cilindraje=599;
        vehiculo2.capacidad=2;
        
        Ejercicio1 vehiculo3= new Ejercicio1();
        
        vehiculo3.tipo="Camion";
        vehiculo3.marca="volvo";
        vehiculo3.modelo="FH16";
        vehiculo3.cilindraje=13000;
        vehiculo3.capacidad=3;
        
        System.out.println("\ntipo: "+vehiculo.tipo+
                "\nmarca: "+vehiculo.marca+
                "\nmodelo: "+vehiculo.modelo+
                "\ncilindraje: "+vehiculo.cilindraje+
                "\ncapacidad: "+vehiculo.capacidad);
        
        System.out.println("\ntipo: "+vehiculo1.tipo+
                "\nmarca: "+vehiculo1.marca+
                "\nmodelo: "+vehiculo1.modelo+
                "\ncilindraje: "+vehiculo1.cilindraje+
                "\ncapacidad: "+vehiculo1.capacidad);
        
        System.out.println("\ntipo: "+vehiculo2.tipo+
                "\nmarca: "+vehiculo2.marca+
                "\nmodelo: "+vehiculo2.modelo+
                "\ncilindraje: "+vehiculo2.cilindraje+
                "\ncapacidad: "+vehiculo2.capacidad);
        
        System.out.println("\ntipo: "+vehiculo3.tipo+
                "\nmarca: "+vehiculo3.marca+
                "\nmodelo: "+vehiculo3.modelo+
                "\ncilindraje: "+vehiculo3.cilindraje+
                "\ncapacidad: "+vehiculo3.capacidad);
        
       
    }
    
}
