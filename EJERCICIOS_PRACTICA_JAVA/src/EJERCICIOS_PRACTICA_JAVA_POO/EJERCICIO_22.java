
package EJERCICIOS_PRACTICA_JAVA_POO;
/**
 * @author VICTOR MARTIN RAMÍREZ
 */
public class EJERCICIO_22 {
public static void main (String[] args){  
    
/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.  */ 


int i=0;
int vector[] = new int [100];

for ( i = 0; i < vector.length; i++) 
{
vector[i] =(99-i) ;
System.out.println(vector [i] + " En el lugar " + i  );
}

}
}
