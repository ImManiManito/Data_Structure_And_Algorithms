/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listassimples;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ListasSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        int dato;
        
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("-----MENU-----");
            System.out.println("1) Agregar nodo");
            System.out.println("2) Ver nodos");
            System.out.println("3) Borrar nodos");
            System.out.println("4) Ver nodos totales");
            System.out.println("5) Borrar medio");
            System.out.println("6) Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opcion elegida: Agregar nodo: ");
                        dato = scanner.nextInt();
                        lista.agregaralmedio(dato);
                    break;
                case 2:
                    System.out.println("Opcion elegida: Ver nodos");
                        lista.mostrarlista();
                    break;
                case 3:
                    System.out.println("Opcion elegida: Borrar nodos");
                        lista.borrar();
                    break;
                case 4:
                    System.out.println("Ver los nodos totales");
                        System.out.println("Los nodos existentes son: "+lista.totaldenodos());
                    break;
                    
                case 5:
                    int cantidad;
                    
                    cantidad=lista.totaldenodos();
                    
                    if(cantidad <3){
                        System.out.println("No puedo borrar porque solo hay pocos elementos");
                    }
                    else{
                        System.out.println("Borrado...");
                        lista.borrarmedio();
                    }
                    
                    break;
                    
                case 6:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opcion != 6);
    }
    
}
