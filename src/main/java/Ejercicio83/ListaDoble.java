
package Ejercicio83;

/* Lizarraga Paquiyauri Kevin */

public class ListaDoble {
    Nodo cabeza;
    private Nodo primero;
    public ListaDoble() {
        
    }

    public ListaDoble insertarCabezaLista(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.adelante = cabeza;
        if (cabeza != null) {
            cabeza.atras = nuevo;
        }
        cabeza = nuevo;
        return this;
    }

    public ListaDoble insertaDespues(Nodo anterior, int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.adelante = anterior.adelante;
        if (anterior.adelante != null) {
            anterior.adelante.atras = nuevo;
        }
        anterior.adelante = nuevo;
        nuevo.atras = anterior;
        return this;
    }

    public void eliminar(int entrada) {
        Nodo actual;
        boolean encontrado = false;
        actual = cabeza;
// Bucle de búsqueda
        while ((actual != null) && (!encontrado)) {
            /* la comparación se realiza con el método equals()...,
 depende del tipo Elemento */
            encontrado = (actual.dato == entrada);
            if (!encontrado) {
                actual = actual.adelante;
            }
        }
        // Enlace de nodo anterior con el siguiente
        if (actual != null) {
            //distingue entre nodo cabecera o resto de la lista
            if (actual == cabeza) {
                cabeza = actual.adelante;
                if (actual.adelante != null) {
                    actual.adelante.atras = null;
                }
            } else if (actual.adelante != null) // No es el último nodo
            {
                actual.atras.adelante = actual.adelante;
                actual.adelante.atras = actual.atras;
            } else // último nodo
            {
                actual.atras.adelante = null;
            }
            actual = null;
        }
    }

    public void visualizar() {
        Nodo n;
        int k = 0;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
            k++;
            System.out.print((k % 15 != 0 ? " " : "\n"));
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
