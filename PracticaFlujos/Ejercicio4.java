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

/**
 *
 * @author Josue
 */
public class Ejercicio4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BufferedReader lectura = new BufferedReader(new FileReader("personal.txt"));
        BufferedWriter escritura = new BufferedWriter(new FileWriter("personal copia.txt"));
        
        String linea;
        
        while((linea=lectura.readLine())!=null){
        
            escritura.write(linea);

            lectura.close();
            escritura.close();
    }
    
    }
    
}
