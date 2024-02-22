package listas_enlazadas;

public class Lista 
{
    /*
        Declaramos variables del tipo Nodo se que se puede realizar asi 
        public Nodo inicio, fin;
        Pero igual para que quede astetic jaja
    */
    
    public Nodo inicio;
    public Nodo fin;
    
   public Lista(){
       inicio = null;
       fin = null;
   }
   
   //Metodo para saber si la lista esta vacia
   public boolean estaVacia()
   {
       if(inicio==fin){
           return true;
       }else{
           return false;
       }
   }
   
   //Metodo para agregar un nodo al inicio de la lista
   public void agregarInicio (int elemento)
   {
       inicio = new Nodo (elemento, inicio);
       if(fin==null){
           fin=inicio;
       }
   }
   
   //Metodo para mostrar los datos
   public void mostrarLista()
   {
      Nodo recorrer = inicio;
       System.out.println("");
       while(recorrer!=null)
       {
           System.out.println("["+recorrer.dato+"]-->");
           recorrer = recorrer.siguiente;
       }
   }
   
   //Metodo para agregar al final
   public void agregarFinal (int elemento)
   {
       if(!estaVacia()){
           fin.siguiente = new Nodo (elemento);
           fin = fin.siguiente;
       }else{
            inicio = fin = new Nodo (elemento);
       }
   }
   
   //Metodo para eliminar del inicio
   public int borrarInicio()
   {
       int elemento = inicio.dato;
       if(inicio==fin){
           inicio = null;
           fin = null;
       }else{
           inicio = inicio.siguiente;
       }
       return elemento;
   }
   
   //Metodo para buscar un elemento
   public boolean buscarElemento(int elemento)
   {
       Nodo temporal = inicio;
       while(temporal!=null&& temporal.dato!=elemento){
           temporal=temporal.siguiente;
       }
       return temporal != null;
   }
}
