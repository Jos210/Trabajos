/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Josue
 */
public class Repaso {
   public static final double PI= 3.1416;
    public static void main(String[] args) {
        
        //Parte 1
        
        //area de triangulo 
        int basetri=057;
        int alturatri=064;
        
        double areatri=basetri*alturatri/2;
        System.out.println("El area del triangulo es "+areatri);
        
        //area circulo 
       
        double radio=0xC;
        double areacir;
        
        areacir = PI * Math.pow(radio,2);
        
        //IMC 
        
        int peso=86;
        int altura=180;
        double imc=peso/(altura^2);
        System.out.println("EL imc de la persona es "+imc);
        
        //Parte 2
        
        int a=8;
        int b=3;
        int c=5;
        
        //punto a
        int expreA = a+b+c;
        System.out.println("el valor de la expresion a es "+expreA);
        
        //punto b
        double expreb=a/b;
        System.out.println("el valor de la expresion b es "+expreb);
        
        //punto c
        double exprec=a/c;
        System.out.println("el valor de la expresion c es "+exprec);
        
        //punto d, da mal el resultado 
        
        double mult1=2*b;
        double rest=a-c;
        double expred=mult1+3 * rest;
        System.out.println("el valor de la expresion d es "+expred);
        
        //punto e 
        
        double reste= a%b;
        System.out.println("el valor de la expresion e es "+reste);
        
        //punto f
        
        double restf= a%c;
        System.out.println("el valor de la expresion f es "+restf);
        
        //punto g
        
        double divi=b/c;
        double resul=a*divi;
        System.out.println("el valor de la expresion g es "+resul);
        
        //punto h
        
        double multi=a*c;
        double resul2=multi%b;
        System.out.println("el resultado de la expresion h es "+resul2);
        
        
        //punto i
        
        double exprei=a*b/c;
        
        //punto j
        
        double paren1= a-4*b;
        double paren2=c+2*a;
        double paren3=a-c;
        double exprej= (paren1 % paren2) / paren3;
        System.out.println("el resultado de la expresion j es "+exprej);
        
        //Parte 3
        
        String c1="54";
        String c2="20";
        String c3="36";
        
        int convC1=Integer.parseInt(c1);
        int convC2=Integer.parseInt(c2);
        int convC3=Integer.parseInt(c3);
        
        //punto a 
        int valora=convC1+convC2;
        System.out.println("el valor del punto a es "+valora);
        
        //punto b
        int valorb=convC1/convC3;
        System.out.println("el valor del punto b es "+valorb);
        
        //punto c
        int valorc= convC1*convC3+convC2;
        System.out.println("el valor del punto c es "+valorc);
        
        //punto d
        int valord= (convC2^2)*convC1-convC2;
        System.out.println("el valor del punto d es "+valord);
        
       //Parte 4
       
       boolean x=true;
       boolean y=false;
       boolean z=true;
       
      //punto a 
      
      boolean vallora =(x&&y) || (x && z);
      System.out.println("El valor de del punto a de la parte 4 es "+vallora);
        
     //punto b
     
     boolean vallorb = x & z | y;
        System.out.println("el valor del punto b de la parte 4 es "+vallorb);
     
     //punto c 

     boolean vallorc = x & !y & !x | !z & y;
        System.out.println("el valor del punto c de la parte 4 es "+vallorc);
     
     //punto d 
     
     boolean vallord = !x & z &(!z | !x);
        System.out.println("el valor del punto d de la parte 4 es "+vallord);
     
     //Parte 5 
     
    int i=9;
    int j=4;
    
    float q=0.005F;
    float w=-0.01F;
    
    char C=5;
    char d=3;
    
    //Parte 6
    
    //punto a 
     boolean compa=(1<=j);
        System.out.println("la respuesta es "+compa);
     
     //punto b
     boolean compb=!(i<=j);
        System.out.println("la respuesta es "+compb);
     
     //punto c
     boolean compc=!(q>0);
        System.out.println("la respuesta es "+compc);
     
     //punto d
     boolean compd=(i<0 & j<9);
        System.out.println("la respuesta es "+compc);
        
     //punto e
     boolean compe=;
             System.out.println("la respuesta es "+compe);
     
     //punto f
     boolean compf=(q!=i);
     
     //punto g
     boolean compg=;
    }
    
}
