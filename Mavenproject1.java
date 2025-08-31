
package com.mycompany.mavenproject1;

public class Mavenproject1 {

    // Método para buscar un valor en la matriz 2D
    public static int[] buscarValor(int[][] matriz, int valorBuscado) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorBuscado) {
                    return new int[]{i, j}; // posición encontrada
                }
            }
        }
        return new int[]{-1, -1}; // no encontrado
    }

    public static void main(String[] args) {
        // Declaración de matriz 3x3
        int[][] matriz = {
                {5, 8, 2},
                {4, 9, 1},
                {7, 6, 3}
        };

        int valorBuscado = 9; // puedes cambiarlo para probar
        int[] posicion = buscarValor(matriz, valorBuscado);

        if (posicion[0] != 1) {
            System.out.println("Valor " + valorBuscado + " encontrado en posición: ["
                    + posicion[0] + ", " + posicion[1] + "]");
        } else {
            System.out.println("Valor " + valorBuscado + " no encontrado en la matriz.");
        }
    }
}
