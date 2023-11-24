/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapoo;

/**
 *
 * @author Josue
 */
public class Vehiculos {
    
    private String marca;
    private String modelo ;
    private String estilo;
    private int capacidad;
    private double precio;
    
    public Vehiculos (String marca,String modelo,String estilo, int capacidad,double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.estilo = estilo;
        this.capacidad = capacidad;
        this.precio = precio;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setTamano(String modelo){
        this.modelo = modelo;
    }
    
    public String getEstilo(){
        return estilo;
    }
    
    public void setEdad(String Estilo){
        this.estilo = estilo;
    }
    
    public int getCapacidad(){
        return capacidad;
    }
    
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setVacunas(String vacunas){
        this.precio = precio;
    }
    
}
