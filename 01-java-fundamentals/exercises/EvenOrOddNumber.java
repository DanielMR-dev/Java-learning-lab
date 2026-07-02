package exercises;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int number = scanner.nextInt();

        boolean isEven = number % 2 == 0;

        if (isEven) {
            System.out.println("El número " + number + " es par.");
        } else {
            System.out.println("El número " + number + " es impar.");
        }

        scanner.close();
    }
}
