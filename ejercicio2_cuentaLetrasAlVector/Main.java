package ejercicio2_cuentaLetrasAlVector;
import java.util.Scanner;

/*
 * Problema: cuenta_letras_al_vector
 * Autor: Jesús Manuel Hernández Exiga
 * Grupo: GTID244
 * Fecha: 26/10/26
 * Descripción: Cuenta las apariciones de cada letra usando una lista propia.
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        if (leer.hasNextLine()) {
            String cadena = leer.nextLine();
            ListaSimple miLista = new ListaSimple();
            
            // Guardamos cada letra en la lista
            for (int i = 0; i < cadena.length(); i++) {
                miLista.insertar(cadena.charAt(i));
            }
            
            int[] contadores = new int[26];
            
            // Contamos usando nuestro método de la lista
            for (int i = 0; i < 26; i++) {
                char letra = (char) (i + 'a');
                contadores[i] = miLista.contarLetra(letra);
            }
            
            // Imprimir primera línea
            for (int i = 0; i < 26; i++) {
                System.out.print(contadores[i]);
                if (i < 25) System.out.print(" ");
            }
            System.out.println();
            
            // Imprimir segunda parte
            for (int i = 0; i < 26; i++) {
                if (contadores[i] > 0) {
                    char letra = (char) (i + 'a');
                    System.out.println("La letra " + letra + " aparece " + contadores[i] + " veces");
                }
            }
        }
        leer.close();
    }
}