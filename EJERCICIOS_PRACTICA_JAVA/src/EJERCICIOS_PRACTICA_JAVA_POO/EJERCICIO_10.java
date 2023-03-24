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

public class EJERCICIO_10 
{
public static void main( String [] args){  
/* Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga
“CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/

Scanner ejerc10 =new Scanner (System.in);
System.out.println( "ingrese una frase ");
String frase = ejerc10.next();

 if ( frase.length()==8)
{
System.out.println ("CORRECTO") ; 
System.out.println ( "la frase " + frase + " tiene " + frase.length() + " caracteres") ; 
}    
else { 
        System.out.println( "INCORECTO" ); }
}
}
