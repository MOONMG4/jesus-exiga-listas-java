package ejercicio2_cuentaLetrasAlVector;

/*
 * Problema: cuenta_letras_al_vector
 * Autor: Jesús Manuel Hernández Exiga
 * Grupo: GTID244
 * Fecha: 26/10/26
 * Descripción: Nodo que guarda un caracter.
 */
public class Nodo {
    public char letra;
    public Nodo siguiente;

    public Nodo(char letra) {
        this.letra = letra;
        this.siguiente = null;
    }
}