/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad3;

import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class Pilas {

    private Nodo inicio,fin;
    String Pila="";

    public Pilas() {
        inicio = null;
        fin = null;
    }

    public boolean pilaVacia() {
        return inicio == null;
    }

    public void push(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.valor=valor;
        nuevoNodo.siguiente=null;
        if (pilaVacia()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.siguiente = nuevoNodo;
            inicio = nuevoNodo;
        }
    }

    public double pop() {
        if (pilaVacia()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        double valorEliminado = inicio.valor;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            inicio = inicio.siguiente;
        }
        return valorEliminado;
    }

    public void mostrarPila() {
        
         Nodo buscar=inicio;
        String PilaInvertida="";
        while(buscar!=null){
            Pila+=buscar.valor + " ";
            buscar=buscar.siguiente;
        }
        String cadena[]=Pila.split(" ");
       
        
        for(int i=cadena.length-1;i>=0;i--){
            PilaInvertida+=" "+cadena[i];
        }
        JOptionPane.showMessageDialog(null, PilaInvertida);
        Pila="";
    }
}