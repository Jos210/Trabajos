/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flujos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class FlujoCaracteres {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        BufferedReader lectura = new BufferedReader(new FileReader("ejemplo.txt"));
        BufferedWriter escritura = new BufferedWriter(new FileWriter("copia ej.txt"));
        PrintWriter escritura2= new PrintWriter(new FileWriter("copiaEje2.txt"));
        
        String linea;
       
        while((linea=lectura.readLine())!=null){
            //usando bufferedReader escribir
            escritura.write(linea);
            
            //usando PrintWriter escribir
            escritura2.println(linea);
            
            //usando consola escribir
            System.out.println(linea.toUpperCase());
            
            lectura.close();
            escritura.close();
            escritura2.close();
            
        }
    }
}