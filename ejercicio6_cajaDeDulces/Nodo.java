package ejercicio6_cajaDeDulces;

/*
 * Problema: Cajas de dulces
 * Autor: Jesús Manuel Hernández Exiga
 * Grupo: GTID244
 * Fecha: 26/10/26
 * Descripción: Clase Nodo que representa una caja de dulces en la lista.
 */
public class Nodo {
    public int dulces;
    public Nodo siguiente;

    /** Constructor del nodo.
     * @para dulces Cantidad de dulces en la caja.
     */
    public Nodo(int dulces) {
        this.dulces = dulces;
        this.siguiente = null;
    }
}