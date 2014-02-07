/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Se ingresara un numero, el programa debe iterar desde cero hasta ese numero y mostrar el mensaje
Flip si el numero es divisible dentro de 3
Flop si el numero es divisible dentro de 5
FlipFlop si el numero es divisible dentro de 3 y 5
y si no cumple ninguna de estas condiciones, solo mostrar el valor de ese numero.
*/

public class FlipFlop {   

   public static void main(String[] args) {
   		int numeroActual = 0;
		int x = 0;	
			
		numeroActual = Integer.parseInt(args[0].toString());
 		
		while(x<numeroActual)
		{
			if ((x%3==0) && (x%5==0)) {
				System.out.println("FlipFlop"+x);
			}
			else if(x%5==0) {
				System.out.println("Flop"+x);
			}
			else if(x%3==0) {
				System.out.println("Flip"+x);
			}
			else {  System.out.println(x);}
		x++;
				
    }
   }
}	
	