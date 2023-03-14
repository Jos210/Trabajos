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

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        
        double notaExamen;
        double notaProyecto;
        double notaTareas;
        boolean radioAsistencia=true;
        
        double porcenota;
        double porcenPro;
        double porcentar;
        
        double medianota;
        
        System.out.println("Ingrese la nota que saco en el examen(nota minima 1 y nota maxima 10)");
        notaExamen = sc.nextDouble();
        
        System.out.println("Ingrese la nota que saco en el proyecto(nota minima 1 y nota maxima 10)");
        notaProyecto = sc.nextDouble();
        
        System.out.println("Ingrese la nota que saco en la tarea(nota minima 1 y nota maxima 10)");
        notaTareas = sc.nextDouble();
        
        System.out.println("Cumplio con el radio minimo de asistencia(ingresar true o false)");
        radioAsistencia = sc.nextBoolean();
        
        porcenota=notaExamen*0.6;
        porcenPro=notaProyecto*0.3;
        porcentar=notaTareas*0.1;
        
        medianota=porcenota+porcenPro+porcentar;
        
       if(medianota>=5 && radioAsistencia==true){
           System.out.println("Usted a aprobado ");
       }
       else {
           System.out.println("Usted a reprobado");
       }
       
        
        
    }
    
}
