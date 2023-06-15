/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

import java.util.Scanner;

/**
 *
 * @author Josue
 */

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("Ingrese la cantidad de números: ");
         n = sc.nextInt();

        int[] numeros = new int[n];

        // Solicitar los números al usuario y almacenarlos en el arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Calcular la suma y multiplicación de los elementos del arreglo
        int suma = 0;
        int multiplicacion = 1;
        for (int i = 0; i < n; i++) {
            suma += numeros[i];
            multiplicacion *= numeros[i];
        }

        // Imprimir el arreglo y el resultado de las operaciones
        System.out.println("Arreglo: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nSuma: " + suma);
        System.out.println("Multiplicación: " + multiplicacion);
    }
}
