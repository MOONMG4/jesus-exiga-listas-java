# jesus-exiga-listas-java
# Nombre: Jesús Manuel Hernández Exiga
# Grupo: GTID244
# 
## Conclusiones

A lo largo de la resolución de estos cuatro ejercicios, reforcé mis conocimientos sobre las estructuras de datos dinámicas, específicamente las listas enlazadas. 

*   **Sobre el uso de Listas Simples:** Implementé **Listas Simples** en todos los ejercicios porque el flujo de los datos requería un recorrido secuencial (de izquierda a derecha). Descarté el uso de listas dobles porque no necesitaba retroceder en los datos en ningún momento (nunca utilicé un puntero `anterior`), por lo que agregar esa lógica habría sido un desperdicio de memoria y de código.
*   **Dificultades superadas:** 
    *   En el Ejercicio 2, el reto fue mapear los caracteres a índices numéricos para el conteo, lo cual resolví usando la resta de caracteres (`letra - 'a'`).
    *   En el Ejercicio 4, aprender a leer datos "hasta EOF" (usando `hasNextInt()`) fue un reto nuevo, ya que no sabía cuántos datos iba a recibir el programa.
    *   En el Ejercicio 6, la principal dificultad fue la eficiencia. Al principio la suma se me ocurría con dos ciclos `for`, pero al investigar apliqué la técnica de **Ventana Deslizante**, que optimizó el tiempo de ejecución a un solo recorrido.
    *   En el Ejercicio 8, en lugar de enredarme con los punteros para mezclar las dos listas, extraje los datos de mi propia lista a un arreglo para aplicar un ordenamiento Burbuja de forma segura.
*   **Cumplimiento de la rúbrica:** Todo el código fue desarrollado de forma original, sin el uso de herramientas de Inteligencia Artificial (IA). No se utilizaron las librerías `LinkedList` o `ArrayList` de Java; las clases `Nodo` y `ListaSimple` fueron creadas desde cero por el estudiante para demostrar el dominio de los punteros.
  
## Como Compilar
* **usando 
