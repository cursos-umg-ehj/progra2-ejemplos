/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.colas;

import gt.edu.umg.listas.ExcepcionListaVacia;
import gt.edu.umg.listas.Lista;

/**
 *
 * @author enrique
 */
public class Cola {
    private Lista listaCola;
    
    // Constructor sin argumentos
    public Cola() {
        listaCola = new Lista("cola");
    }
    
    // agrega objeto a la cola
    public void enqueue(Object objeto) {
        listaCola.insertarAlFinal(objeto);
    }
    
    // elimina objeto de la cola
    public Object dequeue() throws ExcepcionListaVacia {
        return listaCola.eliminarDelFrente();
    }
    
    // determina si la cola está vacía
    public boolean estaVacia() {
        return listaCola.estaVacia();
    }
    
    // imprime el contenido de la cola
    public void imprimir() {
        listaCola.imprimir();
    }
}
