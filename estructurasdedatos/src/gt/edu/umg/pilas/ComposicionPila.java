/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.pilas;

import gt.edu.umg.listas.Lista;

/**
 *
 * @author enrique
 */
public class ComposicionPila {
    private Lista listaPila;
    
    //Constructor sin argumentos
    public ComposicionPila() {
        listaPila = new Lista("pila");
    }
    
    //agrega objeto a la pila
    public void push(Object objeto) {
        listaPila.insertarAlFrente(objeto);
    }
    
    //elimina objeto de la pila
    public Object pop() {
        return listaPila.eliminarDelFrente();
    }
    
    //determina si la pila está vacía
    public boolean estaVacia() {
        return listaPila.estaVacia();
    }

    //imprime el contenido de la pila
    public void imprimir() {
        listaPila.imprimir();
    }
}
