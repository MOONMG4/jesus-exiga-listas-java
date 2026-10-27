package ejercicio6_cajaDeDulces;
import java.util.Scanner;

/*
 * Problema: Cajas de dulces
 * Autor: Jesús Manuel Hernández Exiga
 * Grupo: GTID244
 * Fecha: 26/10/26
 * Descripción: Clase principal que lee los datos y resuelve el problema.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Verificamos si hay datos para leer
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            ListaSimple lista = new ListaSimple();
            
            // Leemos los dulces y los insertamos en nuestra lista
            for (int i = 0; i < n; i++) {
                lista.insertar(sc.nextInt());
            }
            
            // Calculamos e imprimimos el resultado
            int resultado = lista.sumaMaxima(k);
            System.out.println(resultado);
        }
        
        sc.close();
    }
}