package Ejemplo1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Jose Manuel Mendoza Torres 22310349
 */
public class main 
{
    
    public static void main(String[] args)
    {
        int opcion = 0;

        Grafos grafo = new Grafos(5);
        
        pushValues(grafo, 0, 0, 1);
        pushValues(grafo, 0, 1, 1 );
        pushValues(grafo, 0, 2, 1);
        pushValues(grafo, 0, 3, 1);
        pushValues(grafo, 0, 4, 1);
        pushValues(grafo, 1, 1, 1);
        pushValues(grafo, 1, 2, 0);
        pushValues(grafo, 1, 3, 1);
        pushValues(grafo, 1, 4, 0);
        pushValues(grafo, 2, 2, 0);
        pushValues(grafo, 2, 3, 0);
        pushValues(grafo, 2, 4, 1);
        pushValues(grafo, 3, 3, 0);
        pushValues(grafo, 3, 4, 0);
        pushValues(grafo, 4, 4, 0);
        
        System.out.println("\nGrafo 1");
        grafo.printGrafo();
        
        pushValues(grafo, 0, 0, 0);
        pushValues(grafo, 0, 1, 1 );
        pushValues(grafo, 0, 2, 1);
        pushValues(grafo, 0, 3, 0);
        pushValues(grafo, 0, 4, 1);
        pushValues(grafo, 1, 1, 0);
        
        System.out.println("\nGrafo 2");
        grafo.printGrafo();
        
        pushValues(grafo, 2, 2, 0);
        pushValues(grafo, 2, 3, 0);
        pushValues(grafo, 2, 4, 1);
        pushValues(grafo, 3, 3, 0);
        pushValues(grafo, 3, 4, 0);
        pushValues(grafo, 4, 4, 0);
        
        System.out.println("\nGrafo 3");
        grafo.printGrafo();
        
        pushValues(grafo, 0, 0, 1);
        pushValues(grafo, 0, 1, 1);
        pushValues(grafo, 0, 2, 0);
        pushValues(grafo, 0, 3, 1);
        pushValues(grafo, 0, 4, 1);
        pushValues(grafo, 1, 1, 0);
        pushValues(grafo, 1, 2, 0);
        pushValues(grafo, 1, 3, 0);
        pushValues(grafo, 1, 4, 1);
        pushValues(grafo, 2, 2, 1);
        pushValues(grafo, 2, 3, 1);
        pushValues(grafo, 2, 4, 0);
        pushValues(grafo, 3, 3, 0);
        pushValues(grafo, 3, 4, 1);
        pushValues(grafo, 4, 4, 0);
        
        System.out.println("\nGrafo 4");
        grafo.printGrafo();
        
        pushValues(grafo, 2, 2, 1);
        pushValues(grafo, 2, 3, 0);
        pushValues(grafo, 2, 4, 1);
        pushValues(grafo, 3, 3, 0);
        pushValues(grafo, 3, 4, 1);
        pushValues(grafo, 4, 4, 0);
        
        System.out.println("\nGrafo 5");
        grafo.printGrafo();
    }

    public static void pushValues(Grafos grafo, int fila, int columna, int dato)
                                  
    {
        grafo.setMatrizValue(fila, columna, dato);
    }
}

    class Grafos
{
        private int matriz[][];
    
        public Grafos(int size){
        matriz = new int[size][size];
    }
    
    public void setMatrizValue(int fila, int columna, int dato)
    {
        matriz[fila][columna] = dato;
        matriz[columna][fila] = dato;
    }
    
    public void printGrafo()
    {
        for(int a = 0; a<matriz.length;a++)
        {
            for(int b = 0; b<matriz.length;b++)
            {
                System.out.print(matriz[a][b]);
            }
            
            System.out.println();
        }
    }
}


