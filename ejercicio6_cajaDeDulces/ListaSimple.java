package ejercicio6_cajaDeDulces;

/*
 * Problema: Cajas de dulces
 * Autor: Jesús Manuel Hernández Exiga
 * Grupo: GTID244
 * Fecha: 26/10/26
 * Descripción: Lista enlazada simple propia para gestionar las cajas.
 */
public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    /** Inserta una caja al final de la lista.
     * @param dulces Cantidad de dulces a insertar.
     */
    public void insertar(int dulces) {
        Nodo nuevo = new Nodo(dulces);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            // Recorremos hasta el último nodo
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo; // Enlazamos el nuevo nodo al final
        }
    }

    /** Calcula la suma máxima de K cajas consecutivas.
     * @param k Número de cajas consecutivas permitidas.
     * @return La suma máxima de dulces.
     */
    public int sumaMaxima(int k) {
        if (cabeza == null || k <= 0) return 0;

        Nodo actual = cabeza;
        int sumaActual = 0;
        int maxSuma = 0;

        // 1. Calculamos la suma de la primera ventana (primeras K cajas)
        for (int i = 0; i < k; i++) {
            if (actual != null) {
                sumaActual += actual.dulces;
                actual = actual.siguiente;
            }
        }
        maxSuma = sumaActual;

        // 2. Deslizamos la ventana por el resto de la lista
        // 'actual' ahora apunta a la caja K+1
        Nodo inicioVentana = cabeza; 
        
        while (actual != null) {
            // Restamos la caja que sale de la ventana y sumamos la que entra
            sumaActual = sumaActual - inicioVentana.dulces + actual.dulces;
            
            // Actualizamos el máximo si es necesario
            if (sumaActual > maxSuma) {
                maxSuma = sumaActual;
            }
            
            // Avanzamos los punteros
            inicioVentana = inicioVentana.siguiente;
            actual = actual.siguiente;
        }

        return maxSuma;
    }
}