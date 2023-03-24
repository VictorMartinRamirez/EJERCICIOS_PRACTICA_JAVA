/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_PRACTICA_JAVA_POO;
import java.util.Scanner ;
/**
 * @author VICTOR MARTIN RAMÍREZ
 */
public class EJERCICIO_28 {
 public static void main( String [] args){  

    
/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.*/


int[][] MatrizM = new int[10][10];

for (int i = 0; i < 10; i++) {
for (int j = 0; j < 10; j++) {
 
int numero = (int) (Math.random()*10);
MatrizM [i][j] = numero ; // i FILAS; j COLUMNAS
}
}


int[][] MatrizP = new int[3][3];

for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
 
int numeroI = (int) (Math.random()*10);
MatrizP [i][j] = numeroI ; // i FILAS; j COLUMNAS
}
}

System.out.println("LA MATRIZ 10X10 FORMADA ES ");

for (int i = 0; i < 10; i++) {
for (int j = 0; j < 10; j++) {
System.out.print(MatrizM [i][j]);
}
System.out.println( );
}



System.out.println( );


System.out.println("LA MATRIZ 3X3 FORMADA ES ");

for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.print(MatrizP [i][j]);
}
System.out.println( );
}




}
}