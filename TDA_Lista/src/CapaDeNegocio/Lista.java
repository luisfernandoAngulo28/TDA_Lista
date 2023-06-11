/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeNegocio;

/**
 *
 * @author fernando el 23 Auxiliatura ED1
 */
public class Lista {

    Nodo L;//Cabeza
    int cant;

    public Lista() {
        L = null;
        cant = 0;
    }

    public boolean Vacia() {
        return cant == 0;
    }

    public int cantidad() {
        return cant;
    }

    public String toString() {
        String S = "L->";
        Nodo aux = L;
        while (aux != null) {
            S = S + "[" + aux.getDato() + "| ]->";
            aux = aux.getEnlace();
        }
        return S + "null";

    }

    //para recorer una lista se usa     Nodo aux=L; while (aux!=null)
    //para cambio de nodo o enlace aux=aux.getEnlace();
    public void insertar(int elemento) {
        if (Vacia()) {
            Nodo p = new Nodo(elemento);
            L = p;
            cant++;
        } else {//esta parte es para ubicarnos en donde insertar
            Nodo act = L;
            Nodo ant = null;
            while (act != null && (act.getDato() <= elemento)) {
                ant = act;
                act = act.getEnlace();
            }
            //si insertamos en la cabeza
            if (ant == null) {
                Nodo p = new Nodo(elemento);
                p.setEnlace(L);
                L = p;
                cant++;
            } else {//si insertamos en cuerpo
                if (ant.getDato() != elemento) {
                    Nodo p = new Nodo(elemento);
                    ant.setEnlace(p);
                    // p.setEnlace(act);
                    cant++;
                }

            }

        }

    }
    
    
    public void eliminar(int elemento){
        if(!Vacia()){
            Nodo aux=L;
            Nodo ant=null;
            while(aux!=null && aux.getDato()!=elemento){
                ant=aux;
                aux=aux.getEnlace();
            }
            if(ant==null){//cabeza
                L=aux.getEnlace();
                aux=null;
                cant--;
            }else{
                if (aux!=null) {
                    Nodo p=aux.getEnlace();
                    ant.setEnlace(p);
                    
                    aux=null;
                    cant--;
                }
 
            }
        }
    }
    public void invertir(){
        if(Vacia()||(cant==1)){
            
        }else{
            Nodo ant=null;
            Nodo act=L;
            Nodo pos=L.getEnlace();
            while (act!=null) {                
                act.setEnlace(ant);
                ant=act;
                act=pos;
                if(pos!=null){
                    pos=pos.getEnlace();
                }
            }
            L=ant;
        }
    }

    public static void main(String[] args) {
        Lista L = new Lista();
        L.insertar(2);
        L.insertar(3);
        L.insertar(5);
        L.insertar(5);
        System.out.println(L);
          L.eliminar(5);
       // L.invertir();
        System.out.println(L);
    }

}
