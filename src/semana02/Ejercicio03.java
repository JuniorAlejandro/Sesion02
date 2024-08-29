package semana02;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el tipo de operación (Depósito/Retiro):");
        String tipoOperacion = scanner.nextLine();

        System.out.println("Ingrese el monto de la operación:");
        double monto = scanner.nextDouble();

        System.out.println("Ingrese su número de cuenta:");
        long numeroCuenta = scanner.nextLong();

        System.out.println("Ingrese la fecha de operación (dd/MM/yyyy):");
        scanner.nextLine(); // Limpiar el buffer
        String fechaOperacion = scanner.nextLine();

        System.out.println("\n--- TICKET DE OPERACIÓN BANCARIA ---");
        System.out.println("Nombre: " + nombre.toUpperCase());
        System.out.println("Tipo de operación: " + tipoOperacion.toLowerCase());
        System.out.println("Monto: s/" + monto);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Fecha de operación: " + fechaOperacion);
    }
}
