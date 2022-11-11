
package Parte2_1;

/* Lizarraga Paquiyauri Kevin */

class Nodo {

    public int info;
    public Nodo siguiente;

    public Nodo() {
        siguiente = null;
        info = 0;
    }

    public Nodo(int x) {
        siguiente = null;

        info = x;
    }

    public Nodo(int x, Nodo siguiente) {
        info = x;
        this.siguiente = siguiente;

    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
