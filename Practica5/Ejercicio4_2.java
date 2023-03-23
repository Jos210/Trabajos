/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eJemplosFuncMetodProd;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ejercicio4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Ejercicio4_2 fP = new Ejercicio4_2();
        
        System.out.println("Ingrese la cantidad de kilometros que desea viajar en su trayecto ");
        int trayec = sc.nextInt();
        
        
        if(trayec==150){
            
             fP.pasaje(trayec);
        
        }
         
        else if (trayec>150 && trayec<250){
            
            fP.pasaje1(trayec);
     
        }
        
        else if (trayec>=250){
            
            fP.pasaje2(trayec);
     
 }
        
    }
    
    void pasaje(int trayecto){
        double pasaje=500;
        
        System.out.println("El costo de su pasaje es de "+pasaje);
    }
    
    void pasaje1(int trayecto){
        
        double pasaje=500;
        int pasajeExtra;
        int recargo=5;
        
        pasajeExtra=trayecto-150;
        pasaje=pasaje+pasajeExtra*recargo;
     
     System.out.println("El costo de su pasaje es de "+pasaje);
    
   }
    
    void pasaje2(int trayecto){
          double pasaje=500;
          int pasajeExtra;
          int recargo=5;
          double porce=0.15;
          double pasajedes;
          double pasajetotal;
  
          pasajeExtra=trayecto-150;
          pasaje=pasaje+pasajeExtra*recargo;
          pasajedes=pasaje*porce;
          pasajetotal=pasaje-pasajedes;
     
          System.out.println("El costo de su pasaje es de "+pasajetotal);
    }
    
    
}
