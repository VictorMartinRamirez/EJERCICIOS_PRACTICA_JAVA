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
public class EJERCICIO_07 {
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
// Implementar un programa que dado dos números enteros determine cuál es el mayor y lo muestre por pantalla
Scanner ejerc7 =new Scanner(System.in) ;
 
System.out.println(" Ingrese un numero entero");
int numero1 = ejerc7.nextInt();
System.out.println(" Ingrese el segundo numero entero");
int numero2 = ejerc7.nextInt ();

if (numero1 <numero2) {
    System.out.println(" El numero mayor es "+ numero2);
} else { System.out.println(" El numero mayor es "+ numero1);
}

}   
}
