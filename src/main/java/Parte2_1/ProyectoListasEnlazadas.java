package Parte2_1;

import java.util.Scanner;

/* VICTOR GAMARRA */
public class ProyectoListasEnlazadas {

    public static void menurPrincipal() {
        Scanner sc = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        int num;
        int opcion;
        do {
            System.out.println("\n");
            System.out.println("MENU PRINCIPAL");
            System.out.println("1: AGREGAR LISTA INICIO ");
            System.out.println("2: MOSTRAR LISTA");
            System.out.println("3: AÑADIR EN LA POCION IESIMA");
            System.out.println("4: DEVOLVER LA POSCION DE LA IESIMA DE UN ELEMENTO");
            System.out.println("5: ORDENAR LISTA DE FORMA CRECIENTE");
            System.out.println("6: VERIFICAR SI UNA LISTA ESTA ORDENADA");
            System.out.println("7: VERIFICAR SI UN NUMERO SE ENCUENTRA EN LA LISTA");
            System.out.println("8: INVERTIR LA LISTA");
            System.out.println("9: MOSTRAR N ELMENTOS DE LA LISTA");
            System.out.println("10: ELEMENTO CENTRAL DE LA LISTA");
            System.out.println("11: AGREGAR UN NUMERO EN LA LISTA ORDENADA");
            System.out.println("12: SUPRIMIR UN NUMERO");
            System.out.println("13: SALIR");
            System.out.println("OPCION");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("INGRESE CANTIDAD DE NUMEROS");
                    int cantidad = sc.nextInt();
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("NUMERO[" + (1 + i) + " ]");
                        int x = sc.nextInt();
                        lista.insertaAlFinal(x);
                    }
                    break;
                case 2:
                    if (lista.esVacio()) {
                        System.out.println("La lista esta vacia");
                    } else {
                        System.out.println("MOSTRANDO LISTA ");
                        lista.mostrar();
                    }
                    break;
                case 3:
                    if (lista.esVacio()) {
                        System.out.println("La lista esta vacia");
                    } else {
                        System.out.println("Igrese numero ");
                        num = sc.nextInt();
                        System.out.println("Ingrese posicion");
                        int pos = sc.nextInt();
                        lista.insertarP(num, pos);
                    }
                    break;

                case 4:
                    if (lista.esVacio()) {
                        System.out.println("Lista vacia");
                    } else {
                        System.out.println("Ingrese numero a buscar");
                        int nume = sc.nextInt();
                        if (lista.posicionDeLaiesima(nume) != null) {
                            System.out.println(
                                    "La posicion es " + lista.posicionDeLaiesima(nume));
                        } else {
                            System.out.println("La pocicion no se encontro " + lista.posicionDeLaiesima(nume));
                        }
                        System.out.println("");

                    }
                    break;
                case 5:
                    if (lista.esVacio()) {
                        System.out.println("Lista vacia");
                    } else {
                        System.out.println("ORDENANDO DE FORMA CRECIENTE");
                        lista.ordenAscendente();
                        lista.mostrar();
                    }

                    break;
                case 6:
                    System.out.println("VERIFICANDO");
                    if (lista.estaOrdenado()) {
                        System.out.println("La lista esta ordena");

                    } else {
                        System.out.println("La lista no esta ordenada");
                    }
                    break;
                case 7:
                    if (lista.esVacio()) {
                        System.out.println("Lista vacia");
                    } else {
                        System.out.println("Ingrese numero a buscar");
                        int numeros = sc.nextInt();
                        if (lista.verificarSiSeEncuentraNumero(numeros)) {
                            System.out.println("NUMERO ENCONTRADO EN LA LISTA");

                        } else {
                            System.out.println("NUMERO NO ENCONTRADO EN LA LISTA");

                        }

                    }
                    break;

                case 8:
                    System.out.println("LISTA INVERTIDA");
                    lista.mostrarInversa();
                    break;
                case 9:
                    if (lista.esVacio()) {
                        System.out.println("Lista vacia");
                    } else {
                        System.out.println("cunatos elementos desea mostrar");
                        num = sc.nextInt();
                        if (num <= lista.getTamaño()) {
                            lista.imprimirNElementos(num);

                        } else {
                            System.out.println("NO EXISTE ESA CANTIDAD DE NUMEROS EN LA LISTA");

                        }
                    }
                    break;

                case 10:
                    if (lista.esVacio()) {
                        System.out.println("Lista vacia");
                    } else {
                        System.out.println("MOSTRANDO NUMERO CENTRAL");
                        lista.elementoCentral();
                    }
                    break;
                case 11:
                    if (lista.esVacio()) {
                        System.out.println("No hay elementos en la lista ");
                    } else {
                        System.out.println("Ingrese numero ");
                        num = sc.nextInt();
                        lista.insertarOrdenada(num);
                        lista.mostrar();
                    }
                    break;
                case 12:
                    if (lista.esVacio()) {
                        System.out.println("La posicion a buscar");
                    } else {
                        System.out.println("Ingrese numero ");
                        int n = sc.nextInt();
                        lista.suprimirLaIesima(n);
                        System.out.println("Elemnto eliminado");
                    }

                    break;

                default:
                    System.out.println("SALIENDO DEL PROGRAMA ");
            }
        } while (opcion != 13);
    }

    public static void main(String[] args) {

        menurPrincipal();
    }
}
