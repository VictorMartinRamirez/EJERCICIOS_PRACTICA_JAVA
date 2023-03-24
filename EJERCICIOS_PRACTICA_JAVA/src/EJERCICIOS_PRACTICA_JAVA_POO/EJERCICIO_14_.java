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

public class EJERCICIO_14_ {
public static void main( String [] args){  
/* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.*/


int valor = 0  ;

Scanner ejerc14 =new Scanner (System.in);
Scanner ejerc14b =new Scanner (System.in);

System.out.println( "ingrese un valor límite positivo, ");
int ValorLim = ejerc14.nextInt();

do {
System.out.println("ingrese un valor ");
int ValorAsumar = ejerc14b.nextInt();
valor = (valor + ValorAsumar) ;
}
while (valor< ValorLim) ;

}


}