package arbolbinario;
/**
 *
 * @author Jose Manuel Mendoza Torres 22310349
 */
public class Nodo {

    int valor;
    Nodo izquierdo, derecho;
    
    public Nodo(int item){
        valor = item;
        izquierdo = derecho = null;
    }
}