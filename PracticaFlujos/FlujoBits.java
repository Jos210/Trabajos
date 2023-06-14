/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flujos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class FlujoBits {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner (System.in);
        
        int caracter;//variable para recabar bit por bit cada dato
        FileInputStream lectura;//variable de tipo fileinputstream
        FileOutputStream escritura;//variable de tipo fileOutputStream
        
        //crear objetos de cada flujo
        lectura=new FileInputStream("ejemplo.txt");
        escritura=new FileOutputStream("cop ejemplo.txt");
        
        caracter=lectura.read();//lee bit por bit 
        
        while(caracter!=-1){
            escritura.write(caracter);//se escribe el valor en el archivo
            System.out.println((char)caracter);//casteo para cambiar valor
            caracter=lectura.read();
        }
        System.out.println("\n Ya se realizo la copia del archivo");
        JOptionPane.showMessageDialog(null,"ya se realizo la copia del archivo");
        lectura.close();
        escritura.close();
        
        
    }
    
}
