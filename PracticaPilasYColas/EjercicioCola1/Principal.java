/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCola;

/**
 *
 * @author Josue
 */

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        int menu = 0;
        String Nombre;
        Cola cola=new Cola();
        
          do{
            try{
                menu = Integer.parseInt((JOptionPane.showInputDialog(null,
                        "Opciones de la Cola de nombres \n\n"
                                + "1.Mostrar Cola de nombre\n"
                                + "2.Insertar un Nuevo nombre\n"
                                + "3.Extraer un nombre\n"
                                + "4.Salir\n\n")));
                switch (menu){
                    case 1: 
                        cola.MostrarCola();
                    break;
                    
                    case 2:
                        Nombre=(JOptionPane.showInputDialog(null,
                                "Digite el nombre a incluir en el nodo"));
                        cola.Insertar(Nombre);
                    break;
                    
                    case 3:
                        if(!cola.ColaVacia()){
                            JOptionPane.showMessageDialog(null, "Se extrajo el nombre: "
                            + cola.Extraer());
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
