/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

/**
 *
 * @author Josue
 */
public class regFecha {
    
    int dia;
    String mes;
    int año;
    
    public static void main(String[] args) {
        //instancia o creacion de un objeto
        regFecha fecha = new regFecha();
        
        //almacenar datos
        fecha.dia=18;
        fecha.mes="mayo";
        fecha.año=2023;
        
        //nueva instancia de regFecha 
        regFecha fecha1=new regFecha();
        
        //alamcenar datos
        fecha1.dia=12;
        fecha1.mes="Julio";
        fecha1.año=2023;
        
        //impresion de datos de un registro
        System.out.println(fecha.dia+"/"+fecha.mes+"/"+fecha.año);
        
        System.out.println(fecha1.dia+"/"+fecha1.mes+"/"+fecha1.año);
    }
}