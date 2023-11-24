/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaproga;

/**
 *
 * @author Josue 
 */
public class Persona {
    private String nombre;
    private String direccion;
    
    public Persona(String nombre, String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
    }
    
    
     public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
     public String getDieccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
}
