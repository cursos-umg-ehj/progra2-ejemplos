/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.listas;

/**
 *
 * @author enrique
 */
public class NodoLista {
    private Object datos;
    private NodoLista siguienteNodo;
    
    public NodoLista(Object objeto) {
        datos =  objeto;
        siguienteNodo = null;
    }
    
    public NodoLista(Object objeto, NodoLista nodo) {
        datos =  objeto;
        siguienteNodo = nodo;
    }

    public Object obtenerDatos() {
        return datos;
    }
    
    public NodoLista obtenerSiguiente() {
        return siguienteNodo;
    }
    
    public void ponerSiguiente(NodoLista nodo) {
        siguienteNodo = nodo;
    }
}
