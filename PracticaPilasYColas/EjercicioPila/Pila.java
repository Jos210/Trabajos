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
public class Pila {
    
    //asignado el comportamiento de una pila
    private Nodo inicio,fin;
    String Pila="";//para saber el contendio de la cola
    
    //constructor de la cola
    public Pila(){
        inicio=null;
        fin=null;
    }
    
    //Metodos del programa (Cola Vacia)
    public boolean PilaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    
    //insercion en la cola 
    public void Insertar(double valor){
        Nodo nuevoNodo=new Nodo();
        nuevoNodo.valor=valor;
        nuevoNodo.siguiente=null;
        
        if(PilaVacia()){
            inicio=nuevoNodo;
            fin=nuevoNodo;
        }else{
            fin.siguiente=nuevoNodo;
            fin=nuevoNodo;
        }
    }
    
    public double desapilar(){
        double dEliminado=fin.valor;
        if(inicio==fin){
            inicio=null;
            fin=null;
        }else{
            Nodo puntero=inicio;
            while(puntero.siguiente!=fin){
                puntero=puntero.siguiente;
            }
            fin=puntero;
            fin.siguiente=null;
        }
        return dEliminado;
    }
    
    //Mostrar contenido
    public void MostrarPila(){
        Nodo buscar=inicio;
        String PilaInvertida="";//invertimos una cadena de texto
        while(buscar!=null){
            Pila+=buscar.valor + " ";
            buscar=buscar.siguiente;
        }
        String cadena[]=Pila.split(" ");
        //para invertir la cadena creada con los espacios correctos
        
        for(int i=cadena.length-1;i>=0;i--){
            PilaInvertida+=" "+cadena[i];
        }
        JOptionPane.showMessageDialog(null, PilaInvertida);
        Pila="";
    }
}
