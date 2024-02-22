# Investigation_of_Ordering_Methods
Investigación sobre los métodos de ordenamiento 

METODO BURBUJA

Basada en comparar elementos adyacentes de la lista e intercambiar sus valores si están desordenados.


Así se dice que los valores más pequeños burbujen hacia el primer elemetno de la lista, mientras que los valores más grandes se hunden hacia el final de la lista


![1](https://github.com/ImManiManito/Investigation_of_Ordering_Methods/assets/160420003/3910a6af-0f63-4553-9906-ba68ad0b84d8)
![2](https://github.com/ImManiManito/Investigation_of_Ordering_Methods/assets/160420003/3cd4c182-d722-45a9-9aab-8232f00432e1)
![3](https://github.com/ImManiManito/Investigation_of_Ordering_Methods/assets/160420003/e7b10832-a4f3-4b66-8e19-35f73c928804)
![4](https://github.com/ImManiManito/Investigation_of_Ordering_Methods/assets/160420003/9819b04d-c903-4474-b600-cb8631cfcfa8)

Se necesitan 4 pasadas para ordenar una lista
de 5 elementos ⇒ n-1 pasadas para n elementos
- Pasada 1: 4 comparaciones y 3 intercambios
- Pasada 2: 3 comparaciones y 1 intercambio
- Pasada 3: 2 comparaciones y 1 intercambio
- Pasada 4: 1 comparaciones y 1 intercambio

Código:

    public class Burbuja 
    {
        public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo original:");
        imprimirArray(array);

        ordenarBurbuja(array);

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

    // Método para realizar el ordenamiento burbuja
    static void ordenarBurbuja(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // Compara elementos adyacentes y los intercambia si están en el orden incorrecto
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
             }
          }
       }
    }





