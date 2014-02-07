/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {
 		
		int num2=0;
		int num1=0;
		
		num1=Integer.parseInt(args[0].toString());
		num2=Integer.parseInt(args[1].toString());

	System.out.println("limites: "+args[0]+" "+args[1]);

for(num1=(num1+1);num1<num2;num1++)
{


	
         System.out.println("numero actual es:"+num1 );


      }
   }

}