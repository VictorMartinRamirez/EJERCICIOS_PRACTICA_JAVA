/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_PRACTICA_JAVA_POO;
import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author VICTOR MARTIN RAMÍREZ
 */
public class EJERCICIO_06 {
 public static void main(String[] args) {
/* Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
 
Scanner ejerc6 = new Scanner(System.in);  

System.out.println( "Ìngrese un número entero" );
double numero= ejerc6.nextInt();
double doble = numero *2 ;
double triple = numero *3 ;
double Rcuadrada = sqrt(numero);
System.out.println( " el doble del numero entero ingresado es " + doble);
System.out.println( " el triple del numero entero ingresado es " + triple) ;
System.out.println( " la raiz cuadrada del numero entero ingresado es " + Rcuadrada ) ;


}   
}
;