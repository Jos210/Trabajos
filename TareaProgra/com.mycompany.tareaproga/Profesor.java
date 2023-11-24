/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaproga;

/**
 *
 * @author Josue
 */
public class Profesor extends Persona{
    
    private String departamento;
    private String categoria;
    
    
    public Profesor (String nombre, String direccion, String departamento, String categoria){
        super(nombre, direccion);
        this.departamento=departamento;
        this.categoria=categoria;
    }
    
    
     public String getDepartamento(){
        return departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
     public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria=categoria;
        
    }
    
}
