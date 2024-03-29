/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flujos;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class FlujoStandar {
    public static void main(String[] args) {
        //Instancia de la clase escaner con nombre sc
        Scanner sc = new Scanner (System.in);
        
        //declarar dos variables de tipo cadena 
        String num1, num2;
        
        System.out.println("Digite dos numeros que estan entre 0 y 10");
        num1 = sc.nextLine();
        num2 = sc.nextLine();
        
        if(!num1.isEmpty()&&!num2.isEmpty()){
            System.out.println("");
        }
        
        //realizar sumatoria de los numeros solo si estan dentro del rango
        int aux1, aux2;
        int sumatoria;
        
        if(isNumerico(num1)&& isNumerico(num2)){
            aux1 = Integer.parseInt(num1);
            aux2 = Integer.parseInt(num2);
            
            if(aux1!=0 && aux2!=0){
                if(aux1>0 && aux1<=10){
                    if(aux2>0 && aux2<=10){
                        sumatoria=aux1+aux2;
                        System.out.println("El resultado de la suma es "+sumatoria);
                    }else{
                        System.out.println("El segundo valor esta fuera del rango");
                    }
                }else{
                    System.out.println("El primer valor digitado esta fuera del rango");
                }
            }else{
                System.out.println("Los dos valores son nulos");
            }
        }else{
            System.out.println("Los datos no son numericos, no se puede continuar");
    }

    }
    
    public static boolean isNumerico(String cadena){
        try{
            Integer.parseInt(cadena);//convertir de string a int
            return true;
        }catch(NumberFormatException nfe){
            return false;
        }
    } 
    }
    
