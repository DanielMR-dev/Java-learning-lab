package projects.consolecalculator;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) { // Mientras isRunning sea verdadero, ejecuta este bloque.
            System.out.println();
            System.out.println("=== Console Calculator ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elije una opción: ");

            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("Saliendo de la calculadora...");
                isRunning = false;
            } else if (option >= 1  && option <= 5) {
                System.out.print("Ingresa el primer número: ");
                double firstNumber = scanner.nextDouble();

                System.out.print("Ingresa el segundo número: ");
                double secondNumber = scanner.nextDouble();

                double result;

                switch (option) {
                    case 1:
                        result = firstNumber + secondNumber;
                        System.out.println("Resultado de la suma: " + result);
                        break;
                    case 2:
                        result = firstNumber - secondNumber;
                        System.out.println("Resultado de la resta: " + result);
                        break;
                    case 3:
                        result = firstNumber * secondNumber;
                        System.out.println("Resultado de la multiplicacion: " + result);
                        break;
                    case 4:
                        if (secondNumber == 0) {
                            System.out.println("Error: no se puede dividir por cero.");
                        } else {
                            result = firstNumber / secondNumber;
                            System.out.println("Resultado de la division: " + result);
                        }
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
            } else {
                System.out.println("Opción inválida. Intenta nuevamente.");
            }
        }

        scanner.close();
    }
}
