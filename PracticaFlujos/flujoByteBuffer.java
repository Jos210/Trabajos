/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flujos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Josue
 */
public class flujoByteBuffer {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        int caracter;
        BufferedInputStream lectura=null;
        BufferedOutputStream escritura=null;
        
        //creando objetos de cada flujo de E/S
        lectura=new BufferedInputStream(new FileInputStream("ejemplo.txt"));
        escritura= new BufferedOutputStream( new FileOutputStream("ejemplo2.txt"));
        
        caracter=lectura.read();
        
        //hacer el recorrido de ficheros byte por byte hasta llegar al final 
        
        while(caracter!=-1){
            escritura.write(caracter);
            caracter=lectura.read();
        }
        System.out.println("El archivo fue copiado exitosamente");
        lectura.close();
        escritura.close();
        
    }
    
}
