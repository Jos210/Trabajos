/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapoo;

/**
 *
 * @author justin damito sanchez
 */
public class Barcos {
    private String color;
    private String tipoCarga;
    private double tamaño;
    private String identificacion;
    private int año_fabricacion;
    private double precio;
    
        public Barcos (String color,String tipoCarga, double tamaño,String identificacion,int año_fabricacion,double precio){
            this.color = color;
            this.tipoCarga = tipoCarga;
            this.tamaño = tamaño;
            this.identificacion = identificacion;
            this.año_fabricacion = año_fabricacion;
            this.precio = precio;
    }
public String getColor(){
        return color;
    }
    
public void setColor(String color){
        this.color = color;
    }

public String getTipoCarga(){
        return tipoCarga;
    }
    
public void setTipoCarga(String tipoCarga){
        this.tipoCarga = tipoCarga;
    }

public double getTamaño(){
        return tamaño;
    }
    
public void setTamaño(double tamaño){
        this.tamaño = tamaño;
    }

public String getIdentificacion(){
        return identificacion;
    }
    
public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }

public int getAño_fabricacion(){
        return año_fabricacion;
    }
    
public void setAño_fabricacion(int año_fabricacion){
        this.año_fabricacion = año_fabricacion;
    }

public double getPrecio(){
        return precio;
    }
    
public void setPrecio(int precio){
        this.precio = precio;
    }

public double precioPlus(int year, double precioY){
    double precioX;
    
    switch(year){
        case 2010:
            precioX = precioY + 2000;
            return precioX;
            
        case 2015:
            precioX = precioY + 30000;
            return precioX;
            
        case 2020:
            precioX = precioY + 45000;
            return precioX;
            
        default:
            System.out.println("valor invalido");
    }
    return precioY;
}

public double descuento(double precioY){
    return precioY * 0.88;     
}


}

