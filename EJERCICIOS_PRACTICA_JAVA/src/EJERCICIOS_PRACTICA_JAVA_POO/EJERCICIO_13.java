/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_PRACTICA_JAVA_POO;

import java.util.Scanner;

/**
 *
 * @author viruslt
 */
public class EJERCICIO_13 {
public static void main( String [] args){  
/* Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta
*/
int Calificacion ;
boolean nota = true ;       
Scanner ejerc13 = new Scanner (System.in) ;


{ System.out.println( "ingrese una nota que sea del 0 al 10");
Calificacion = ejerc13.nextInt() ;}

while (nota =true) 

{ 
if ( (Calificacion < 0) || (Calificacion > 10)  ) continue;

if ( (Calificacion > 0) && (Calificacion < 10)  ) break;
}


System.out.println( "se ingreso una nota valida"); 



}
}
    

