package listas_enlazadas;

public class Nodo 
{
    public int dato;
    public Nodo siguiente; 
    
    public Nodo (int d) 
    {
        this.dato = d;
    }
    
    public Nodo (int d, Nodo n)
    {
        dato = d;
        siguiente = n;
    }

    public int getDato() 
    {
        return dato;
    }

    public void setDato(int dato) 
    {
        this.dato = dato;
    }

    public Nodo getSiguiente() 
    {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) 
    {
        this.siguiente = siguiente;
    }
    
}

