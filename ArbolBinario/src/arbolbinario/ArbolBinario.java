package arbolbinario;
/**
 *
 * @author Jose Manuel Mendoza Torres 22310349
 */
public class ArbolBinario {
    
    public Nodo raiz;
    
    public ArbolBinario(){
        raiz = null;
    }
    
    //Método preorden
    public void preorden(Nodo nodo){
        if(nodo == null)
            return;
        
        System.out.println(nodo.valor+"");
        preorden(nodo.izquierdo);
        preorden(nodo.derecho);
    }
    
    void preorden() {
        preorden(raiz);
    }
    
    //Meotdo inorden
    public void inorden(Nodo nodo){
        if(nodo == null)
            return;
        
        System.out.println(nodo.valor+"");
        inorden(nodo.izquierdo);
        inorden(nodo.derecho);       
    }
    
    void inorden() {
        inorden(raiz);
    }
    
    public void postorden (Nodo nodo){
        if(nodo == null)
            return;
        
        System.out.println(nodo.valor+"");
        postorden(nodo.derecho);
        postorden(nodo.izquierdo);       
    }
    
    void postorden() {
        postorden(raiz);
    }
    
  
}
