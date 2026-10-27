package ejercicio8_derdeEstructura;
import java.util.Scanner;

/*
 * Problema: Derdenio y sus Estructuras de Datos
 * Autor: Jesús Manuel Hernández Exiga
 * Grupo: GTID244
 * Fecha: 26/10/26
 * Descripción: Combina dos listas y las ordena de mayor a menor.
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        if (leer.hasNextInt()) {
            int n = leer.nextInt();
            ListaSimple lista = new ListaSimple();
            
            // Insertamos los datos de la primera lista
            for (int i = 0; i < n; i++) {
                lista.insertar(leer.nextInt());
            }
            // Insertamos los datos de la segunda lista
            for (int i = 0; i < n; i++) {
                lista.insertar(leer.nextInt());
            }
            
            // Obtenemos un arreglo desde la lista
            int total = n * 2;
            int[] numeros = lista.obtenerArreglo(total);
            
            // Ordenamos de mayor a menor (Método Burbuja)
            for (int i = 0; i < total - 1; i++) {
                for (int j = 0; j < total - 1 - i; j++) {
                    if (numeros[j] < numeros[j+1]) {
                        int temp = numeros[j];
                        numeros[j] = numeros[j+1];
                        numeros[j+1] = temp;
                    }
                }
            }
            
            // Imprimimos la salida
            for (int i = 0; i < total; i++) {
                System.out.print(numeros[i]);
                if (i < total - 1) System.out.print(" ");
            }
            System.out.println();
        }
        leer.close();
    }
}