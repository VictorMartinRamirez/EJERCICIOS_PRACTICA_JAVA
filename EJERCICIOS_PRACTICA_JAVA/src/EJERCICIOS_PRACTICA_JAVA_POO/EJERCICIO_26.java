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
public class EJERCICIO_26 {
public static void main( String [] args){ 
/*Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que
una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz
A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa)*/      
int numero,tamaño  ;
boolean antisimetrica = true ;


Scanner ejerc23 =new Scanner (System.in);
System.out.println( "INGRESE EL NUMERO DE FILAS Y COLUMNAS DE LA MATRIZ CUADRADA ");
tamaño = ejerc23.nextInt();

int[][] Matriz = new int[tamaño][tamaño];
for (int i = 0; i < tamaño; i++) {
for (int j = 0; j < tamaño; j++) {
    

    
Scanner ejerc23b =new Scanner (System.in);
System.out.println("INGRESE EL ELEMENTO DE LA FILA " + i + " Y COLUMNAS " + j );
int elemento = ejerc23b.nextInt();
Matriz[i][j] = elemento ;  //numero ;  i FILAS; j COLUMNAS

}    
}

System.out.println("LA MATRIZ FORMADA ES ");


for (int i = 0; i < tamaño; i++) {
for (int j = 0; j < tamaño; j++) {
System.out.print (Matriz [i][j]);
}
System.out.println(  );
}



for (int i = 0; i < tamaño; i++) {
for (int j = 0; j < tamaño; j++) {
//System.out.println( Matriz [i][j]);
//System.out.println( Matriz [j][i]);

if( Matriz [i][j] == Matriz [j][i]) {
//antisimetrica = true ;
continue;
}
else {antisimetrica = false;
break;}
}
}

if ( antisimetrica == true){
System.out.println("LA MATRIZ ES ANTISIMETRICA");

}


/* 0 -2 4
  -2  0 2
   4 -2 0 */
}
}
