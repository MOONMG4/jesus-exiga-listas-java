package ejercicio4_insercionEnLitasEnlazadas;
import java.util.Scanner;

/*
 * Problema: Inserción en Lista Enlazada
 * Autor: Jesús Manuel Hernández Exiga
 * Grupo: GTID244
 * Fecha: 26/10/26
 * Descripción: Inserta un -1 antes de cada número impar en la lista.
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ListaSimple lista = new ListaSimple();
        int insertados = 0;

        // Leemos hasta el final de archivo (EOF)
        while (leer.hasNextInt()) {
            int num = leer.nextInt();
            
            // Si el número es impar, insertamos el -1 primero
            if (num % 2 != 0) {
                lista.insertarAlFinal(-1);
                insertados++;
            }
            lista.insertarAlFinal(num);
        }

        System.out.println(insertados);
        lista.imprimirFormato();

        leer.close();
    }
}