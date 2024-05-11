package avance_algoritmo_dijklstra;
import java.util.*;
/**
 *
 * @author Jose Manuel Mendoza Torres 22310349 4P
 */
public class Avance_Algoritmo_Dijklstra {
    
    public int distancia[] = new int [255]; //vector para almacenr distancias
    public static int costo[][] = new int [10][10]; //matriz cuadrada
    
    //Metodo para calcular la distancia más corta
    public void calc(int nodo, int origen){
        int flag[] = new int [nodo+1];
        int i, k, c, minimo;
        int minposition = 1;
        
        //le llevamos al vector distancia la primera fila de la matriz
        for (i = 1; i <=nodo; i++){
            flag[i] = 0;
            this.distancia[i] = this.costo[origen][i]; //inicio de la matriz [1][1]=()
        }
        
        c = 2;
        while (c <= nodo){
            minimo = 99;
            for (k = 1; k<=nodo; k++){
                if (this.distancia[k] < minimo && flag[k] !=1){
                    minimo = this.distancia[i];
                    minposition = k;
                }
            }
            flag[minposition]= 1;
            c++;
            
            for(k=1; k<=nodo; k++){
            if (this.distancia[minposition] + this.costo[minposition][k] < 
                    this.distancia[k] && flag[k] !=1){
                this.distancia[k] = this.distancia[minposition]+ this.costo[minposition][k];
                }
            }
        }
    }     
        public static void main(String args[]){
        int nodos,origen,i,j;

        Scanner in = new Scanner(System.in);
        System.out.println("Inserte el numero de nodos: \n");
        nodos = in.nextInt();
        Avance_Algoritmo_Dijklstra m = new Avance_Algoritmo_Dijklstra();
        System.out.println("Inserte los pesos de la matriz: \n");  
        //llenamos la matriz
        for(i=1;i<=nodos;i++)
            for(j=1;j<=nodos;j++){;
                m.costo[i][j]=in.nextInt();//almacenmos cada peso fila por fila
                if(m.costo[i][j]==0)
                    m.costo[i][j]=99;
            }
        System.out.println("Inserte el vertice de origen: ");
        origen = in.nextInt();
        
        m.calc(nodos,origen);
        System.out.println("El camino mas corto es: \t"+origen+"\t Todos los demas vertices son: \n");
        for(i=1;i<=nodos;i++)
            if(i!=origen)
                 System.out.println("Fuente :"+origen+"\t destino :"+i+"\t CostoMin :"+m.distancia[i]+"\t");
        
            System.out.println("mostrando la matriz costo: ");
            //mostrando la matriz costo
            for(i = 0; i <= nodos; i++){
                for(j = 0; j<= nodos; j++){
                    System.out.println(costo[i][j]+"\t");
                }
                System.out.println("");
            }
        
    }
}   
