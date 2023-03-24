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

public class EJERCICIO_24 {
public static void main( String [] args){  
    
/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos)*/
int valor=0,cont=0,numero=0,i,tamaño,contI=0,contII=0,contIII=0,contIV=0,contV=0          ;

Scanner ejerc24 =new Scanner (System.in);
System.out.println( "INGRESE EL TAMAÑO DEL VECTOR ");
tamaño = ejerc24.nextInt();


int vector[] = new int [tamaño];

for ( i = 0; i < vector.length; i++) 
{
//La funcion(metodo) matematica "aleatorio", devuelve valores entre 
//0 y 0,9 por ello los multiplicadores luego de la funcion
numero = (int) (Math.random()*10000);

vector[i]= (numero) ;
System.out.println(vector [i] + " OCUPARA EL  LUGAR " + i  );
}

for ( i = 0; i < vector.length; i++)

if((vector[i] > 0) && (vector[i] <= 9))
{System.out.println(vector[i]+ " EL NUMERO ES DE UN DIGITO");
contI++ ;
System.out.println("LA CANTIDAD DE NUMEROS DE UN DIGITO ES " + contI);
}
else {
if((vector[i] > 9 ) && (vector[i] <= 99))
 {System.out.println(vector[i]+ " EL NUMERO ES DE DOS DIGITO");
 contII++ ;
 System.out.println("LA CANTIDAD DE NUMEROS DE DOS DIGITO ES " + contII);
}
 else {
if((vector[i] > 99) && (vector[i] <= 999)){
System.out.println(vector[i]+ " EL NUMERO ES DE TRES DIGITO");
 contIII++ ;
System.out.println("LA CANTIDAD DE NUMEROS DE TRES DIGITO ES " + contIII);
}
else {
if((vector[i] > 999) && (vector[i] <= 9999)){
System.out.println( vector[i] + " EL NUMERO ES DE CUATRO DIGITO");
contIV++ ;
System.out.println("LA CANTIDAD DE NUMEROS DE CUATRO DIGITO ES " + contIV);
}
else {
if((vector[i] > 9999) && (vector[i] <= 99999)){
System.out.println( vector[i] + " EL NUMERO ES DE CINCO DIGITO");
contV++ ;
System.out.println("LA CANTIDAD DE NUMEROS DE CINCO DIGITO ES " + contV);
}
}}}}


}
}
