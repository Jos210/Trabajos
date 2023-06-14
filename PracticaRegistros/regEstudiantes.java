/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

/**
 *
 * @author Josue
 */
public class regEstudiantes {
    
    String cedula;
    String nombre;
    int edad;
    boolean beca;
    double promedio;
    char estado;
    
    public static void main(String[] args) {
        regEstudiantes estudiante=new regEstudiantes();
        regEstudiantes estudiante1=new regEstudiantes();
        
        //llenado del objeto del registro
        estudiante.cedula="119790057";
        estudiante.nombre="Josue";
        estudiante.edad=16;
        estudiante.beca=false;
        estudiante.promedio=89.9;
        //A=Aprobado, R= Reprobado, S=Aplazado
        estudiante.estado='A';
                
        //imprimir objeto de registro
        System.out.println("Cedula: "+estudiante.cedula);
        System.out.println("Nombre: "+estudiante.nombre);   
        System.out.println("Edad: "+estudiante.edad);   
        System.out.println("Beca: "+estudiante.beca);   
        System.out.println("Promedio: "+estudiante.promedio);   
        System.out.println("Estado: "+estudiante.estado);   
        
        //llenado del objeto del registro
        estudiante1.cedula="119670469";
        estudiante1.nombre="Emanuel";
        estudiante1.edad=16;
        estudiante1.beca=false;
        estudiante1.promedio=60;
        //A=Aprobado, R= Reprobado, S=Aplazado
        estudiante1.estado='R';
                
        //imprimir objeto de registro
        System.out.println("\nCedula: "+estudiante1.cedula);
        System.out.println("Nombre: "+estudiante1.nombre);   
        System.out.println("Edad: "+estudiante1.edad);   
        System.out.println("Beca: "+estudiante1.beca);   
        System.out.println("Promedio: "+estudiante1.promedio);   
        System.out.println("Estado: "+estudiante1.estado);   
    }
    
}