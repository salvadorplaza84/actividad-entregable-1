# Refactorización - Actividad entregable 1

## Objetivo
Mejorar la legibilidad y el mantenimiento del código sin cambiar su funcionalidad.

## Salida esperada (antes y después)
NO
5.714285714285714
BIEN

## Cambios realizados
1. Renombrado de variables para mejorar la legibilidad (nombres descriptivos en lugar de letras sueltas).
2. Sustitución de un “flag” numérico por un boolean (`maximoSeRepite`) para expresar mejor la intención.
3. Creación de la constante `UMBRAL_MEDIA` para eliminar el número mágico 5.
4. Reordenación del cálculo de `maximoSeRepite` para que se evalúe después de contar las repeticiones.

## Justificación
- Los nombres descriptivos hacen el código más fácil de entender y mantener.
- Un boolean expresa mejor una condición (verdadero/falso) que un entero 0/1.
- Las constantes evitan números “mágicos” y facilitan cambios futuros en un único punto.
- El reordenamiento asegura que la condición se calcule con datos ya actualizados sin cambiar la funcionalidad del programa.

