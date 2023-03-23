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
public class Ejercicio1 {
    static final double PI=3.1416;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio1 fP = new Ejercicio1();
        
        int option;
        
        System.out.println("Indique el numero de la figura que desea saber el radio y perimetro"
                + "\n1.Circulo"
                + "\n2.Rombo"
                + "\n3.Triangulo"
                + "\n4.Cuadrado"
                + "\n5.Rectangulo");
        option = sc.nextInt();
        
        switch(option){
            
            case 1:
                System.out.println("Indique el radio del circulo");
                double r=sc.nextDouble();
                
                System.out.println("El area del circulo es "+aCirculo(r));
                
                System.out.println("El perimetro del circulo es "+pCirculo(r));
                
            break;
            
            case 2:
            
                System.out.println("Indique la diagonal mayor del rombo");
                double D=sc.nextDouble();
                System.out.println("Indique la diagonal menor del rombo");
                double d=sc.nextDouble();
                System.out.println("Indique cuanto miden los lados del rombo en centimetros");
                double lado=sc.nextDouble();
                
                System.out.println("El area del rombo es "+aRombo(D, d,lado));
                
                System.out.println("El perimetro del rombo es "+pRombo(D,d,lado));
                
            break;
            
            case 3:
                
                System.out.println("Escriba la base del triangulo ");
                double b=sc.nextDouble();
                System.out.println("Escriba la altura del triangulo");
                double h=sc.nextDouble();
                System.out.println("Escriba un lado del triangulo");
                double l1=sc.nextDouble();
                System.out.println("Escriba otro lado del triangulo");
                double l2=sc.nextDouble();
                System.out.println("Escriba otro lado del tiangulo");
                double l3=sc.nextDouble();
                
                System.out.println("El area del triangulo es "+aTriangulo(b, h, l1, l2, l3));
                
                System.out.println("El perimetro del triangulo es "+pTriangulo(b,h,l1,l2,l3));
           
            break;
            
            case 4:
                
                System.out.println("Indique cuanto miden los lados del cuadrado");
                double l=sc.nextDouble();
                
               System.out.println("el area del cuadrado es "+aCuadrado(l));
               
               System.out.println("el area del cuadrado es "+pCuadrado(l));
                
            break;
            
            case 5:
                System.out.println("Indique la base del rectangulo");
                double ba=sc.nextDouble();
                
                System.out.println("Indique la altura del rectangulo ");
                double al=sc.nextDouble();
                
                System.out.println("El area del rectangulo es "+aRectangulo(ba,al));
                
                System.out.println("El perimetro del rectangulo es "+pRectangulo(ba,al));
                
        }

    }
    
    //circulo
    public static double aCirculo(double radio){
        double Area=PI*Math.pow(radio,2);
        
        return Area;
    }
    
    public static double pCirculo(double radio){
        double Perimetro=2*PI*radio;
        return Perimetro;
    }
    
    
    //Rombo
    public static double aRombo(double diagonalM, double diagonalm, double lados){
        double Area=(diagonalM*diagonalm)/2;
        return Area;
    }
     public static double pRombo(double diagonalM, double diagonalm, double lados) { 
        double perimetro=lados*4;
        return perimetro;
    }
     
    
    //Triangulo
    public static double aTriangulo(double base, double altura, double lado1, double lado2, double lado3){
        double area=(base*altura)/2;
        return area;
    }
    public static double pTriangulo(double base, double altura, double lado1, double lado2, double lado3){    
        double perimetro=lado1+lado2+lado3;
        return perimetro; 
    }
    
    
    //Cuadrado
    public static double aCuadrado(double lado){
        double area=lado*lado;
        return area;
    }
    public static double pCuadrado(double lado){  
        double perimetro=lado*4;
        return perimetro;
    }
    
    
    //Rectangulo
    public static double aRectangulo(double base, double altura){
        double area=base*altura;
        return area;
    }
    public static double pRectangulo(double base, double altura){   
        double perimetro=2*(altura+base);
        return perimetro;
    }
    
}
