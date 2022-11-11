package parte2;

/* VICTOR GAMARRA */
public class Nodo {

    private double info;
    private Nodo siguiente;

    public Nodo() {
        siguiente = null;
    }

    public Nodo(double x) {
        siguiente = null;
        info = x;
    }

    public Nodo(double x, Nodo siguiente) {
        info = x;
        this.siguiente = siguiente;
    }

    public double getInfo() {
        return info;
    }

    public void setInfo(double info) {
        this.info = info;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void VerNodo() {
        System.out.println("[" + info + "]");
    }
}
