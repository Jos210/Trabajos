/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estruct_Seleccion;

/**
 *
 * @author Josue 
 */

import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        
        int precio;
        
        System.out.println("Ingrese el precio del kilo de sandia");
        precio = sc.nextInt();
        
        double precio20=precio*0.20;
        double precio40=precio*0.40;
        double precio15=precio*0.15;
        double precio45=precio*0.45;
        
        int sandia;
        
        System.out.println("Ingrese el numero del tipo de sandia y la calidad : "
                + "\n 1. ketsali de buena calidad \n 2. ketsali de  excelente calidad \n 3. Lavon de Excelente calidad"
                + "\n 4. Lavon de buena calidad ");
        sandia = sc.nextInt();
        
        switch (sandia){
            case 1:
                
               double sandia20 = precio+precio20;
               System.out.println("Elijio la sandia ketsali de buena calidad, el precio se suma un 20%, el precio final es "+sandia20);
               
               break;
                
            case 2:
                
                double sandia40=precio+precio40;
                System.out.println("Elijio la sandia ketsali de excelente calidad, el precio se suma un 40%, el precio final es "+sandia40);
                
                break;
            case 3:
                
                double sandia45=precio+precio45;
                System.out.println("Elijio la sandia lavon de excelente calidad, al precio inicial se le suma un 45%, el precio final es"+sandia45);
                
            case 4:
                
                double sandia15=precio+precio15;
                System.out.println("Elijio sandia lavon de buena calidad, al precio inicial se le suma un 15%, el precio final es "+sandia15);
                
            default:
                System.out.println("marco un numero incorrecto");
                
        }
        
    }
    
}
