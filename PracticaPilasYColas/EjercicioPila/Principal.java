/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPila;

import javax.swing.JOptionPane;

/**
 *
 * @author CTPG
 */
public class Principal {
      public static void main(String[] args) {
        int menu=0;
        double peso=0;
        Pila pila=new Pila();
        
        do{
            try{
                menu = Integer.parseInt((JOptionPane.showInputDialog(null,
                        "Opciones de la Pila de pesos\n\n"
                                + "1.Mostrar Pila\n"
                                + "2.Insertar un Nuevo peso\n"
                                + "3.Desapilar un peso\n"
                                + "4.Salir\n\n")));
                switch (menu){
                    case 1: 
                        pila.MostrarPila();
                    break;
                    
                    case 2:
                        peso=Double.parseDouble(JOptionPane.showInputDialog(null,
                                "Digite el peso a incluir en el nodo"));
                        pila.Insertar(peso);
                    break;
                    
                    case 3:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "Se desapilo el peso con el valor: "
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
    
    
}
