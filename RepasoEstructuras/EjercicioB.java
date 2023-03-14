/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoEstructuras;

/**
 *
 * @author Josue
 */

import java.util.Scanner;

public class EjercicioB {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double pasaje=500;
        int trayecto;
        int pasajeExtra;
        int recargo=5;
        double porce=0.15;
        double pasajedes;
        double pasajetotal;
        
        System.out.println("Ingrese la cantidad de kilometros que desea viajar en su trayecto ");
        trayecto = sc.nextInt();
        
        if(trayecto==150){
            System.out.println("El costo de su pasaje es de "+pasaje);  
        }
        else if (trayecto>150 && trayecto<250){
            
            pasajeExtra=trayecto-150;
            pasaje=pasaje+pasajeExtra*recargo;
            
            System.out.println("El costo de su pasaje es de "+pasaje);

        }
        else if (trayecto>=250){
            
            pasajeExtra=trayecto-150;
            pasaje=pasaje+pasajeExtra*recargo;
            pasajedes=pasaje*porce;
            pasajetotal=pasaje-pasajedes;
            
            System.out.println("El costo de su pasaje es de "+pasajetotal);
            
        }
    }
    
}
