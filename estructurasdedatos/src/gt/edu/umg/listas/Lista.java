package gt.edu.umg.listas;

/**
 *
 * @author enrique
 * 
 * Definición de la clase Lista
 */
public class Lista {
    private NodoLista primerNodo;
    private NodoLista ultimoNodo;
    private final String nombre; //Cadena utilizada para imprimir el nombre de la lista

    /**
     * Constructor para crear una lista vacia con un nombre
     * @param nombreLista - cadena con el nombre de la lista
     */
    public Lista(String nombreLista) {
        nombre = nombreLista;
        primerNodo = ultimoNodo = null;
    }

    /**
     * Constructor para crear una lista vacia con el nombre "lista"
     */
    public Lista() {
        this("lista");
    }

    /**
     * insertarAlFrente - inserta un objeto al frente de la lista
     * 
     * @param elementoInsertar - objeto genérico
     * 
     */
    public void insertarAlFrente(Object elementoInsertar) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(elementoInsertar);
        }
        else {
            primerNodo = new NodoLista(elementoInsertar, primerNodo);
        }
    }
    
    /**
     * insertarAlFinal - inserta un objeto al final de la lista
     * 
     * @param elementoInsertar - objeto genérico
     * 
     */
    public void insertarAlFinal(Object elementoInsertar) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(elementoInsertar);
        }
        else {
            ultimoNodo.ponerSiguiente(new NodoLista(elementoInsertar));
            ultimoNodo =  ultimoNodo.obtenerSiguiente();
        }
    }
    
    /**
     * eliminarDelFrente - elimina el primer nodo de la lista
     * @return Object - regresa un objeto genérico
     * @throws ExcepcionListaVacia - dispara excepción de lista vacia
     */
    public Object eliminarDelFrente() throws ExcepcionListaVacia {
        if (estaVacia())
            throw new ExcepcionListaVacia(nombre);
        
        Object elementoEliminado = primerNodo.obtenerDatos();
        
        if (primerNodo == ultimoNodo) {
            primerNodo = ultimoNodo = null;
        }
        else {
            primerNodo = primerNodo.obtenerSiguiente();
        }
        
        return elementoEliminado;
    }

    /**
     * eliminarDelFinal - elimina el último nodo de la lista
     * @return Object - regresa un objeto genérico
     * @throws ExcepcionListaVacia - dispara excepción de lista vacia 
     */
    public Object eliminarDelFinal() throws ExcepcionListaVacia {
        if (estaVacia())
            throw new ExcepcionListaVacia(nombre);
        
        Object elementoEliminado = ultimoNodo.obtenerDatos();
        
        if (primerNodo == ultimoNodo) {
            primerNodo = ultimoNodo = null;
        }
        else {
            NodoLista actual = primerNodo;
            
            while(actual.obtenerSiguiente() != ultimoNodo) {
                actual = actual.obtenerSiguiente();
            }
            
            ultimoNodo = actual;
            
            actual.ponerSiguiente(null);
        }
        
        return elementoEliminado;
    }
 
    /**
     * estaVacia - determina si la lista esta vacia
     * @return - falso o verdadero
     */
    public boolean estaVacia() {
        return (primerNodo == null && ultimoNodo== null);
    }

    /**
     * imprimir - imprimir el contenido de la Lista
     * 
     */
    public void imprimir() {
        if (estaVacia()) {
            System.out.printf("La lista %s esta vacia", nombre);
            return;
        }
        
        System.out.printf("La lista %s es:\n", nombre);
        
        NodoLista actual = primerNodo;
        
        while(actual != null) {
            System.out.printf("%s ", actual.obtenerDatos());
            actual = actual.obtenerSiguiente();
        }
        
        System.out.println();
    }
}
