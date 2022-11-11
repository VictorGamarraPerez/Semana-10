package Parte2_1;

/* Lizarraga Paquiyauri Kevin */

class ListaEnlazada {

    protected Nodo primero;
    private int tamaño = 0;

    public ListaEnlazada() {
        primero = null;
        tamaño = 0;
    }

    public Nodo getPrimero() {
        return primero;

    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean esVacio() {
        return primero == null;
    }

    public void insertaAlFinal(int x) {
        Nodo nuevo = new Nodo(x);
        Nodo p;
        if (primero == null) {
            primero = nuevo;
        } else {
            p = primero;
            while (p.getSiguiente() != null) {
                p = p.getSiguiente();
            }
            p.setSiguiente(nuevo);

        }
        tamaño++;
    }

//EJEMPLO 1
    public void insertarP(int x, int pos) {
        Nodo nuevo = new Nodo(x, null);
        if (pos == 1) {
            nuevo.setSiguiente(primero);
            primero = nuevo;
        } else {
            Nodo p = primero;
            int cont = 1;
            while (p != null && cont < pos - 1) {
                p = p.getSiguiente();
                cont++;
            }
            if (p != null) {
                nuevo.setSiguiente(p.getSiguiente());
                p.setSiguiente(nuevo);

            } else {
                System.out.println("Posiciòn no valida");
            }
        }
    }

    public Nodo posicionDeLaiesima(int pos) {
        Nodo a = primero;
        int con = 0;
        for (int i = 1; a != null; i++) {
            con++;
            if (con == pos) {
                return a;
            }
            a = a.getSiguiente();
        }
        return null;
    }
//EJEMPLO 2

    public void suprimirLaIesima(int pos) {
        Nodo tem;
        if (pos < 1 || pos > getTamaño()) {
            System.out.println("La posicion no existe          ");
        } else if (pos == 1) {
            primero = primero.getSiguiente();
        } else {
            Nodo p = primero;
            int con = 1;
            while (con < pos - 1) {
                p = p.getSiguiente();
                con++;
            }
            tem = p.getSiguiente();
            p.setSiguiente(tem.getSiguiente());
        }
    }

//EJEMPLO 3
    public void devolverUltimaPosicion() {
        Nodo a = primero, anterior, siguiente;
        int con = 0, posi = 0, numero = 0;
        while (a != null) {
            con++;
            anterior = a;
            siguiente = a.getSiguiente();
            if (siguiente == null) {
                posi = con;
                numero = a.getInfo();
            }
            a = a.getSiguiente();
        }
        System.out.println("la ultima posicion de la iesima es " + posi + " con numero[" + numero + "]");

    }

//EJEMPLO 4
    public void ordenAscendente() {
        Nodo p, q;
        int aux;
        p = primero;
        while (p.getSiguiente() != null) {
            q = p.getSiguiente();
            while (q != null) {
                if (p.getInfo() > q.getInfo()) {
                    aux = p.getInfo();
                    p.setInfo(q.getInfo());
                    q.setInfo(aux);
                }
                q = q.getSiguiente();
            }
            p = p.getSiguiente();
        }
    }

    public void insertarOrdenada(int x) {
        Nodo nuevo = new Nodo(x);
        if (primero == null) {
            primero = nuevo;
        } else if (x < primero.getInfo()) {
            nuevo.setSiguiente(primero);
            primero = nuevo;
        } else {
            Nodo p = primero;
            while (p.getSiguiente() != null && p.getSiguiente().getInfo() < x) {
                p = p.getSiguiente();
            }
            nuevo.setSiguiente(p.getSiguiente());
            p.setSiguiente(nuevo);
        }
    }

//EJEMPLO 6
    public boolean estaOrdenado() {
        Nodo p = primero;
        while (p.getSiguiente() != null) {
            if (p.getInfo() > p.getSiguiente().getInfo()) {
                return false;
            }
            p = p.getSiguiente();
        }
        return true;
    }

//EJEMPLO 7
    public boolean verificarSiSeEncuentraNumero(int inf) {
        Nodo a = primero;
        boolean verificar = false;
        while (a != null) {
            if (a.getInfo() == inf) {
                verificar = true;
                break;
            }
            a = a.getSiguiente();
        }
        return verificar;
    }
//ejemplo 8

    public void mostrarInversa() {
        alreves(primero);
    }

    public void alreves(Nodo p) {
        if (p != null) {
            alreves(p.siguiente);
            System.out.print("[" + p.info + "]" + "==>");
        }
    }

//EJEMPLO 9
    public void imprimirNElementos(int can) {
        Nodo a = primero;
        int con = 0;
        int total = getTamaño() - can;
        Nodo inicio;
        for (inicio = primero; inicio != null; inicio = inicio.getSiguiente()) {
            con++;

            if (con > total && con <= getTamaño()) {
                System.out.println(inicio.getInfo());

            }
        }

    }

//EJEMPLO 10
    public void elementoCentral() {
        Nodo a = primero;
        int con = 0, medio = getTamaño() / 2;
        if (!esVacio()) {
            while (a != null) {

                Nodo aux = a;
                Nodo siguiente = a.getSiguiente();
                con++;
                if (con == medio) {
                    if (getTamaño() % 2 == 0) {
                        System.out.println("Elemento central es[" + aux.getInfo() + "] y [" + siguiente.getInfo() + "]");
                    } else {
                        System.out.println(
                                "Elemento decntral es[" + siguiente.getInfo() + "]");
                    }
                }

                a = a.getSiguiente();
            }
        } else {
            System.out.println(
                    "Lista vacia");
        }

    }

    public void mostrar() {
        Nodo p = primero;
        while (p != null) {
            System.out.print("[" + p.getInfo() + "] ==> ");
            p = p.getSiguiente();
        }
    }
}
