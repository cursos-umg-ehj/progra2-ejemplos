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
public class ExcepcionListaVacia extends RuntimeException
{
 
    public ExcepcionListaVacia () {
        this("lista");
    }
    
    public ExcepcionListaVacia(String nombre) {
        super(nombre + " esta vacia" );
    }

}
