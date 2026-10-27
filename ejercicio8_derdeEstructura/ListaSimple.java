package ejercicio8_derdeEstructura;

/*
 * Problema: Derdenio y sus Estructuras de Datos
 * Autor: Jesús Manuel Hernández Exiga
 * Grupo: GTID244
 * Fecha: 26/10/26
 * Descripción: Lista enlazada simple para combinar los datos.
 */
public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    /** Regresa un arreglo con todos los datos de la lista. */
    public int[] obtenerArreglo(int total) {
        int[] arreglo = new int[total];
        Nodo actual = cabeza;
        for (int i = 0; i < total; i++) {
            arreglo[i] = actual.dato;
            actual = actual.siguiente;
        }
        return arreglo;
    }
}