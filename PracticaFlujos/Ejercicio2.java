/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flujos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Josue
 */

public class Ejercicio2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        int caracter;
        FileInputStream lectura;
       
        lectura=new FileInputStream("C:\\Users\\CTPG\\Documents\\Ejercicios\\Binario1.txt");
        
        caracter=lectura.read();
        
        while(caracter!=-1){
            System.out.print((char)caracter);
            caracter=lectura.read();
        }
        System.out.println(caracter);
        
        lectura.close();
    }
    
}
