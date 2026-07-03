package Week03ConditionalsLoopsMethods.examples;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Crear usuario");
        System.out.println("2. Actualizar usuario");
        System.out.println("3. Eliminar usuario");
        System.out.println("4. Salir");
        System.out.print("Ingresa una opción: ");
        int option = scanner.nextInt();
        scanner.close();

        switch (option) {
            case 1 -> System.out.println("Usuario creado");
            case 2 -> System.out.println("Usuario modificado");
            case 3 -> System.out.println("Usuario eliminado");
            case 4 -> System.out.println("Salir");
            default -> System.out.println("Opción inválida");
        }
    }
}
