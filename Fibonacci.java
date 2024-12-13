
import java.util.Scanner;
public class Fibonacci {
	public static void main (String[] args) {
		System.out.println("*** Programa para generar elementos de la serie Fibonacci ***");

		// Instanciación de Objetos
		Scanner scan=new Scanner(System.in);
		
		// Validación, Entrada y Lectura de Datos
		int n;
		do {
			System.out.print("Introduzca un número entero positivo: ");
			n=scan.nextInt();
			if (n<0) {
				System.out.println("¡No está permitido números negativos o nulo para este programa!");
			}
		} while (n<0);

		// Inicialización de variables
		int ant=1;
		int act=0;
		int fib;
		int i;
		
		// Cálculo
		for (i=1;i<=n;i++) {
			fib=ant+act;
			// Salida, Escritura de Datos
			if (i<n) {
				System.out.print(fib+", ");
			} else {
				System.out.println(fib+".");
			}
			ant=act;
			act=fib;
		}
		scan.close();
		System.out.println("*** El Programa ha finalizado ***");
	}
}

