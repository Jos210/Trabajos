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
public class Principal {
    public static void main(String[] args) {
        int menu = 0;
        int edad = 0;
        Pilas pila = new Pilas();

        do {
            try {
                menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Opciones de la Pila de Edades\n\n"
                                + "1. Mostrar Pila\n"
                                + "2. Insertar una Nueva Edad\n"
                                + "3. Desapilar una Edad\n"
                                + "4. Salir\n\n"));

                switch (menu) {
                    case 1:
                        pila.mostrarPila();
                        break;

                    case 2:
                        edad = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese la edad a insertar en la pila"));
                        pila.push(edad);
                        break;

                    case 3:
                        if (!pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se desapiló la edad con valor: " + pila.pop());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila está vacía");
                        }
                        break;

                    case 4:
                        menu = 4;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "La opción seleccionada no está dentro del menú");
                }
            } catch (NumberFormatException e) {
                // El usuario ingresó un valor no numérico, se puede manejar el error aquí si se desea.
            }
        } while (menu != 4);
    }
}
