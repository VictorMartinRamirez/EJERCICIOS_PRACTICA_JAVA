/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_PRACTICA_JAVA_POO;
import java.util.Scanner;
/*
 * @author VICTOR MARTIN RAMÍREZ
 */
public class EJERCICIO_03 {
 public static void main(String[] args) {
// Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla


Scanner ejerc3 = new Scanner(System.in); // Creamos el Scanner 


System.out.println("Ingrese su nombre");
        String nombre  = ejerc3.nextLine(); //Lee una cadena y lo asignamos a la variable

System.out.println(nombre);      
 }
}
