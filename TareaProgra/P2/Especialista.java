/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P2;

/**
 *
 * @author angel
 */
public class Especialista extends Persona {
    
    private String precioConsulta;
    private String especialidad;
    
    
    public Especialista (String nombre, int edad, char genero, double peso, double altura, String precioConsulta, String especialidad){
        super(nombre, edad, genero, peso, altura);
        this.precioConsulta=precioConsulta;
        this.especialidad=especialidad;
    }
    
    
     public String getPrecioConsulta(){
        return precioConsulta;
    }
    
    public void setPrecioConsulta(String precioConsulta){
        this.precioConsulta = precioConsulta;
    }
    
     public String getEspecialidad(){
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
        
    }
    
}
