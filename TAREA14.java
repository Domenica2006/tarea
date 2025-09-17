
package com.mycompany.tarea14;

public class TAREA14 {

    // Método que calcula el descuento dado el monto total y un porcentaje
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100);
    }

    // Método sobrecargado: aplica un 10% de descuento por defecto
    public static double calcularDescuento(double montoTotal) {
        return calcularDescuento(montoTotal, 10); // reutiliza el primer método
    }

    public static void main(String[] args) {
        double monto1 = 200.0;
        double monto2 = 500.0;

        // Primera llamada: solo monto total (usa 10% por defecto)
        double descuento1 = calcularDescuento(monto1);
        double montoFinal1 = monto1 - descuento1;

        // Segunda llamada: monto total con porcentaje explícito (ejemplo: 15%)
        double descuento2 = calcularDescuento(monto2, 15);
        double montoFinal2 = monto2 - descuento2;

        // Salida de resultados
        System.out.println("=== Cálculo de Descuentos ===");
        System.out.println("Monto inicial: $" + monto1);
        System.out.println("Descuento aplicado (10%): $" + descuento1);
        System.out.println("Monto final a pagar: $" + montoFinal1);

        System.out.println();

        System.out.println("Monto inicial: $" + monto2);
        System.out.println("Descuento aplicado (15%): $" + descuento2);
        System.out.println("Monto final a pagar: $" + montoFinal2);
    }
}
