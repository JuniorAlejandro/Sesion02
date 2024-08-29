package semana02;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el destino:");
        String destino = scanner.nextLine();

        System.out.println("Ingrese la fecha de salida (dd/MM/yyyy):");
        String fechaSalida = scanner.nextLine();

        System.out.println("Ingrese la hora de salida (HH:mm):");
        String horaSalida = scanner.nextLine();

        System.out.println("Ingrese el número de asiento:");
        int asiento = scanner.nextInt();

        System.out.println("Ingrese el precio del boleto:");
        double precio = scanner.nextDouble();

        System.out.println("\n--- BOLETO DE VIAJE INTERPROVINCIAL ---");
        System.out.println("Nombre: " + nombre.toUpperCase());
        System.out.println("Destino: " + destino.toLowerCase());
        System.out.println("Fecha de salida: " + fechaSalida);
        System.out.println("Hora de salida: " + horaSalida);
        System.out.println("Asiento: " + asiento);
        System.out.println("Precio: s/" + precio);
    }
}
