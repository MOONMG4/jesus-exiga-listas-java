package ejercicio2_cuentaLetrasAlVector;

/*
 * Problema: cuenta_letras_al_vector
 * Autor: Jesús Manuel Hernández Exiga
 * Grupo: GTID244
 * Fecha: 26/10/26
 * Descripción: Lista enlazada simple para almacenar las letras de la cadena.
 */
public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    /** Inserta una letra al final de la lista. */
    public void insertar(char letra) {
        Nodo nuevo = new Nodo(letra);
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

    /** Cuenta cuántas veces aparece una letra específica. */
    public int contarLetra(char buscada) {
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.letra == buscada) {
                contador++;
            }
            actual = actual.siguiente;
        }
        return contador;
    }
}