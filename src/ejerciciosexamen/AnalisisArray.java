package ejerciciosexamen;

/**
 * Programa que analiza un array de enteros.
 * <p>
 * Muestra por pantalla si el valor máximo del array se repite más de una vez
 * ("SI"/"NO"), calcula la media y evalúa si es "BIEN" (media >= 5) o "MAL"
 * (media < 5).
 * </p>
 */

public class AnalisisArray {
	/**
	 * Punto de entrada del programa. Usa un array de ejemplo y muestra:
	 * <ul>
	 * <li>"SI" si el valor máximo se repite más de una vez; en caso contrario
	 * "NO".</li>
	 * <li>La media del array.</li>
	 * <li>"BIEN" si la media es mayor o igual que 5; en caso contrario "MAL".</li>
	 * </ul>
	 *
	 * @param args argumentos de línea de comandos (no se utilizan).
	 */
	private static final int UMBRAL_MEDIA = 5;

	public static void main(String[] args) {

		int[] numeros = { 5, 7, 3, 7, 2, 9, 7 };
		int repeticionesMaximo = 0;

		// Obtiene el valor máximo de array
		int maximo = obtenerMaximo(numeros);

		// Cuenta cuántas veces aparece el valor máximo (el número mayor) y lo guarda en
		// a
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == maximo) {
				repeticionesMaximo++;
			}
		}

		// Si se repite más de 1 vez, imprime por pantalla "SI"
		boolean maximoSeRepite = (repeticionesMaximo > 1);
		if (maximoSeRepite) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

		// Suma el valor de todos los huecos del array
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}

		// Saca la media de todos los huecos del array e imprime el valor
		double media = (double) suma / numeros.length;
		System.out.println(media);

		// Si la media es mayor o igual a 5 imprime por pantalla "BIEN"
		if (media >= UMBRAL_MEDIA) {
			System.out.println("BIEN");
		} else {
			System.out.println("MAL");
		}
	}

	// Método para calcular el máximo
	private static int obtenerMaximo(int[] numeros) {
		int maximo = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maximo) {
				maximo = numeros[i];
			}
		}
		return maximo;
	}

}
