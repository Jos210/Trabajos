/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flujos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ejercicio3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        Ejercicio3 fP = new Ejercicio3();
        
        
        String linea, ruta, texto;
        
        fP.rutamet();
        
        System.out.println("Ingrese el contenido del fichero");
        texto = sc.nextLine();
        
        BufferedReader lectura = new BufferedReader(new StringReader(texto));
        BufferedWriter escritura = new BufferedWriter(new FileWriter(fP.rutamet()));
        
        
        while((linea=lectura.readLine())!=null){
            
            escritura.write(linea.toUpperCase());
            
            System.out.println(linea.toUpperCase());
        }
        
        lectura.close();
        escritura.close();
    }
    
    
    String rutamet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la ruta del fichero y al final el nombre del archivo que desea");
        String ruta = sc.nextLine();
        
        return ruta;
    }
}