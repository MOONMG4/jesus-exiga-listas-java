package ejercicio4_insercionEnLitasEnlazadas;

/*
 * Problema: Inserción en Lista Enlazada
 * Autor: Jesús Manuel Hernández Exiga
 * Grupo: GTID244
 * Fecha: 26/10/26
 * Descripción: Nodo para guardar números enteros.
 */
public class Nodo {
    public int dato;
    public Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}