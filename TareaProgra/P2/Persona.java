/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P2;

/**
 *
 * @author Josue
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private char genero;
    private double altura,peso;
   

    
    public Persona(String nombre, int edad, char genero, double peso, double altura) {
       this.nombre = nombre;
       this.edad = edad;
       this.genero = genero;
       this.altura = altura;
       this.peso = peso;
       
    }


    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }
    
    public void setGenero(char genero){
        this.genero = genero;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }

    String getMedicoTratante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
