package exercises;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        double substraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;

        System.out.println("Suma: " + sum);
        System.out.println("Resta: " + substraction);
        System.out.println("Multiplicacion: " + multiplication);
        System.out.println("Division: " + division);

        scanner.close();
    }
}
