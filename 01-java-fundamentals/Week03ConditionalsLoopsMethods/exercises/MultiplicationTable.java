package Week03ConditionalsLoopsMethods.exercises;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para mostrar su tabla de multiplicar: ");
        int number = scanner.nextInt();

        printMultiplicationTable(number);
        scanner.close();
    }

    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + (i * number));
        }
    }
}
