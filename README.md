# ejercicio 3 - 

Excepciones, E/S con ficheros de tipo texto.
Implementar una clase con un método de clase (static) que a partir de la lectura de un fichero de texto cuya ruta es pasada como parámetro y en el que en cada línea hay un número entero menor que 1000 devuelva la media aritmética de los números leídos. Además, hay que tener en cuenta las siguientes condiciones:
1. Cualquier excepción de E/S o de formato de número se debe capturar (catch) y relanzar como una excepción “FileParsingException” con el mismo mensaje que arrojaba la excepción capturada.
2. Si algún número es mayor que 1000 se debe lanzar una excepción “BigNumberException” indicando en el mensaje de salida de la excepción el número de línea en el que se encontró el número mayor que 1000.
3. Se debe garantizar que el fichero queda cerrado antes de terminar el método.
A partir de esa clase, implementar un programa al que pasándole como primer (y único) argumento de entrada la ruta al fichero con los números imprima por consola la media aritmética de los números contenidos en el fichero. Cualquier excepción se mostrará por la salida estándar de error.


## Installation
Ejecutar simplemente.