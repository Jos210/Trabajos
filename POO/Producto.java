/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapoo;

/**
 *
 * @author Josue
 */
public class Producto {
    private String cod_Producto;
    private String descripcion;
    private double precioCosto;
    private double precioVenta;
    
    public Producto (String cod_Producto, String descripcion, double  precioCosto, double precioVenta){
        this.cod_Producto = cod_Producto;
        this.descripcion = descripcion;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }
    
    public String getCod_Producto(){
        return cod_Producto;
    }
    
    public void setCod_Producto(String cod_Producto){
        this.cod_Producto = cod_Producto;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public double getPrecioCosto(){
        return precioCosto;
    }
    
    public void setPrecioCosto(double precioCosto){
        this.precioCosto = precioCosto;
    }
    
    public double getPrecioVenta(){
        return precioVenta;
    }
    
    public void setPrecioVenta(double precioVenta){
        this.precioVenta = precioVenta;
    }
}
