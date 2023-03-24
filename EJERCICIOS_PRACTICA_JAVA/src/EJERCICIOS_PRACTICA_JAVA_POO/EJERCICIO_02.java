/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_PRACTICA_JAVA_POO;
import java.util.Scanner;
/**
 * @author VICTOR MARTIN RAMÍREZ
 */
public class EJERCICIO_02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /* Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma  */
    
 
 Scanner ejerc2 = new Scanner(System.in); // Creamos el Scanner     
            
 
 
    System.out.println("Ingrese un primer numero entero");
        int num1 = ejerc2.nextInt(); // Leer un entero y lo asignamos a una variable
    
    System.out.println("Ingrese un segundo numero entero");
        int num2 = ejerc2.nextInt(); // Leer un entero y lo asignamos a una variable
    
    int suma = num1 + num2 ;
    System.out.println( "La suma de los dos numeros ingresados es " + suma);
    }
    
}
