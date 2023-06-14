/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

/**
 *
 * @author Josue
 */
public class Bidimensional {
    public static void main(String[] args) {
        //declaracion e inicializacion de arreglo bidimensional
        int [][] edad=new int [3][4];
                //llenado de arreglo
                edad[0][0]=12;
                edad[0][1]=67;
                edad[0][2]=89;
                edad[0][3]=95;
                
                edad[1][0]=80;
                edad[1][1]=23;
                edad[1][2]=16;
                edad[1][3]=20;
                
                edad[2][0]=66;
                edad[2][1]=24;
                edad[2][2]=95;
                edad[2][3]=45;
                for(int i=0;i<3;i++){
                    for(int j=0;j<4;j++){
                        System.out.println(edad[i][j]);
                    }
                }
    }
    
}
