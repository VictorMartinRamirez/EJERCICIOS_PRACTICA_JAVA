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
public class EJERCICIO_27 {
public static void main( String [] args){   
  
/* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9 */
    
int[][] Matriz = new int[3][3];

for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
 
Scanner ejerc27 =new Scanner (System.in);
System.out.println("INGRESE EL ELEMENTO ENTRE 1 Y 9 PARA LA FILA " + i + " Y COLUMNAS " + j );
int elemento = ejerc27.nextInt();
     
     /* 2 7 6
        9 5 1
        4 3 8 */
       

if ((elemento > 0)&&(elemento < 10)) {

} else { System.out.println("INGRESE UN ELEMENTO VALIDO PARA LA FILA " + i + " Y COLUMNAS " + j );
    elemento = ejerc27.nextInt();
}

Matriz[i][j] = elemento ;  //numero ;  i FILAS; j COLUMNAS
}    
}  



int resultadoF1= ( Matriz[0][0])+( Matriz[0][1])+( Matriz[0][2]);
        //System.out.println("LA SUMA DE LA PRIMERA FILA " + resultadoF1);
int resultadoF2= ( Matriz[1][0])+( Matriz[1][1])+( Matriz[1][2]);
         //System.out.println("LA SUMA DE LA SEGUNDA FILA " + resultadoF2);
int resultadoF3= ( Matriz[2][0])+( Matriz[2][1])+( Matriz[2][2]);
         //System.out.println("LA SUMA DE LA TERCERA FILA " + resultadoF3);
 
         //System.out.println(  ) ;   
        
int resultadoC1= ( Matriz[0][0])+( Matriz[1][0])+( Matriz[2][0]);
         //System.out.println("LA SUMA DE LA PRIMERA COLUMNA " + resultadoC1);
int resultadoC2= ( Matriz[0][1])+( Matriz[1][1])+( Matriz[2][1]);
         //System.out.println("LA SUMA DE LA SEGUNDAA COLUMNA " + resultadoC2);
int resultadoC3= ( Matriz[0][2])+( Matriz[1][2])+( Matriz[2][2]);
         //System.out.println("LA SUMA DE LA TERCERA COLUMNA " + resultadoC3);        
    
        System.out.println(  ) ;
        
int resultadoD1= ( Matriz[0][0])+( Matriz[1][1])+( Matriz[2][2]);
         //System.out.println("LA SUMA DE LA DIAGONAL PRINCIPAL " + resultadoD1);
int resultadoD2= ( Matriz[0][2])+( Matriz[1][1])+( Matriz[2][0]);
         //System.out.println("LA SUMA DE LA DIAGONAL SECUNDARIA " + resultadoD2);       

        
if ((resultadoF1==resultadoF2)&&(resultadoF1==resultadoF3) 
&&(resultadoF1==resultadoC1)&&(resultadoF1==resultadoC2)
&&(resultadoF1==resultadoC3)&&(resultadoF1==resultadoD1)
        &&(resultadoF1==resultadoD2))   {
  System.out.println("EL CUBO ES MAGICO " ); 
}
else System.out.println( "NO ES MAAAAAAHICO! "  );    
        
        

}   
}
