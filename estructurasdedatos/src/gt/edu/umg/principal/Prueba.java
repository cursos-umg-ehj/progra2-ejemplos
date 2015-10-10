/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.principal;

import gt.edu.umg.listas.ExcepcionListaVacia;
import gt.edu.umg.listas.Lista;

/**
 *
 * @author enrique
 */
public class Prueba {
    
    public static void main(String[] args) {
        probarListas();
    }
 
    public static void probarListas() {
        Lista lista = new Lista("Listas");
        
        lista.insertarAlFrente(-1);
        lista.imprimir();
        lista.insertarAlFrente(0);
        lista.imprimir();
        lista.insertarAlFinal(1);
        lista.imprimir();
        lista.insertarAlFinal(5);
        lista.imprimir();
        
        try {
            Object objetoEliminado = lista.eliminarDelFrente();
            System.out.printf("%s eliminado\n", objetoEliminado);
            lista.imprimir();
            
            objetoEliminado = lista.eliminarDelFrente();
            System.out.printf("%s eliminado\n", objetoEliminado);
            lista.imprimir();
            
            objetoEliminado = lista.eliminarDelFinal();
            System.out.printf("%s eliminado\n", objetoEliminado);
            lista.imprimir();

            objetoEliminado = lista.eliminarDelFinal();
            System.out.printf("%s eliminado\n", objetoEliminado);
            lista.imprimir();
            
        }
        catch (ExcepcionListaVacia excepcionListaVacia) {
            excepcionListaVacia.printStackTrace();
        }

    } 
}
