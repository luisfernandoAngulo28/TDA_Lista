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
public class Nodo {
    //Atributos 
    int dato;
    Nodo Enlace;
   //Constructor
    public Nodo(){
        dato=0;
        Enlace=null;
    }
    
    //Constructor
    public Nodo(int datoe){
        this.dato=datoe;
        Enlace=null;
    }
    
    
    //set
    public void setDato(int datoEntrada){
        this.dato=datoEntrada;
    }
    
    public void setEnlace(Nodo p){//enlaza 2 Nodos
        this.Enlace=p;
    }
    //get
    public int getDato(){//devolvemos un dato del Nodo
        return dato;
                
    }
    
    public Nodo getEnlace(){//devolvemos el nodo a donde apuntamos
        return Enlace;
    }
    
    //toString
    @Override
    public String toString(){
        String s="[dato=";
        s=s+getDato();
        return s+"|]";
    }
    
    public static void main(String[] args) {
        Nodo p=new Nodo();
       // System.out.println(p.toString());
        //insertando valor
        p.setDato(5);
          System.out.println(p.toString());
          //--------------------------otra forma
          //con un constructor con parametros
          Nodo q=new Nodo(23);
          System.out.println("Nodo Q "+q.toString());
          //Enlazar 2 Nodos
          p.setEnlace(q);
          System.out.println("Enlazando 2 Nodos");
           System.out.println(p.toString()+"->"+p.getEnlace().toString());
    }
    
    
    
    
    
    
    
    
    
    
    
}
