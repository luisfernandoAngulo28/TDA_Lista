/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeNegocio;

/**
 *
 * @author ferna
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

    public static void main(String[] args) {
        Lista L = new Lista();
        L.insertar(2);
        L.insertar(3);
        L.insertar(5);
        L.insertar(5);
        System.out.println(L);
    }

}
