/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_PRACTICA_JAVA_POO;
import java.util.Scanner;
/**
@author VICTOR MARTIN RAMÍREZ
 */
public class EJERCICIO_05 {
     public static void main(String[] args) {
         
/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */  

Scanner ejerc5 = new Scanner(System.in);

System.out.println ( "ingrse la temperatura en grados centigrados" )  ;
    
double GradosCentigrados  = ejerc5.nextDouble() ;
        
  double Fahrenheit = 32 + (9 * GradosCentigrados / 5);     
        
  System.out.println ( "la temperatura en grados Fahrenheit es " + Fahrenheit) ;     
}
}