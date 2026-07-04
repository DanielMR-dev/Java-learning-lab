package Week03ConditionalsLoopsMethods.exercises;

import java.util.Scanner;

public class MenuDrivenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            showMenu();
            option = readOption(scanner);
            executeOption(option, scanner);
        } while (option != 4);

        scanner.close();
    }

    public static void showMenu() {
        System.out.println("==============================");
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("==============================");
        System.out.println("1. Saludar");
        System.out.println("2. Mostrar fecha simulada");
        System.out.println("3. Calcular doble de un número");
        System.out.println("4. Salir");
        System.out.println("==============================");
    }

    public static int readOption(Scanner scanner) {
        System.out.println("Selecciona una opción: ");
        return scanner.nextInt();
    }

    public static void executeOption(int option, Scanner scanner) {
        switch (option) {
            case 1 -> greetUser(scanner);
            case 2 -> showSimulateDate();
            case 3 -> calculateDouble(scanner);
            case 4 -> showExitMessage();
            default -> showInvalidOptionMessage();
        }
    }

    public static void greetUser(Scanner scanner) {
        scanner.nextLine();

        System.out.println("Ingresa tu nombre: ");
        String username = scanner.nextLine();

        System.out.println("Hola " + username + ". Bienvenido a la aplicación.");
        System.out.println();
    }

    public static void showSimulateDate() {
        System.out.println("Fecha simulada: 04/07/1016");
        System.out.println();
    }

    public static void calculateDouble(Scanner scanner) {
        System.out.print("Ingresa un número: ");
        int number = scanner.nextInt();

        int result = getDouble(number);

        System.out.println("El doble de " + number + " es " + result);
        System.out.println();
    }

    public static int getDouble(int number) {
        return number * 2;
    }

    public static void showExitMessage() {
        System.out.println("Gracias por usar la aplicación. ¡Hasta luego!");
    }

    public static void showInvalidOptionMessage() {
        System.out.println("Opción inválida. Intenta nuevamente.");
        System.out.println();
    }
}
