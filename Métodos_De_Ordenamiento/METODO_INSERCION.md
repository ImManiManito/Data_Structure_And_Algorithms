METODO INSERSCIÓN

El método inserción, a diferencia de otros tipos, pasa a través de la matriz sólo una vez. La inserción obra en gran parte de la misma
manera que organizar una mano de cartas. Usted recoge las cartas sin clasificar una a la vez. A medida que toma cada tarjeta, se 
inserte en su posición correcta en su parte ortanizada de tarjetas.

Se divide una serie de dos sub-arrays (sub arreglos). El primer subconjunto esta ordenados y se hace más grande con e elemento que sigue.
El segundo subconjunto esta sin clasificiar y contiene todos los elementos que aún no se inserta en el primer subconjunto. El segundo subconjunto
recibe el valor más pequeo como elemento a colocar en el lugar correcto del primer subconjunto.


![1 Ordenamiento](https://github.com/ImManiManito/Investigation_of_Ordering_Methods/assets/160420003/eee48cc8-3713-488d-96a1-d52d25db2e77)


El algoritmo mantiene los dos subconjuntos dentro de la misma matriz. Cuando el metodo empieza, el primer elemento en la matriz se considera el 
"ordenado array". Con cada iteración del bucle, el siguiente valor en  sección sin clasificar, se coloca en su posición correcta en la sección
clasificados.

    public class Insercion {

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Arreglo original:");
        imprimirArray(array);

        ordenarInsercion(array);

        System.out.println("\nArreglo ordenado:");
        imprimirArray(array);
    }

    // Método para imprimir el contenido de un array
    static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Método para realizar el ordenamiento por inserción
    static void ordenarInsercion(int[] array) {
        int n = array.length;

        // Itera a través de toda la lista
        for (int i = 1; i < n; i++) {
            // Elemento a ser insertado en la lista ordenada
            int elementoActual = array[i];
            int j = i - 1;

            // Mueve los elementos mayores que el elemento actual a una posición adelante
            while (j >= 0 && array[j] > elementoActual) {
                array[j + 1] = array[j];
                j--;
            }

            // Inserta el elemento actual en la posición correcta
            array[j + 1] = elementoActual;
        }
    }
    }

Un segundo ejemplo es el siguiente:


![2 Inserción](https://github.com/ImManiManito/Investigation_of_Ordering_Methods/assets/160420003/a0566cc9-1050-4efa-bb1b-e0a6f86d20ce)


