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

public class Cola {
    
    private Nodo inicio, fin;
    String Cola="";//para saber el contenido de la cola
    
    //constructor de la cola
    public Cola(){
        inicio=null;
        fin=null;
    }
    
    //Metodos del programa(Cola Vacia)
    public boolean ColaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    
    //insertar en la cola
    public void Insertar(String info){
        Nodo nuevoNodo=new Nodo();
        nuevoNodo.info=info;
        nuevoNodo.siguiente=null;
        
        if(ColaVacia()){
            inicio=nuevoNodo;
            fin=nuevoNodo;
        }else{
            fin.siguiente=nuevoNodo;
            fin=nuevoNodo;
        }
    }
    
    public String Extraer(){
        if(!ColaVacia()){
            String dato=inicio.info;
            
            if(inicio==fin){
                inicio=null;
                fin=null;
            }else{
                inicio=inicio.siguiente;
            }
            return dato;
        }else{
            return "XD";
        }
    }
    
    //Mostrar el Contenido
    public void MostrarCola(){
        Nodo buscar=inicio;
        String ColaInvertida="";//invertimos una cadena de texto
        while(buscar!=null){
            Cola += buscar.info + "  ";
            buscar=buscar.siguiente;
        }
        String cadena[]=Cola.split(" ");
        //para invertir la cadena creada con los espacios correctos
        
        for(int i=cadena.length-1;i>=0;i--){
            ColaInvertida += " "+cadena[i];
        }
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola="";
    }
}
