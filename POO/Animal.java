/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapoo;

/**
 *
 * @author Josue
 */
public class Animal {
    private String nombre;
    private double tamano ;
    private int edad;
    private double peso;
    private String vacunas;
    
    public Animal (String nombre, double tamano, int  edad, double peso,String vacunas){
        this.nombre = nombre;
        this.tamano = tamano;
        this.edad = edad;
        this.peso = peso;
        this.vacunas = vacunas;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getTamano(){
        return tamano;
    }
    
    public void setTamano(double tamano){
        this.tamano = tamano;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(double Edad){
        this.edad = edad;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public String getVacunas(){
        return vacunas;
    }
    
    public void setVacunas(String vacunas){
        this.vacunas = vacunas;
    }
    
}
