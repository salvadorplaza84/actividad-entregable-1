# Refactorización - Actividad entregable 1

## Objetivo
Mejorar la legibilidad y el mantenimiento del código sin cambiar su funcionalidad.

## Salida esperada (antes y después)
NO
5.714285714285714
BIEN

## Cambios realizados
1. Renombrado de la clase `p` a `AnalisisArray` y reorganización del código en `src/` para seguir una estructura estándar.
2. Renombrado de variables para mejorar la legibilidad (nombres descriptivos en lugar de letras sueltas).
3. Sustitución de un “flag” numérico por un boolean (`maximoSeRepite`) para expresar mejor la intención.
4. Creación de la constante `UMBRAL_MEDIA` para eliminar el número mágico 5.
5. Extracción de métodos para mejorar modularidad y reutilización:
   - `obtenerMaximo(int[] numeros)`
   - `contarApariciones(int[] numeros, int valor)`
   - `calcularMedia(int[] numeros)`
6. Eliminación de código duplicado en `main` (el cálculo de la suma/media queda encapsulado en `calcularMedia`).
7. Añadido de Javadoc a los métodos para mejorar la documentación interna.

## Justificación
- Los nombres descriptivos hacen el código más fácil de entender y mantener.
- Un boolean expresa mejor una condición (verdadero/falso) que un entero 0/1.
- Las constantes evitan números “mágicos” y facilitan cambios futuros en un único punto.
- Extraer métodos reduce la complejidad del `main`, mejora la modularidad y permite reutilizar lógica sin duplicar código.
- Documentar métodos con Javadoc facilita el mantenimiento y el uso del código por otras personas.

