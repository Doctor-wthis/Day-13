
import lib.bools;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("*** Programa para Generar Números Primos ***");
		
		// Instanciación de objetos //
		Scanner scan=new Scanner(System.in);
		bools sies=new bools();

		// Validación, Lectura de Datos
		int n;
		do {
			System.out.print("Introduzca la cantidad de números primos que desee generar: ");
			n=scan.nextInt();
			if (n<=0) {
				System.out.println("No está permitido los números negativos o nulo para este programa");
			}
		} while (n<=0);

		// Inicialización de variables
		int i;
		boolean primo;
		int j=0;
		
		// Repetir n veces
		for (i=1;i<=n;i++) {
			do {
				j++;
			} while (sies.Primo(j)==false);
			// Salida, Escritura de Datos
			if (i<n) {
				System.out.print(j+", ");
			} else {
				System.out.println(j+".");
			}
		}
		
		// Finalización
		scan.close();
		System.out.println("*** El Programa ha finalizado ***");
	}
}

