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
public class EJERCICIO_13_ {
public static void main (String[] args){
/* Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta */
Scanner Ejerc13 = new Scanner(System.in);
int Nota;


 do {
System.out.println( "ingrese una nota valida" );
Nota = Ejerc13.nextInt();
 }
  
 while( (Nota < 1) || ( Nota > 10) ) ;
 
System.out.println( "La nota es valida" );   
}        
}
