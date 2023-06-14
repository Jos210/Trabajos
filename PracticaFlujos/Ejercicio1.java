/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flujos;

import static java.awt.PageAttributes.MediaType.C;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class Ejercicio1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
    
        /*
       FileReader fileReader = new FileReader("C:\\Users\\CTPG\\Documents\\Ejercicios\\ABC.txt");
       BufferedReader bufferedReader = new BufferedReader(fileReader);
       StringBuilder stringBuilder = new StringBuilder();
       
       int caracter;
       
       
       while ((caracter = bufferedReader.read()) != -1) {
           
       if (caracter != 32) {
     
        stringBuilder.append((char) caracter);
        
         } 
      }
        bufferedReader.close();
        JOptionPane.showMessageDialog(null, stringBuilder.toString());
    }*/
        
   final String ruta="C:\\\\Users\\\\CTPG\\\\Documents\\\\Ejercicios\\\\ABC.txt";
   String linea="";
   
   try(FileReader fr=new FileReader(ruta)){
       int dato=fr.read();
       while(dato!=-1){
           //si el caracter es un espacio no se incluye
           if(dato!=32){
               linea+=(char)dato;
           }
           dato = fr.read();
       }
       JOptionPane.showMessageDialog(null,linea );
   } catch (IOException e){
       System.out.println("Error"+e);
   }   
    }
}