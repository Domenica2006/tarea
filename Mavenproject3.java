
package com.mycompany.mavenproject3;

import java.util.Arrays;

/**
 *
 * @author domen_mxojouo
 */
public class Mavenproject3{

    // Método para ordenar una fila específica con Arrays.sort
    public static void ordenarFila(int[][] matriz, int fila) {
        if (fila >= 0 && fila < matriz.length) {
            Arrays.sort(matriz[fila]); // Ordena en orden ascendente
        } else {
            System.out.println("Número de fila fuera de rango.");
        }
    }

    // Método para imprimir la matriz en consola
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Declaración de una matriz 3x3
        int[][] matriz = {
            {15, 3, 9},
            {8, 2, 14},
            {6, 11, 5}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Ordenamos la segunda fila (índice 1)
        int filaAOrdenar = 2;
        ordenarFila(matriz, filaAOrdenar);

        System.out.println("\nMatriz con la fila " + filaAOrdenar + " ordenada:");
        imprimirMatriz(matriz);
    }
}
