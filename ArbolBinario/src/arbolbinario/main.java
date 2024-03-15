package arbolbinario;
/**
 *
 * @author Jose Manuel Mendoza Torres
 */
public class main {
    
    public static void main(String[] args) {
        
        ArbolBinario arbol = new ArbolBinario();
        
        arbol.raiz = new Nodo(1);
        arbol.raiz.izquierdo = new Nodo(2);
        arbol.raiz.derecho = new Nodo(3);
        arbol.raiz.izquierdo.izquierdo = new Nodo(4);
        arbol.raiz.izquierdo.derecho = new Nodo(5);

        System.out.println("Recorrido preorden del árbol binario:");
        arbol.preorden();

        System.out.println("\nRecorrido inorden del árbol binario:");
        arbol.inorden();

        System.out.println("\nRecorrido postorden del árbol binario:");
        arbol.postorden();
    }
}
