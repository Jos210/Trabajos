/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

/**
 *
 * @author Josue
 */
public class ArrayE {
    public static void main(String[] args) {
         String [] [] verduras = new String [4] [5];
        
        //primera fila
        verduras[0][0]="Menta";
        verduras[0][1]="Curcuma";
        verduras[0][2]="Culantro";
        verduras[0][3]="Mejorana";
        verduras[0][4]="Salvia";
        
        //segunda fila
        verduras[1][0]="Comino";
        verduras[1][1]="Ajo   ";
        verduras[1][2]="Cilantro";
        verduras[1][3]="Romero";
        verduras[1][4]="Cebollin";
        
        //tercera fila
        verduras[2][0]="Perejil";
        verduras[2][1]="Curri";
        verduras[2][2]="Laurel";
        verduras[2][3]="Albahaca";
        verduras[2][4]="Calendula";
        
        //cuarta fila
        verduras[3][0]="Oregano";
        verduras[3][1]="Pimienta";
        verduras[3][2]="Tomillo";
        verduras[3][3]="Hierbabuena";
        verduras[3][4]="Manzanilla";
        
        for(int i=0;i<4;i++){
            System.out.println("\t\n");
            for(int j=0;j<5;j++){
                System.out.print("      "+verduras[i][j]);
            }
        }
      
    }
}
