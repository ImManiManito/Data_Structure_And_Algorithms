
package listassimples;

public class Lista 
{
    public Nodo inicio; 
    public Lista(){
        inicio = null;
    }
    
    public boolean listaVacia(){
        if(inicio == null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void agregaralmedio (int dato)
    {
        Nodo temporal, valor, siguiente, anterior, nuevo;
        int contador = totaldenodos();
        
        if(listaVacia()){
            nuevo=new Nodo(dato, null);
            inicio=nuevo;
            System.out.println("El nodo se agrego");
        }
        else if(contador <3){
            nuevo=inicio;
            temporal=nuevo;
            while(nuevo!=null){
                temporal=nuevo;
                nuevo=nuevo.getSiguiente();
            }
            valor=new Nodo(dato, null);
            temporal.setSiguiente(valor);
            System.out.println("Se agrego al final del Nodo");
        }
        else{
            
            contador = contador/2;
            anterior = inicio;
            siguiente = inicio;
            for(int i = 1; i<contador; i++){
                anterior = anterior.getSiguiente();
            }
            siguiente = anterior.getSiguiente();
            nuevo = new Nodo(dato, siguiente);
            anterior.setSiguiente(nuevo);
        }
    }
    
    public int totaldenodos(){
        int i = 0;
        Nodo temporal=inicio;
        
        while(temporal!=null){
            i++;
            temporal = temporal.getSiguiente();
        }    
        return i;
    }
    
    public void mostrarlista()
    {
        Nodo temporal;
        if(listaVacia()){
            System.out.println("La lista esta vacia");
        }
        else{
            temporal=inicio;
            while(temporal!=null){   
                System.out.println(temporal.getDato());
                temporal = temporal.getSiguiente();
            }
        }
    }
    
    public void borrar()
    {
        Nodo temporal;
        int i = totaldenodos();
        
        if(listaVacia()){
            System.out.println("La lista esta vacia.");
        }
        else{
            if(i<2){
                inicio = inicio.getSiguiente();
            }
            else{
                temporal = inicio;
                for(int j = 1; j<i-1; j++){
                    temporal = temporal.getSiguiente();
                }
                temporal.setSiguiente(null);
                System.out.println("Se ha borrado el ultimo elemento");
            }

        }
    }
    
    public void borrarmedio() {
    Nodo temp, siguiente;
    int contador;

    contador = totaldenodos();

    if (contador<3) {
        borrar();
    } else {
        temp = inicio;
        for (int i = 1; i < contador / 2; i++) {
            temp = temp.getSiguiente();
        }
        siguiente = temp.getSiguiente();
        temp.setSiguiente(siguiente.getSiguiente());
    }
}
}
