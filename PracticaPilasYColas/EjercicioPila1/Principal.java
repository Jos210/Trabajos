/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPila1;

import javax.swing.JOptionPane;

/**
 *
 * @author CTPG
 */
public class Principal {
       public static void main(String[] args) {
        int menu=0;
        String Profesion;
        Pila pila=new Pila();
        
        do{
            try{
                menu = Integer.parseInt((JOptionPane.showInputDialog(null,
                        "Opciones de la Pila de Profesiones\n\n"
                                + "1.Mostrar Pila de Profesiones\n"
                                + "2.Insertar una nueva Profesion\n"
                                + "3.Desapilar una profesion\n"
                                + "4.Salir\n\n")));
                switch (menu){
                    case 1: 
                        pila.MostrarPila();
                    break;
                    
                    case 2:
                        Profesion=(JOptionPane.showInputDialog(null,
                                "Digite la profesion a incluir "));
                        pila.Insertar(Profesion);
                    break;
                    
                    case 3:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "Se desapilo la profesion: "
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
