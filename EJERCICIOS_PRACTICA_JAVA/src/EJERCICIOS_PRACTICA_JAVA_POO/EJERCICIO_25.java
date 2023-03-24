/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_PRACTICA_JAVA_POO;
/**
 * @author VICTOR MARTIN RAMÍREZ
 */

public class EJERCICIO_25 {
public static void main( String [] args){   
    
/*  Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
muestre la traspuesta. ¿Que es una matriz traspuesta?  */
int numero ;
int[][] Matriz = new int[4][4];

for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
    
numero = (int) (Math.random()*10);
Matriz[i][j] = numero ; // i FILAS; j COLUMNAS

}
}
System.out.println("LA MATRIZ FORMADA ES ");



for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
System.out.print(Matriz [i][j]);
}
System.out.println( );
}

System.out.println(  "SU TRANSPUESTA SERA " );
for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
System.out.print(Matriz [j][i]);
}
System.out.println( );
}


}
}
