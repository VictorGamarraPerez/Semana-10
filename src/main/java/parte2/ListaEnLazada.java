package parte2;

/* Lizarraga Paquiyauri Kevin */
public class ListaEnLazada {

    protected Nodo primero;
    private int tamaño = 0;

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public ListaEnLazada() {
        primero = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public boolean esVacio() {
        return primero == null;
    }

    public void insertarAlinicio(double x) {
        Nodo nuevo = new Nodo(x);
        nuevo.setInfo(x);
        if (esVacio()) {
            primero = nuevo;
        } else {
            nuevo.setSiguiente(primero);
            primero = nuevo;
        }
        tamaño++;

    }

    public void insertarAlFinal(double x) {
        Nodo nuevo = new Nodo(x);
        nuevo.setInfo(x);
        if (esVacio()) {
            primero = nuevo;
        } else {
            Nodo aux = primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamaño++;
    }

    public void mostrar() {
        Nodo p = primero;
        while (p != null) {
            System.out.println("[" + p.getInfo() + "]");
            p = p.getSiguiente();
        }
    }

    public void borrarPrimero() {

        primero = primero.getSiguiente();

    }

    public void mayor() {
        Nodo a = primero;
        double mayor = primero.getInfo();
        while (a != null) {
            if (a.getInfo() > mayor) {
                mayor = a.getInfo();
            }
            a = a.getSiguiente();
        }
        System.out.println("El mayor es " + mayor);
    }

    public void menor() {
        Nodo a = primero;
        double menor = primero.getInfo();
        while (a != null) {

            if (a.getInfo() < menor) {
                menor = a.getInfo();

            }
            a = a.getSiguiente();

        }
        System.out.println("El menor es " + menor);
    }

    public void promedio() {
        Nodo a = primero;
        double suma = 0;
        int con = 0;
        while (a != null) {
            suma += a.getInfo();
            con++;
            a = a.getSiguiente();
        }
        double promedio = suma / con;
        System.out.println("el promedio es" + promedio);
    }

    public int buscarPosicion(double x) {
        Nodo a = primero;
        int posi = -1;
        int con = 0;
        while (a != null) {
            con++;
            if (a.getInfo() == x) {
                posi = con;
            }
            a = a.getSiguiente();
        }
        return posi;
    }

    public void borrar(int pos) {
        if (pos >= 0 && pos < getTamaño()) {
            if (pos == 0) {
                primero = primero.getSiguiente();
            } else {
                Nodo aux = primero.getSiguiente();
                for (int i = 0; i < getTamaño(); i++) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamaño--;
        }

    }

    public void ordenarAcendente() {
        Nodo a = primero;
        double aux;
        while (a != null) {
            Nodo siguiente = a.getSiguiente();
            if (a.getInfo() > siguiente.getInfo()) {
                aux = a.getInfo();
                a.setInfo(siguiente.getInfo());
                siguiente.setInfo(a.getInfo());
            }
            a = a.getSiguiente();
        }
    }
}
