/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class unidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
        //arreglos para almacenar nombres de 9 de medicinas 
        String [] medicinas= new String[9];//corchetes antes del nombre 
        String medicinasN []= new String[9];//corchetes despues del nombre 
        
        //llenar arreglo
        medicinas[0]="acetaminofen";
        medicinas[1]="penicilina";
        medicinas[2]="ibuprofeno";
        medicinas[3]="alergial";
        medicinas[4]="Tramal";
        medicinas[5]="sulfadecina de plata";
        medicinas[6]="Panadol";
        medicinas[7]="Dexametasona";
        medicinas[8]="suero";
        
        //llenado el arreglo con for
        for(int i=0;i<medicinasN.length;i++){
            System.out.println("Indique el nombre del medicamento");
            medicinasN [i]=sc.nextLine(); 
        }
        //imprimir arreglo manualmente 
            System.out.println("medicanmento 1: "+medicinasN [0]);
            System.out.println("medicanmento 2: "+medicinasN [1]);
            System.out.println("medicanmento 3: "+medicinasN [2]);
            System.out.println("medicanmento 4: "+medicinasN [3]);
            System.out.println("medicanmento 5: "+medicinasN [4]);
            System.out.println("medicanmento 6: "+medicinasN [5]);
            System.out.println("medicanmento 7: "+medicinasN [6]);
            System.out.println("medicanmento 8: "+medicinasN [7]);
            System.out.println("medicanmento 9: "+medicinasN [8]);

        //imprimir con metodo to String
        System.out.println(medicinasN.toString());
            
            
        //imprimir arreglo con un for 
        
        for(int num=0;num<medicinasN.length;num++){
            
            System.out.println(medicinasN [num]);
        }
        
        
        // arreglos para almacenar la estatura de 8 personas 
        
        double arrayEstatura[]= new double [8];
        
        //llenando arreglo 
        for (int i=0;i<arrayEstatura.length;i++){
            
        System.out.println("digite una  estatura");
        arrayEstatura[i]=sc.nextDouble();
        
    }
        
        
        //impresion del for 
        
        System.out.println(Arrays.toString(arrayEstatura));

*/
        
        //arreglo para almacenar las iniciales de los nombres de 6 personas 
        
        char arrayNombres[]= new char[6];
        
        for(int i=0;i<arrayNombres.length;i++){
            System.out.println("Digite un nombre");
            arrayNombres[i]=sc.next(). charAt(0);
        }
        
        System.out.println(Arrays.toString(arrayNombres));
        
        
    }
    
}
