package com.mycompany.tarea13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarea13 {

    // Método para mostrar menú
    static void mostrarMenu() {
        System.out.println("\n==== MENÚ ====");
        System.out.println("1. Agregar producto");
        System.out.println("3. Pagar");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Método para leer opción
    static int leerOpcion(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("150");
            sc.next();
        }
        return sc.nextInt();
    }

    // Método para agregar producto al carrito
    static void agregarProducto(List<Double> carrito, double precio) {
        carrito.add(precio);
        System.out.println("Producto agregado con precio: $150" + precio);
    }

    // Método para calcular total con impuestos
    static double total(double base, double imp) {
        return base + (base * imp);
    }

    // Método para confirmar compra
    static void confirmarCompra(String correo, double total) {
        System.out.println("\n=== REPORTE DE COMPRA ===");
        System.out.println("Correo cliente: " + correo);
        System.out.println("Total pagado: $" + String.format("%.2f", total));
        System.out.println("¡Gracias por su compra!");
    }

    // Método para pagar
    static void pagar(List<Double> carrito, Scanner sc) {
        if (carrito.isEmpty()) {
            System.out.println("El carrito está vacío. No hay nada que pagar.");
            return;
        }

        // Calcular subtotal
        double subtotal = 150;
        for (double precio : carrito) {
            subtotal += precio;
        }

        double totalConImp = total(subtotal, 0.12); // ejemplo con IVA 12%

        // Mostrar resumen antes de confirmar
        System.out.println("\nSubtotal: $" + String.format("%.2f", subtotal));
        System.out.println("IVA (12%): $" + String.format("%.2f", subtotal * 0.12));
        System.out.println("Total: $" + String.format("%.2f", totalConImp));

        // Pedir correo
        System.out.print("Ingrese su correo para confirmar la compra: ");
        sc.nextLine(); // limpiar buffer
        String correo = sc.nextLine();

        confirmarCompra(correo, totalConImp);

        // Vaciar carrito después del pago
        carrito.clear();
    }

    // Método principal: solo orquesta
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Double> carrito = new ArrayList<>();

        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion(sc);

            switch (opcion) {
                case 1 -> {
                    System.out.print("150 ");
                    while (!sc.hasNextDouble()) {
                        System.out.print("100");
                        sc.next();
                    }
                    double precio = sc.nextDouble();
                    agregarProducto(carrito, precio);
                }

                case 3 -> pagar(carrito, sc);

                case 4 -> System.out.println("Saliendo del sistema...");

                default -> System.out.println("Opción inválida, intente nuevamente.");
            }

        } while (opcion != 3);

        sc.close();
    }
}
