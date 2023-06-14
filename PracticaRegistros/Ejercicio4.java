/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ejercicio4 {
    
    String artista;
    String Titulo;
    int duracion;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         Ejercicio4 arrayMP3[]=new Ejercicio4[15];
        
         for(int i=0;i<arrayMP3.length;i++){
             
        //inicializar el elemto 0 del arreglo
        arrayMP3[i]=new Ejercicio4();
        
       
        System.out.println("Inrese el artista de la cancion ");
        arrayMP3[i].artista=sc.nextLine();
        
        System.out.println("Inrese el titulo de la cancion ");
        arrayMP3[i].Titulo=sc.nextLine();
        
        System.out.println("Inrese la duracion en segundos de la cancion ");
       arrayMP3[i].duracion=sc.nextInt();
       sc.nextLine();
       
        System.out.println("Artista: "+ arrayMP3[i].artista+
                "\nTitulo: "+arrayMP3[i].Titulo+
                "\nDuracion: "+arrayMP3[i].duracion+" segundos\n");
             
         }
        
    }
    
}
