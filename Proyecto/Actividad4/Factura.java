/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author CTPG
 */
public class Factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombreCliente;
         int cantProdu;

        System.out.println("Ingrese el nombre del cliente:");
        nombreCliente = sc.nextLine();

        System.out.println("Ingrese la cantidad de productos a comprar:");
        cantProdu = sc.nextInt();

        String[] nomProdu = new String[cantProdu];
        double[] preciosProdu = new double[cantProdu];

        for (int i = 0; i < nomProdu.length; i++) {
            System.out.println("Ingrese el nombre del producto #" + (i + 1) + ":");
            nomProdu[i] = sc.next();

            System.out.println("Ingrese el precio del producto #" + (i + 1) + ":");
            preciosProdu[i] = sc.nextDouble();

           
        }

        double subtotal = 0;
        for (double precio : preciosProdu) {
            subtotal += precio;
        }

        double iva = subtotal * 0.13;
        double total = subtotal + iva;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate fechaActual = LocalDate.now();
        String fechaCompra = fechaActual.format(formatter);

        System.out.println("\nFactura del " + fechaCompra + "\n");
        System.out.println("Cliente: " + nombreCliente + "\n");

        System.out.println("Productos\t\tPrecios");
        for (int i = 0; i < cantProdu; i++) {
            System.out.println(nomProdu[i] + "\t\t\t" + preciosProdu[i]);
        }

        System.out.println("\t\t\t_______\n");
        System.out.println("SUBTOTAL:\t\t" + subtotal);
        System.out.println("IVA:\t\t\t" + iva);
        System.out.println("\t\t\t_______\n");
        System.out.println("TOTAL:\t\t\t" + total);
    }
}
