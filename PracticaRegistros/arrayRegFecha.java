/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

/**
 *
 * @author Josue
 */
//Registro de fecha
public class arrayRegFecha {
    //atributos (dia,mes,año)
    int dia;
    String mes;
    int año;
    
    public static void main(String[] args) {
        //crear arreglo del registro
        arrayRegFecha arrayFecha[]=new arrayRegFecha[3];
        
        //inicializar el elemto 0 del arreglo
        arrayFecha[0]=new arrayRegFecha();
        
        //llenar los compos del elemento 0 del arreglo
        arrayFecha[0].dia=5;
        arrayFecha[0].mes="Agosto";
        arrayFecha[0].año=2022;
        
        //inicializar el elemento 1 del arreglo
        arrayFecha[1]=new arrayRegFecha();
        
        //llenar los campos del elemento 1
        arrayFecha[1].dia=16;
        arrayFecha[1].mes="Enero";
        arrayFecha[1].año=2022;
        
        //inicializar el elemento 2 del arreglo
        arrayFecha[2]=new arrayRegFecha();
        
        //llenar los campos del elemento 2
        arrayFecha[2].dia=21;
        arrayFecha[2].mes="Octubre";
        arrayFecha[2].año=2023;
        
        System.out.println(arrayFecha[0].dia+"/"+arrayFecha[0].mes+"/"+arrayFecha[0].año);
        System.out.println(arrayFecha[1].dia+"/"+arrayFecha[1].mes+"/"+arrayFecha[1].año);
        System.out.println(arrayFecha[2].dia+"/"+arrayFecha[2].mes+"/"+arrayFecha[2].año);
        

    }
    
    
}