package listas_enlazadas;
import java.util.Scanner;

public class Menu 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("---BIENVENIDO---");
        System.out.println("1. Agregar Inicio");
        System.out.println("2. Mostrar Datos");
        System.out.println("3. Agregar Final");
        System.out.println("4. Borrar Datos");
        System.out.println("5. Buscar Datos");
        
        System.out.println("POR FAVOR DIGITE UNA OPCION");
        int opcion=scanner.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Ingrese el dato: ");
                        elemento = scan.nextInt();
                    Lista.agregarInicio(elemento); 
                break;
            case 2:
                mostrarLista();
                break;
            case 3:
                agregarFinal();
                break;
            case 4:
                BorrarInicio();
                break;
            case 5:
                buscarElemento();
                break;
        }
    }
 
}
