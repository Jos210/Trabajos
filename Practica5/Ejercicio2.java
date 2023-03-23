/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eJemplosFuncMetodProd;

import java.util.Scanner;

/**
 *
 * @author CTPG
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Ejercicio2 fP=new Ejercicio2();
        
        System.out.println("Ingrese el usuario");
        String id = sc.next();
        
        System.out.println("Ingrese la contraseña");
        String c = sc.next();
        
        
        fP.login(id, c);
        
    }
    void login(String userint, String contraint){
        
        String user ="Jos210";
        String contra ="Josuecito21";
        
    
        if(userint.equals(user) && contraint.equals(contra)){
            System.out.println("Inicio de sesion correcto"); 
        }
        else {
            System.out.println("El usuario o la contraseña es incorrecta");
        }
    
}
    
}
