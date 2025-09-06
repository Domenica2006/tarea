
package com.mycompany.mavenproject4;

public class Mavenproject4 {
    public static void main(String[] args) {
        // [ciudad][día][semana]
        double[][][] temperaturas = {
            {   // Ciudad 0
                {20, 21}, {22, 23}, {21, 22}, {19, 20}, {18, 19}, {17, 18}, {16, 17}  // Lunes a Domingo
            },
            {   // Ciudad 1
                {25, 26}, {27, 28}, {26, 27}, {24, 25}, {23, 24}, {22, 23}, {21, 22}  // Lunes a Domingo
            }
        };

        // Nombres de referencia (opcional para impresión)
        String[] ciudades = {"Quito", "Guayaquil"};
        String[] semanas = {"Semana 1", "Semana 2"};

        // Calcular y mostrar promedios por ciudad y semana
        for (int c = 0; c < temperaturas.length; c++) {           // Ciudades
            for (int s = 0; s < temperaturas[0][0].length; s++) { // Semanas
                double suma = 0;
                int contador = 0;
                for (int d = 0; d < temperaturas[0].length; d++) { // Días
                    suma += temperaturas[c][d][s];
                    contador++;
                }
                double promedio = suma / contador;
                System.out.println("Promedio de " + ciudades[c] +
                                   " en " + semanas[s] + " = " +
                                   promedio + "°C");
            }
        }
    }
}

