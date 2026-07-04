package Week03ConditionalsLoopsMethods.exercises;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para verificar si es primo: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " es primo");
        } else {
            System.out.println(number + " no es primo");
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if  (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
