package Ejercicio82;

import Ejercico81.Lista;
import Ejercico81.Nodo;

/* Lizarraga Paquiyauri Kevin */
public class ListaOrdenada extends Lista {

    public ListaOrdenada() {
        super();
    }

    public ListaOrdenada insertaOrden(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        if (primero == null) {
            primero = nuevo;
        } else if (entrada < primero.getDato()) {
            nuevo.setEnlace(primero);
            primero = nuevo;
        } else /* búsqueda del nodo anterior a partir del que
 se debe insertar */ {
            Nodo anterior, p;
            anterior = p = primero;
            while ((p.getEnlace() != null) && (entrada > p.getDato())) {
                anterior = p;
                p = p.getEnlace();
            }
            if (entrada > p.getDato()) //se inserta después del último nodo
            {
                anterior = p;
            }
            // Se procede al enlace del nuevo nodo
            nuevo.setEnlace(anterior.getEnlace());
            anterior.setEnlace(nuevo);
        }
        return this;

    }
    // métodos a codificar:

    public void eliminar(int entrada) {
        Nodo actual, anterior;
        boolean encontrado;
//inicializa los apuntadores
        actual = primero;
        anterior = null;
        encontrado = false;
// búsqueda del nodo y del anterior
        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.dato == entrada);
            //con objetos: actual.dato.equals(entrada)
            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
// Enlace del nodo anterior con el siguiente
        if (actual != null) {
            // Distingue entre que el nodo sea el cabecera,
            // o del resto de la lista
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null; // no es necesario al ser una variable local
        }
    }

    public Nodo buscarLista(int destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (destino == indice.dato) // (destino.equals(indice.dato))
            {
                return indice;
            }
        }
        return null;
    }
}
