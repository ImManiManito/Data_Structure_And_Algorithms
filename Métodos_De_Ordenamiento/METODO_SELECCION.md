METODO POR SELECCION

El método de selección es una combinación de búsqueda y ordenamiento.

Durante cada paso, se busca el elemento de menor o mayor valor y se mueve a su posición correcta en la matriz. El número de veces que el tipo
pasa a través de la lista es una menos que el número de elementos en la matriz. En el método de selección, el ciclo interior se encarga de 
encontrar e mas pequeño o mayor valor, el ciclo exterior ubica el elemento en el lugar correcto.


![1 Selección](https://github.com/ImManiManito/Investigation_of_Ordering_Methods/assets/160420003/d81c0295-05ab-46a8-a517-4228d0e21fc0)

    public class Seleccion {

        public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Arreglo original:");
        imprimirArray(array);

        ordenarSeleccion(array);

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

        // Método para realizar el ordenamiento por selección
        static void ordenarSeleccion(int[] array) {
        int n = array.length;

        // Itera a través de toda la lista
        for (int i = 0; i < n-1; i++) {
            // Encuentra el índice del elemento mínimo en la parte no ordenada
            int indiceMinimo = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Intercambia el elemento mínimo con el primer elemento de la parte no ordenada
            int temp = array[indiceMinimo];
            array[indiceMinimo] = array[i];
            array[i] = temp;
        }
    }
    }  

