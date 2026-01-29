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

	public static void main(String[] args) {

		int[] n = { 5, 7, 3, 7, 2, 9, 7 };
		int a = 0;
		int b = 0;
		int c = n[0];

		// Guarda en c el número mayor del array
		for (int i = 1; i < n.length; i++) {
			if (n[i] > c) {
				c = n[i];
			}
		}

		// Cuenta cuántas veces aparece c (el número mayor) y lo guarda en a
		for (int i = 0; i < n.length; i++) {
			if (n[i] == c) {
				a++;
			}
		}

		// Si se repite más de una vez, cambia b de 0 a 1
		if (a > 1) {
			b = 1;
		}

		// Si se repite más de 1 vez, imprime por pantalla "SI"
		if (b == 1) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

		// Suma en s el valor de todos los huecos del array
		int s = 0;
		for (int i = 0; i < n.length; i++) {
			s += n[i];
		}

		// Saca la media de todos los huecos del array e imprime el valor
		double r = (double) s / n.length;
		System.out.println(r);

		// Si la media es mayor o igual a 5 imprime por pantalla "BIEN"
		if (r >= 5) {
			System.out.println("BIEN");
		} else {
			System.out.println("MAL");
		}
	}
}
