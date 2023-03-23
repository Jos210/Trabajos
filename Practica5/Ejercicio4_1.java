package eJemplosFuncMetodProd;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josue
 */
public class Ejercicio4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio4_1 fP = new Ejercicio4_1();
        
         System.out.println("Ingrese la nota que saco en el examen(nota minima 1 y nota maxima 10)");
        double notaExamen = sc.nextDouble();
        
        System.out.println("Ingrese la nota que saco en el proyecto(nota minima 1 y nota maxima 10)");
        double notaProyecto = sc.nextDouble();
        
        System.out.println("Ingrese la nota que saco en la tarea(nota minima 1 y nota maxima 10)");
        double notaTareas = sc.nextDouble();
        
        System.out.println("Cumplio con el radio minimo de asistencia(ingresar true o false)");
        boolean radioAsistencia = sc.nextBoolean();
        
        fP.medianota(notaExamen, notaProyecto, notaTareas, radioAsistencia);
        
        
    }
    
    void medianota(double notEx, double notPro, double notare, boolean rd){
        
        double porcenota=notEx*0.6;
        double porcenPro=notPro*0.3;
        double porcentar=notare*0.1;
        
        double medianota=porcenota+porcenPro+porcentar;
        
        
         if(medianota>=5 && rd==true){
           System.out.println("Usted a aprobado ");
       }
       else {
           System.out.println("Usted a reprobado");
       }
       
    }
    
    
}
