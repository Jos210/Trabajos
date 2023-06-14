/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPila2;

/**
 *
 * @author Josue
 */

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        int menu=0, edad=0;
        Pila pila=new Pila();
        
        do{
            try{
                menu = Integer.parseInt((JOptionPane.showInputDialog(null,
                        "Opciones de la Pila de edades\n\n"
                                + "1.Mostrar Pila de edades\n"
                                + "2.Insertar una nueva edad\n" 
                                + "3.Desapilar una edad\n"
                                + "4.Salir\n\n")));
                switch (menu){
                    case 1: 
                        pila.MostrarPila();
                    break;
                    
                    case 2:
                        
                        edad=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Digite la edad a incluir en el nodo"));
                        
                        validacion(pila, edad);
                        
                    break;
                    
                    case 3:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "Se desapilo ena edad con el valor: "
                            + pila.desapilar());
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola esta vacia");
                        }
                    break;
                    
                    case 4:
                        menu=4;
                    break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion seleccionada no esta dentro del menu");
                        
                }
                
            }catch (NumberFormatException e){
                
            }
        }while (menu!=4);
    }
    
    public static void validacion (Pila pila,int edad){
        
        if (edad>=0 && edad<=65){
                        
                        pila.Insertar(edad);
                    }
        
    }
    
}
