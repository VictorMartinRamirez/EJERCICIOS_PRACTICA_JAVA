/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_PRACTICA_JAVA_POO;
/*
@author VICTOR MARTIN RAMÍREZ
*/
import java.util.Scanner ;
        
public class EJERCICIO_12 {
public static void main( String [] args){   
/* Considera que estás desarrollando una web para una empresa que fabrica motores
(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
existe un valor válido para tipo de bomba” */

Scanner ejerc12 = new Scanner (System.in) ;
System.out.println( "ingrese un valor del 1 al 4 segun sea el motor");
int tipoMotor = ejerc12.nextInt();

 //if (tipoMotor <=4 && tipoMotor <=1) {  
 // descomentando la linea 33 y la linea 53 se puede hacer sacando el caso default del switch
 
 
switch (tipoMotor)
{
 case 1:
 System.out.println ("La bomba es una bomba de agua");
 break;
 case 2:
 System.out.println ("La bomba es una bomba de gasolina");
 break;
 case 3:
 System.out.println ("La bomba es una bomba de hormigón") ;  
 break;
 case 4:
 System.out.println ("La bomba es una bomba de pasta alimenticia") ;
 break;
 default:
 System.out.println ("No existe un valor válido para tipo de bomba") ;
 break; 
 
} 


//} else {System.out.println ("No existe un valor válido para tipo de bomba") ;}

}
}