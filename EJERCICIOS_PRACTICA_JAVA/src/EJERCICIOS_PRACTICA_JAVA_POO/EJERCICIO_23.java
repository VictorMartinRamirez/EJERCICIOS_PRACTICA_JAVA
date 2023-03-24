/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_PRACTICA_JAVA_POO;
/**
 * @author VICTOR MARTIN RAMÍREZ
 */
import java.util.Scanner ;


public class EJERCICIO_23 {
public static void main (String[] args){   
/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido*/

int valor=0 , cont=0, numero=0,i,tamaño;

Scanner ejerc23 =new Scanner (System.in);
System.out.println( "INGRESE EL TAMAÑO DEL VECTOR ");
tamaño = ejerc23.nextInt();


int vector[] = new int [tamaño];


for ( i = 0; i < vector.length; i++) 
{
numero = (int) (Math.random()*100);
//La funcion(metodo) matematica "aleatorio", devuelve valores entre 
//0 y 0,9 por ello los multiplicadores luego de la funcion

//System.out.println( " SE ELIGIO AL AZAR EL NUMERO " + numero );

vector[i]= (numero) ;
//System.out.println(vector [i] + " OCUPARA EL  LUGAR " + i  );
}

Scanner ejerc23B =new Scanner (System.in);
System.out.println( "ELIGIA UN NUMERO AL AZAR ENTRE 0 Y 100" );
valor = ejerc23.nextInt();

for ( i = 0; i < vector.length; i++)
if (valor == vector[i]){
 
 System.out.println( valor + " ESTA EN EL LUGAR " + i)   ;
}  else cont++; {
if ( cont == vector.length) {
System.out.println( valor + " NO ESTA EN EL VECTOR ")   ;
}
}
    
}
}  

