package Clases;

/* VICTOR GAMARRA */
public class Lista {

    private Nodo primero;
    private Nodo ultimo;
    private int tamaño;

    public Lista() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Lista{" + "primero=" + primero + ", ultimo=" + ultimo + ", tama\u00f1o=" + tamaño + '}';
    }

    public boolean Vacio() {
        return primero == null && ultimo == null;
    }

    public void Insertar_Inicio(int dato) {
        Nodo nuevo = new Nodo(dato, primero);
        primero = nuevo;
        if (ultimo == null) {
            ultimo = primero;
        }
        tamaño++;
    }

    public void Insertar_Ultimo(int dato) {
        if (Vacio()) {
            primero = ultimo = new Nodo(dato);
        } else {
            ultimo.setSiguiente(new Nodo(dato));
            ultimo = ultimo.getSiguiente();
        }
        tamaño++;
    }

    public void Eliminar_Inicio() {
        if (Vacio()) {
            if (primero == ultimo) {
                primero = ultimo = null;
            } else {
                primero = primero.getSiguiente();
            }
            tamaño--;
        }
    }

    public void Eliminar_Ultimo() {
        if (Vacio()) {
            if (primero == ultimo) {
                primero = ultimo = null;
            } else {
                Nodo aux = primero;
                while (aux.getSiguiente() != ultimo) {
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(null);
                ultimo = aux;
            }
            tamaño--;
        }
    }

    public String Mostrar() {
        String lista = "";
        if (Vacio()) {
            Nodo aux = primero;
            while (aux != null) {
                lista += aux.getDato() + " - ";
                aux = aux.getSiguiente();
            }
        }
        return lista;
    }

    public String Pares() {
        String lista = "";
        if (Vacio()) {
            Nodo aux = primero;
            while (aux != null) {
                if (aux.getDato() % 2 == 0) {
                    lista += aux.getDato() + " - ";
                }
                aux = aux.getSiguiente();
            }
        }
        return lista;
    }

}
