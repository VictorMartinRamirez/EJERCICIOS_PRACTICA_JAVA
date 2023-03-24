

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
public class EJERCICIO_08 {
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
//Crear un programa que dado un numero determine si es par o impar.
Scanner ejerc8 = new Scanner(System.in);
    
System.out.println( "Ìngrese un número entero" );
int numero = ejerc8.nextInt();

if ( numero%2 ==0 ) {
 System.out.println("El numero " + numero + " ES PAR");
}
else { System.out.println("El numero " + numero + " ES IMPAR");

}
}
}

