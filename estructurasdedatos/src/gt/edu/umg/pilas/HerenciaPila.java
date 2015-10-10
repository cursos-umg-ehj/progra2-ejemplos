/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.pilas;
import gt.edu.umg.listas.ExcepcionListaVacia;
import gt.edu.umg.listas.Lista;

/**
 *
 * @author enrique
 */
public class HerenciaPila extends Lista {
    //Constructo sin argumentos
    public HerenciaPila() {
        super("pila");
    }
    
    //Agrega objeto a la pila
    public void push(Object objeto) {
        insertarAlFrente(objeto);
    }
    
    //Elimina objeto de la pila
    public Object pop() throws ExcepcionListaVacia {
        return eliminarDelFrente();
    }
}
