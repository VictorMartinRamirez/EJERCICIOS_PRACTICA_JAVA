/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_PRACTICA_JAVA_POO;
/*
@author VICTOR MARTIN RAMÍREZ
 */
import java.util.Scanner ;

public class EJERCICIO_11 {
public static void main( String [] args){    
/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java */


Scanner ejerc11 =new Scanner (System.in);
System.out.println( "ingrese una frase ");
String frase = ejerc11.next();

String primLetra =(frase.substring(0, 1)); // Investigar la función Substring
System.out.println (primLetra);


if (primLetra.equals("A")) 
{System.out.println ("CORRECTO"); }
else  { System.out.println ("INCORRECTO") ;}

}
}