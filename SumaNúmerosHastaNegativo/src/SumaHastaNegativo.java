import java.util.Scanner;		//IMPORTAR SCANNER
public class SumaHastaNegativo {

	public static void main(String[] args) {
				//AVISO
		System.out.println("Este programa sumar� n�meros hasta que se introduzca uno negativo.");
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		double suma = 0;		//CREAR SUMA
		double x=0;		//CREAR X
		while (x >= 0) {		//MIENTRAS X SEA POSITIVO
			suma = suma + x;		//SUMAR X AL VALOR ANTERIOR DE SUMA
			System.out.print("Introduzca un n�mero: ");		//SOLICITA ELEMENTO
			x = teclado.nextDouble();		//ALMACENAR VALOR EN X
			
			/*NOTA: SI ESCRIBIMOS EL PROGRAMA AL REV�S,
			 * PIDIENDO PRIMERO EL N�MERO Y DESPU�S SUM�NDOLO,
			 * DEJAR�A DE FUNCIONAR, PORQUE SUMAR�A EL �LTIMO VALOR (EL NEGATIVO)
			 * A LA SUMA, ESTROPEANDO EL RESULTADO.
			 * 
			 * SUPONIENDO QUE NO HAYA QUE SUMAR EL VALOR NEGATIVO.
			 */
			 
		}
		System.out.printf("Se ha introducido el n�mero %f, es negativo. La suma hasta entonces ha sido %f.", x,suma);
				//OUTPUT
	}

}
