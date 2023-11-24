/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P2;

/**
 *
 * @author Josue
 */
public class Paciente extends Persona{
    
    private String fechaConsulta;
    private String medicoTratante;
    private Persona persona;
    
    public Paciente (String nombre, int edad, char genero, double peso, double altura, String fechaConsulta, String medicoTratante){
        super(nombre, edad, genero, peso, altura);
        this.fechaConsulta=fechaConsulta;
        this.medicoTratante=medicoTratante;
    }
    
    
     public String getFechaConsulta(){
        return fechaConsulta;
    }
    
    public void setFechaConsulta(String fechaConsulta){
        this.fechaConsulta = fechaConsulta;
    }
    
    @Override
     public String getMedicoTratante(){
        return medicoTratante;
    }
    
    public void setMedicoTratante(String medicoTratante){
        this.medicoTratante=medicoTratante;
        
    }
    
 

    // Método para calcular el IMC
    public double IMC() {
        double altura = persona.getAltura() / 100; // Convertir altura a metros
        double peso = persona.getPeso();
        return peso / (altura * altura);
    }

    // Método para determinar si es mayor de edad
    public boolean MayorEdad() {
        return persona.getEdad() >= 18;
    }

    @Override
    public String toString() {
        return "Fecha de Consulta: " + fechaConsulta + "\n" +
               "Médico Tratante: " + persona.getMedicoTratante() + "\n" +
               "Paciente: " + persona.getNombre() + "\n" +
               "Edad: " + persona.getEdad() + " años\n" +
               "Género: " + persona.getGenero() + "\n" +
               "Peso: " + persona.getPeso() + " kg\n" ;

}
    
}
