/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_PRACTICA_JAVA_POO;
import java.util.Scanner;
/**
 *
 * @author VICTOR MARTIN RAMÍREZ
 */
public class EJERCICIO_04 {
     public static void main(String[] args) {
//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculaS.

Scanner ejerc4 = new Scanner(System.in);

System.out.println(" Ingrese una frase ");
      String frase  = ejerc4.nextLine();
        
System.out.println (" la frese em minuscula es " + frase.toLowerCase());
System.out.println ( " la frese em mayuscula es " + frase.toUpperCase() );
}
}