package exercises;

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159; // final significa que el valor no debe de cambiar. Es una constante

        System.out.print("Ingresa el radio del Circulo: ");
        double radius = scanner.nextDouble();

        double area = PI * radius * radius;

        System.out.println("El área del círculo es: " + area);

        scanner.close();
    }
}
