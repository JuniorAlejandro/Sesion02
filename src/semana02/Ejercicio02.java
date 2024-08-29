package semana02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el sueldo bruto:");
        double sueldoBruto = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento:");
        double porcentajeDescuento = scanner.nextDouble();

        double descuento = sueldoBruto * (porcentajeDescuento / 100);
        double subtotal = sueldoBruto - descuento;
        double impuesto = subtotal * 0.18; // Impuesto del 18%
        double total = subtotal - impuesto;

        System.out.println("\n--- BOLETA DE PAGO ---");
        System.out.println("Nombre: " + nombre.toUpperCase());
        System.out.println("Sueldo bruto: s/" + sueldoBruto);
        System.out.println("Descuento (" + porcentajeDescuento + "%): s/" + descuento);
        System.out.println("Subtotal: s/" + subtotal);
        System.out.println("Impuesto: s/" + impuesto);
        System.out.println("Total: s/" + total);
    }
}
