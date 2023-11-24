
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josue
 * @since 25/7/2023
 * @version 2
 */
public class procedimientos {
    
    public static Scanner sc = new Scanner(System.in);
    public static procedimientos fP = new procedimientos();
    
    
    /**
     * @since 25/7/2023
     */
    public void menu(){
        System.out.println("Ingrese el numero correspondiente a lo que necesita "
                + "\n1.Convertir un numero decimal a binario"
                + "\n2.Numero de cifras de un numero dado por teclado"
                + "\n3.Convertir un monto en colones a dólares, euros, libras y yenes"
                + "\n4.Determinar si un numero es primo o no");
        int option=sc.nextInt();
   
        switch(option){
            
            case 1:
                
                System.out.println("Ingrese en numero decimal que desea convertir");
                sc.nextLine();
                String deci= sc.nextLine();
                fP.decibina(deci);
                
            break;
            
            case 2:
                
                System.out.println("Ingrese el numero que desea saber las cifras");
                 sc.nextLine();
                String n=sc.nextLine();
                fP.cifras(n);
                
            break;
            
            case 3:
                
                System.out.println("Ingrese el valor a convertir en colones");
                sc.nextLine();
                String co=sc.nextLine();
                fP.conversion(co);
                
            break;
            
            case 4:
                
                System.out.println("Ingrese el numero que desea saber si es primo o no");
                sc.nextLine();
                String num=sc.nextLine();
                fP.esPrimo(num);
                
            break;
            
            default:
                System.out.println("Usted ingreso un numero no valido");
            
        }
        
        
    }
    
    /**
     * 
     * @param dato
     * @return true si el dato es un numero
     * @return false si el dato esta vacio o no es un numero
     */
     public boolean validacionint(String dato){
        try{
            Integer.parseInt(dato);
            return true;
        }catch (NumberFormatException excepcion){
            return false;
        }
    }
     
     public boolean validaciondouble(String dato){
        try{
            Double.parseDouble(dato);
            return true;
        }catch (NumberFormatException excepcion){
            return false;
        }
    }
    
     
     /**
      * 
      * @param decimal 
      * @see llamado del metodo validacionint para validar que contenga un numero 
      * 
      */
    public void decibina(String decimal){
        if(decimal.isEmpty()){
             System.out.println("Campo vacio");
        }else if(validacionint(decimal)){
            int binario = Integer.parseInt(decimal);
            System.out.println("El numero convertido a binario es\n"+ Integer.toBinaryString(binario));
        } else if (validacionint(decimal)==false){
            System.out.println("Ingreso un dato invalido");
        }
        
    }
    
    
     /**
      * 
      * @param num
      * @see llamado del metodo validaciondouble para validar que contenga un numero 
      * 
      */
    
    public void cifras(String num){
        
         if(num.isEmpty()){
             System.out.println("Campo vacio");
        }else if(validaciondouble(num)){
            int binario = Integer.parseInt(num);
            System.out.println("El numero convertido a binario es\n"+ num.length());
        } else if (validaciondouble(num)==false){
            System.out.println("Ingreso un dato invalido");
        }
        
    }
    
     /**
      * 
      * @param colon
      * @see llamado del metodo validaciondouble para validar que contenga un numero 
      * 
      */
    public void conversion(String colon){
        
         if(colon.isEmpty()){
             System.out.println("Campo vacio");
        }else if(validaciondouble(colon)){
            
            double dolares, euros, libras, yenes,c;
            c = Double.parseDouble(colon);
            dolares = 0.0019* c;
            euros = 0.0017 * c;
            libras = 0.0014 * c;
            yenes = 0.26 * c;
            
             System.out.println("Colones: "+c
             +"dolares: "+ dolares
             +"euros: "+euros
             +"libras: "+libras
             +"yenes: "+yenes);
            
        } else if (validaciondouble(colon)==false){
            System.out.println("Ingreso un dato invalido");
        }
        
    }
    
    /**
     * 
     * @param numero
     * @return false si el numero no es primo
     * @return true si el numero es primo 
     */
    
    public static boolean Primo(int numero) {
  
       if (numero == 0 || numero == 1 || numero == 4) {
       return false;
       }
       
       for (int x = 2; x < numero / 2; x++) {
   
       if (numero % x == 0)
       return false;
       }
 
        return true;
}
    
    
    /**
     * 
     * @param n 
     * @see llamado del metodo validacion int para validar que el dato sea numerico y no este vacio
     * @see llamado del metodo Primo para saber si el numero es primo o no
     */
    public void esPrimo(String n){
        
         if(n.isEmpty()){
             System.out.println("Campo vacio");
        }else if(validacionint(n)){
            
            int nu=Integer.parseInt(n);
            
            if(fP.Primo(nu)==true){
                System.out.println("El numero es primo");
            }else{
                System.out.println("El numero no es primo");
            }
            
        } else if (validacionint(n)==false){
            System.out.println("Ingreso un dato invalido");
        }
        
    }

}
