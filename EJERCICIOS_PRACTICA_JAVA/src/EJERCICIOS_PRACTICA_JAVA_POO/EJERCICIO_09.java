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

public class EJERCICIO_09
{
public static void main( String [] args){
/* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje 
de Correcto, sino mostrará un mensaje de Incorrecto. Nota:investigar la función equals() en Java. */


Scanner ejerc9 =new Scanner (System.in);
System.out.println( "ingrese una frase ");
String frase = ejerc9.next();
//String eureka = "eureka" ;


if (frase.equals("eureka")) 
{System.out.println( "la frase es coincidente");}

else 
{
System.out.println( "la frase NO es coincidente");
}

}
}