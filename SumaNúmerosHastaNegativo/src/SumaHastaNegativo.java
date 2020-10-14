import java.util.Scanner;		//IMPORTAR SCANNER
public class SumaHastaNegativo {

	public static void main(String[] args) {
				//AVISO
		System.out.println("Este programa sumará números hasta que se introduzca uno negativo.");
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		double suma = 0;		//CREAR SUMA
		double x=0;		//CREAR X
		while (x >= 0) {		//MIENTRAS X SEA POSITIVO
			suma = suma + x;		//SUMAR X AL VALOR ANTERIOR DE SUMA
			System.out.print("Introduzca un número: ");		//SOLICITA ELEMENTO
			x = teclado.nextDouble();		//ALMACENAR VALOR EN X
			
			/*NOTA: SI ESCRIBIMOS EL PROGRAMA AL REVÉS,
			 * PIDIENDO PRIMERO EL NÚMERO Y DESPUÉS SUMÁNDOLO,
			 * DEJARÍA DE FUNCIONAR, PORQUE SUMARÍA EL ÚLTIMO VALOR (EL NEGATIVO)
			 * A LA SUMA, ESTROPEANDO EL RESULTADO.
			 * 
			 * SUPONIENDO QUE NO HAYA QUE SUMAR EL VALOR NEGATIVO.
			 */
			 
		}
		System.out.printf("Se ha introducido el número %f, es negativo. La suma hasta entonces ha sido %f.", x,suma);
				//OUTPUT
	}

}
